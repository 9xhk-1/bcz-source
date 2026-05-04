package dh;

import com.baicizhan.online.user_study_api.ModuleResourceType;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47966a;

        static {
            int[] iArr = new int[ModuleResourceType.values().length];
            try {
                iArr[ModuleResourceType.WORD_LISTENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModuleResourceType.ENGLISH_RECOGNIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModuleResourceType.CHINESE_RECOGNIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ModuleResourceType.LISTENING_RECOGNIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ModuleResourceType.FILL_BLANK_SPELLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ModuleResourceType.COMBINE_SPELLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ModuleResourceType.ALL_SPELLING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ModuleResourceType.WORD_READING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f47966a = iArr;
        }
    }

    public static final int a(@m80.k ModuleResourceType moduleResourceType) {
        g0.p(moduleResourceType, "<this>");
        switch (a.f47966a[moduleResourceType.ordinal()]) {
            case 1:
                return 7;
            case 2:
                return 3;
            case 3:
                return 24;
            case 4:
                return 23;
            case 5:
                return 21;
            case 6:
                return 22;
            case 7:
                return 4;
            case 8:
                return 5;
            default:
                return 0;
        }
    }
}
