package library.android.ssociety.bloggreendao.test;

import library.android.ssociety.bloggreendao.MainActivity;
import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


public class robotiumfirsttest extends ActivityInstrumentationTestCase2<MainActivity> {
  	private Solo solo;
  	
  	public robotiumfirsttest() {
		super(MainActivity.class);
  	}

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
        //Wait for activity: 'library.android.ssociety.bloggreendao.MainActivity'
		solo.waitForActivity(library.android.ssociety.bloggreendao.MainActivity.class, 2000);
        //Take screenshot
        solo.takeScreenshot();
	}
}
