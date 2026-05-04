package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements x00.l<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // x00.l
    public final ViewParent invoke(@m80.k ViewParent viewParent) {
        return viewParent.getParent();
    }
}
