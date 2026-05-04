package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class BeanProperty {
    MemberBox getter;
    MemberBox setter;
    NativeJavaMethod setters;

    public BeanProperty(MemberBox memberBox, MemberBox memberBox2, NativeJavaMethod nativeJavaMethod) {
        this.getter = memberBox;
        this.setter = memberBox2;
        this.setters = nativeJavaMethod;
    }
}
