package yg;

import androidx.appcompat.app.AppCompatActivity;
import fd.w4;
import fd.z4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface i1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ z4 c(i1 i1Var, AppCompatActivity appCompatActivity, String str, int i11, int i12, String str2, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrainingItem");
        }
        if ((i14 & 16) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i14 & 32) != 0) {
            i13 = 50;
        }
        return i1Var.a(appCompatActivity, str, i11, i12, str3, i13);
    }

    @m80.k
    z4 a(@m80.k AppCompatActivity appCompatActivity, @m80.k String str, int i11, int i12, @m80.k String str2, int i13);

    @m80.k
    w4 b(int i11);
}
