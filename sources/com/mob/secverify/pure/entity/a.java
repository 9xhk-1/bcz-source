package com.mob.secverify.pure.entity;

import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.utils.Hashon;
import gi.k;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a implements EverythingKeeper, Serializable {
    protected final String tag = getClass().getSimpleName();
    protected Hashon hashon = new Hashon();

    private void genCmUiElement(UiElement uiElement) {
        if (uiElement != null) {
            uiElement.setPrivacyUrl(k.f53782b);
            uiElement.setPrivacyName("中国移动认证服务条款");
            uiElement.setSlogan("中国移动提供认证服务");
        }
    }

    private void genCtUiElement(UiElement uiElement) {
        if (uiElement != null) {
            uiElement.setPrivacyUrl("https://e.189.cn/sdk/agreement/detail.do");
            uiElement.setPrivacyName("中国电信服务与隐私协议");
            uiElement.setSlogan("中国电信提供认证服务");
        }
    }

    private void genCuUiElement(UiElement uiElement) {
        if (uiElement != null) {
            uiElement.setPrivacyUrl(k.f53783c);
            uiElement.setPrivacyName("中国联通认证服务协议");
            uiElement.setSlogan("中国联通提供认证服务");
        }
    }

    public UiElement genUiElement() {
        UiElement uiElement = new UiElement();
        String str = com.mob.secverify.pure.core.ope.a.f40830a;
        if ("CMCC".equals(str)) {
            genCmUiElement(uiElement);
        }
        if ("CUCC".equals(str)) {
            genCuUiElement(uiElement);
        }
        if ("CTCC".equals(str)) {
            genCtUiElement(uiElement);
        }
        return uiElement;
    }

    public abstract String toJson();
}
