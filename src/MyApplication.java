import java.io.File;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import com.sun.glass.ui.Application;
import com.sun.glass.ui.CommonDialogs.ExtensionFilter;
import com.sun.glass.ui.CommonDialogs.FileChooserResult;
import com.sun.glass.ui.Cursor;
import com.sun.glass.ui.Pixels;
import com.sun.glass.ui.Robot;
import com.sun.glass.ui.Screen;
import com.sun.glass.ui.Size;
import com.sun.glass.ui.Timer;
import com.sun.glass.ui.View;
import com.sun.glass.ui.Window;

public class MyApplication extends Application implements my.package.ActivityLifecycleCallbacks{

    @Override
    public void onCreate() {
        super.onCreate();           
    }

    @Override
    public void onActivityStopped(Activity activity) {
        Log.i("Tracking Activity Stopped", activity.getLocalClassName());

    }

    @Override
    public void onActivityStarted(Activity activity) {
        Log.i("Tracking Activity Started", activity.getLocalClassName());

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Log.i("Tracking Activity SaveInstanceState", activity.getLocalClassName());
    }

    @Override
    public void onActivityResumed(Activity activity) {
        Log.i("Tracking Activity Resumed", activity.getLocalClassName());
    }

    @Override
    public void onActivityPaused(Activity activity) {
        Log.i("Tracking Activity Paused", activity.getLocalClassName());
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        Log.i("Tracking Activity Destroyed", activity.getLocalClassName());
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Log.i("Tracking Activity Created", activity.getLocalClassName());
    }

	@Override
	protected Object _enterNestedEventLoop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int _getKeyCodeForChar(char arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void _invokeAndWait(Runnable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void _invokeLater(Runnable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void _leaveNestedEventLoop(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean _supportsTransparentWindows() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean _supportsUnifiedWindows() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cursor createCursor(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cursor createCursor(int arg0, int arg1, Pixels arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pixels createPixels(int arg0, int arg1, ByteBuffer arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pixels createPixels(int arg0, int arg1, IntBuffer arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pixels createPixels(int arg0, int arg1, IntBuffer arg2, float arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Robot createRobot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timer createTimer(Runnable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View createView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Window createWindow(long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Window createWindow(Window arg0, Screen arg1, int arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void runLoop(Runnable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected FileChooserResult staticCommonDialogs_showFileChooser(
			Window arg0, String arg1, String arg2, String arg3, int arg4,
			boolean arg5, ExtensionFilter[] arg6, int arg7) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected File staticCommonDialogs_showFolderChooser(Window arg0,
			String arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Size staticCursor_getBestSize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void staticCursor_setVisible(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected int staticPixels_getNativeFormat() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected Screen[] staticScreen_getScreens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected double staticScreen_getVideoRefreshPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticTimer_getMaxPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticTimer_getMinPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticView_getMultiClickMaxX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticView_getMultiClickMaxY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected long staticView_getMultiClickTime() {
		// TODO Auto-generated method stub
		return 0;
	}
}
