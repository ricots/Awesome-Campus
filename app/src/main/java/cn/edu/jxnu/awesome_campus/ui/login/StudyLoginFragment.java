package cn.edu.jxnu.awesome_campus.ui.login;

import cn.edu.jxnu.awesome_campus.InitApp;
import cn.edu.jxnu.awesome_campus.R;
import cn.edu.jxnu.awesome_campus.ui.base.BaseFragment;

/**
 * Created by MummyDing on 16-2-1.
 * GitHub: https://github.com/MummyDing
 * Blog: http://blog.csdn.net/mummyding
 */
public class StudyLoginFragment extends BaseFragment {
    @Override
    protected void init() {

    }

    @Override
    public String getTitle() {
        return InitApp.AppContext.getString(R.string.study);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.layout_login_study;
    }
}