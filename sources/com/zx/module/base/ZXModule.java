package com.zx.module.base;

import com.zx.module.context.ContextHolder;
import com.zx.module.exception.ZXModuleInvokeException;
import com.zx.module.exception.ZXModuleOnCreateException;
import com.zx.module.exception.ZXModuleOnDestroyException;
import com.zx.module.exception.ZXModuleStartException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ZXModule {
    String getModuleIdentifier();

    String getModuleVersion();

    String invoke(String str, String str2) throws ZXModuleInvokeException;

    String invokeAsync(String str, String str2, Callback callback) throws ZXModuleInvokeException;

    void onCreate(ContextHolder contextHolder) throws ZXModuleOnCreateException;

    void onDestroy() throws ZXModuleOnDestroyException;

    void setMessageListener(Listener listener);

    void start() throws ZXModuleStartException;
}
