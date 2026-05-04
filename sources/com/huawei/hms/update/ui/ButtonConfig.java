package com.huawei.hms.update.ui;

import android.content.Context;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ButtonConfig {

    /* renamed from: a, reason: collision with root package name */
    int f36537a;

    /* renamed from: b, reason: collision with root package name */
    int f36538b;

    /* renamed from: c, reason: collision with root package name */
    int f36539c;

    /* renamed from: d, reason: collision with root package name */
    int f36540d;

    /* renamed from: e, reason: collision with root package name */
    int f36541e;

    /* renamed from: f, reason: collision with root package name */
    Level f36542f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Level {
        STRONG,
        ERROR,
        NORMAL
    }

    private ButtonConfig() {
    }

    public static ButtonConfig createDefault(Context context) {
        ButtonConfig buttonConfig = new ButtonConfig();
        if (context != null) {
            buttonConfig.f36537a = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_pressed"));
            buttonConfig.f36538b = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_normal"));
            buttonConfig.f36539c = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_text_color"));
            buttonConfig.f36540d = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_text_color"));
            buttonConfig.f36541e = context.getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_text_size"));
        }
        buttonConfig.f36542f = Level.NORMAL;
        return buttonConfig;
    }

    public static ButtonConfig createWatch(Context context) {
        ButtonConfig buttonConfig = new ButtonConfig();
        if (context != null) {
            buttonConfig.f36537a = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_watch_dialog_button_pressed"));
            buttonConfig.f36538b = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_watch_dialog_button_normal"));
            buttonConfig.f36539c = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_watch_dialog_button_text_color"));
            buttonConfig.f36540d = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_watch_dialog_button_text_color"));
            buttonConfig.f36541e = context.getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_text_size"));
        }
        buttonConfig.f36542f = Level.NORMAL;
        return buttonConfig;
    }
}
