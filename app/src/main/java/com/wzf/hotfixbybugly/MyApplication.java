package com.wzf.hotfixbybugly;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * @Description:
 * @author: wangzhenfei
 * @date: 2017-06-16 18:53
 */

public class MyApplication extends TinkerApplication {

    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.wzf.hotfixbybugly.MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
