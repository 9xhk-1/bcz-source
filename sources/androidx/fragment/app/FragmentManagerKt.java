package androidx.fragment.app;

import androidx.annotation.MainThread;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FragmentManagerKt {
    public static final void commit(@m80.k FragmentManager fragmentManager, boolean z11, @m80.k x00.l<? super FragmentTransaction, g2> lVar) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        lVar.invoke(beginTransaction);
        if (z11) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        lVar.invoke(beginTransaction);
        if (z11) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    @MainThread
    public static final void commitNow(@m80.k FragmentManager fragmentManager, boolean z11, @m80.k x00.l<? super FragmentTransaction, g2> lVar) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        lVar.invoke(beginTransaction);
        if (z11) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        lVar.invoke(beginTransaction);
        if (z11) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    @yz.n(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void transaction(@m80.k FragmentManager fragmentManager, boolean z11, boolean z12, @m80.k x00.l<? super FragmentTransaction, g2> lVar) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        lVar.invoke(beginTransaction);
        if (z11) {
            if (z12) {
                beginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                beginTransaction.commitNow();
                return;
            }
        }
        if (z12) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z11, boolean z12, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        lVar.invoke(beginTransaction);
        if (z11) {
            if (z12) {
                beginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                beginTransaction.commitNow();
                return;
            }
        }
        if (z12) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }
}
