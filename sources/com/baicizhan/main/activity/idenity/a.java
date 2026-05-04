package com.baicizhan.main.activity.idenity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.UserRecord;
import i9.f;
import java.util.Calendar;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C0286a f18511a = new C0286a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f18512b = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGradeUpgradeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GradeUpgradeHelper.kt\ncom/baicizhan/main/activity/idenity/GradeUpgradeHelper$Companion\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,41:1\n35#2:42\n35#2:43\n*S KotlinDebug\n*F\n+ 1 GradeUpgradeHelper.kt\ncom/baicizhan/main/activity/idenity/GradeUpgradeHelper$Companion\n*L\n26#1:42\n27#1:43\n*E\n"})
    /* renamed from: com.baicizhan.main.activity.idenity.a$a, reason: collision with other inner class name */
    public static final class C0286a {
        public /* synthetic */ C0286a(v vVar) {
            this();
        }

        public final boolean a() {
            UserRecord.Role role;
            boolean z11 = f.d(pb.a.a(), f.f60387n0) != Calendar.getInstance().get(1);
            UserRecord p11 = x.r().p();
            int i11 = -1;
            if (p11 != null && (role = p11.getRole()) != null) {
                i11 = role.grade;
            }
            return b() && z11 && 1 <= i11 && i11 < 18;
        }

        public final boolean b() {
            return Calendar.getInstance().get(2) == 6;
        }

        public final void c() {
            f.k(pb.a.a(), f.f60387n0, Calendar.getInstance().get(1));
        }

        public C0286a() {
        }
    }
}
