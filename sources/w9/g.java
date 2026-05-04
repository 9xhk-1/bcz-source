package w9;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.TypeConverter;
import com.baicizhan.client.business.managers.experience.data.db.AssembleBehaviourType;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f96004a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96005a;

        static {
            int[] iArr = new int[AssembleBehaviourType.values().length];
            try {
                iArr[AssembleBehaviourType.FirstRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssembleBehaviourType.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssembleBehaviourType.FirstWrong.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssembleBehaviourType.Wrong.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f96005a = iArr;
        }
    }

    @TypeConverter
    @m80.k
    public final AssembleBehaviourType a(int i11) {
        if (i11 == 1) {
            return AssembleBehaviourType.FirstRight;
        }
        if (i11 == 2) {
            return AssembleBehaviourType.Right;
        }
        if (i11 == 3) {
            return AssembleBehaviourType.FirstWrong;
        }
        if (i11 == 4) {
            return AssembleBehaviourType.Wrong;
        }
        AssembleBehaviourType assembleBehaviourType = AssembleBehaviourType.Nothing;
        qb.c.d(h.f96006a, "TYPE ERROR !!!!!!!!!!!!!!", new Object[0]);
        return assembleBehaviourType;
    }

    @TypeConverter
    public final int b(@m80.k AssembleBehaviourType value) {
        g0.p(value, "value");
        int i11 = a.f96005a[value.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        return -1;
                    }
                }
            }
        }
        return i12;
    }
}
