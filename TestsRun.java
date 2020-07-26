package Tests;

import java.util.List;

import com.glowfishlabs.dal.models.TestData;
import com.glowfishlabs.utils.JsonUtil;
import com.glowfishlabs.zephyr.ZephyrUtil;
import com.glowfishlabs.zephyr.zPreferences.ZephyrConfigs;
import com.glowfishlabs.zephyr.zPreferences.ZephyrWebConfigs;
import com.glowfishlabs.zephyr.zdal.zModels.Cycle;
import com.glowfishlabs.zephyr.zdal.zModels.ZephyrTestStep;
import org.testng.annotations.Test;
import org.testng.TestNG.*;

//import com.carswitch.automation.zephyr.ZephyrUtil;
//import com.carswitch.automation.zephyr.Preferences.ZephyrConfigs;
//import com.carswitch.automation.zephyr.Preferences.ZephyrWebConfigs;
//import com.carswitch.automation.zephyr.dal.Models.Cycle;
//import com.carswitch.automation.zephyr.dal.Models.ZephyrTestStep;
import com.glowfishlabs.*;
import Setup.CS_CONSTANTS;
import Setup.Setup_2;
import Setup.Utility;

public class TestsRun {
	public static String Name=null;
	public static String Data=null;
	@Test
	public void SomkeTestsRun() throws Throwable{

		ZephyrConfigs.init(
				CS_CONSTANTS.ACCESS_KEY,
				CS_CONSTANTS.SECRET_KEY,
				CS_CONSTANTS.PROJECT_ID,
				CS_CONSTANTS.CYCLE_ID,
				CS_CONSTANTS.VERSION_ID);

		ZephyrWebConfigs.init(
				CS_CONSTANTS.ZEPHYR_BASE_URL,
				CS_CONSTANTS.JIRA_BASE_URL,
				CS_CONSTANTS.CS_USER_NAME,

				CS_CONSTANTS.CS_USER_PASSWORD);

		Cycle cycleInfo = ZephyrUtil.getCycleInfo();
		boolean stepExecutionStatus = true;



		for(int i = 5 ; i < 6; i++)		//	cycleInfo.getSearchobjectlist().size()
		{




			try
			{







				String issueExecutionStatus = ZephyrUtil.STATUS_PASSED;
				String issueKey = cycleInfo.getSearchobjectlist().get(i).getIssuekey();
				int issueId = cycleInfo.getSearchobjectlist().get(i).getExecution().getIssueid();

				List<ZephyrTestStep> testStepList = ZephyrUtil.getTestSteps(issueId);
				String executionId = ZephyrUtil.getExecutionId(String.valueOf(issueId));
				ZephyrUtil.updateIssue(issueId, executionId, ZephyrUtil.STATUS_UNEXECUTED);

System.out.println("Yankeeeeeeeeee");
				Setup_2.SetUpTestNG();

				for(int stepIndex = 0 ; stepIndex < testStepList.size() ; stepIndex++)
				{
					ZephyrTestStep testStep = testStepList.get(stepIndex);
					String testData = testStep.getData();
					String[] testDataList = testData.split(",");
					String testStepName = testDataList[0].substring(6);
					System.out.println("Yankee");
					String testStepData = "";
					System.out.println("This is njfjwfn"+testStepName);
					Data=testData.toString();
					Name=testStep.getStep().toString();

System.out.println("Yen"+Data);
System.out.println("Yen"+Name);

					try { testStepData = testDataList[1].substring(7);

					} catch (Exception e){System.out.println("\n\n Test Data Exception: " + e.getMessage() + "");}



System.out.println(testStepData.toString());
					stepExecutionStatus = Utility.ExecuteStep(issueKey, testStepName, testStepData);

					if(!stepExecutionStatus)
					{
						//String defectKey = ZephyrUtil.getDefectKeyForStep(executionId, testStepList.get(stepIndex).getIssueid(), stepIndex);
						//String defectId = ZephyrUtil.logDefect(defectKey, null, testStepList.get(stepIndex));


						ZephyrUtil.updateStep(issueId, executionId, stepIndex, null, ZephyrUtil.STATUS_FAILED);
						issueExecutionStatus = ZephyrUtil.STATUS_FAILED;
					}
					else
					{
						ZephyrUtil.updateStep(issueId, executionId, stepIndex, null, ZephyrUtil.STATUS_PASSED);
					}
				}

				System.out.println("Faileeeeeeeeeeeeeeeeeeed");
				ZephyrUtil.updateIssue(issueId, executionId, issueExecutionStatus);
				Setup_2.issueStatus = issueExecutionStatus;
				Setup_2.driver.quit();
				Setup_2.TearDownTestNG();
			}
			catch (Exception ex)
			{
				System.out.println("Exception: " + ex.getMessage());
			}
		}		
	}


	public void executeIssue(int issueId){
		int prereqIssueId = ZephyrUtil.getPrereqIssueId(issueId);
		if(prereqIssueId > 0)
			executeIssue(prereqIssueId);

		String issueStatus = ZephyrUtil.STATUS_PASSED;
		String executionId = ZephyrUtil.getExecutionId(String.valueOf(issueId));
		List<ZephyrTestStep> testStepList = ZephyrUtil.getTestSteps(issueId);

		ZephyrUtil.updateIssue(issueId, executionId, ZephyrUtil.STATUS_UNEXECUTED);
		for(int stepIndex = 0 ; stepIndex < testStepList.size() ; stepIndex++){
			ZephyrUtil.updateStep(issueId, executionId, stepIndex, null, ZephyrUtil.STATUS_UNEXECUTED);

			boolean status = true;
			//Outcome stepOutcome = ZephyrUtil.executeStep(stepIndex, executionId, testStepList.get(stepIndex));

			if(status)
			{
				String defectKey = ZephyrUtil.getDefectKeyForStep(executionId, testStepList.get(stepIndex).getIssueid(), stepIndex);
			//	String defectId = ZephyrUtil.logDefect(defectKey, testStepList.get(stepIndex).getStep(), "");
			//	ZephyrUtil.updateStep(issueId, executionId, stepIndex, defectId, ZephyrUtil.STATUS_FAILED);
				issueStatus = ZephyrUtil.STATUS_FAILED;
				System.out.println("Noooooooo");
			}
			else
			{
				ZephyrUtil.updateStep(issueId, executionId, stepIndex, null, ZephyrUtil.STATUS_PASSED);
				/*boolean passed = AutomationTests.run(testStepList.get(stepIndex), stepOutcome);
                if(!passed){
                    String defectKey = ZephyrUtil.getDefectKeyForStep(executionId, testStepList.get(stepIndex).getIssueid(), stepIndex);
                    String defectId = ZephyrUtil.logAutomationDefect(defectKey, testStepList.get(stepIndex));
                    ZephyrUtil.updateStep(issueId, executionId, stepIndex, defectId, ZephyrUtil.STATUS_FAILED);
                    issueStatus = ZephyrUtil.STATUS_FAILED;
                }*/
			}
		}
		ZephyrUtil.updateIssue(issueId, executionId, issueStatus);
	}

	//@Test
	public static void resetTestCases()
	{
		Cycle cycleInfo = ZephyrUtil.getCycleInfo();

		for(int i = 0 ; i < cycleInfo.getSearchobjectlist().size() ; i++)
		{
			int issueId = cycleInfo.getSearchobjectlist().get(i).getExecution().getIssueid();

			List<ZephyrTestStep> testStepList = ZephyrUtil.getTestSteps(issueId);
			String executionId = ZephyrUtil.getExecutionId(String.valueOf(issueId));
			ZephyrUtil.updateIssue(issueId, executionId, ZephyrUtil.STATUS_UNEXECUTED);            

			for(int stepIndex = 0 ; stepIndex < testStepList.size() ; stepIndex++)
			{
				ZephyrTestStep testStep = testStepList.get(stepIndex);
				System.out.println("\n Test Step: " + testStep.getStep());
				System.out.println(" Test Step Data: " + testStep.getData());
				ZephyrUtil.updateStep(issueId, executionId, stepIndex, null, ZephyrUtil.STATUS_UNEXECUTED);
			}            
		}

	}

}
