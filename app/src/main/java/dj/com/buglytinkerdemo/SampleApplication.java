package dj.com.buglytinkerdemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by dengjun on 2017/7/7.
 * TODO
 */

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "dj.com.buglytinkerdemo.MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}