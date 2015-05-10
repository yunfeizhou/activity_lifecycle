public class OtherApplication extends ZHOUYFActivity {

    protected MyApplication nMyApplication;

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        nMyApplication = (MyApplication) getApplication();
        nMyApplication.onActivityCreated(this, savedInstanceState);
    }

    protected void onResume() {
        // TODO Auto-generated method stub
        nMyApplication.onActivityResumed(this);
        super.onResume();

    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        nMyApplication.onActivityPaused(this);
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        nMyApplication.onActivityDestroyed(this);
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        nMyApplication.onActivityStarted(this);
        super.onStart();
    }

    @Override
    protected void onStop() {
        nMyApplication.onActivityStopped(this);
        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        nMyApplication.onActivitySaveInstanceState(this, outState);
        super.onSaveInstanceState(outState);
    }   
}
