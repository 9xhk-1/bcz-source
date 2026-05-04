package com.tencent.liteav.audio.impl.route;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.audio.impl.route.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42982a;

        static {
            int[] iArr = new int[EnumC0508a.values().length];
            f42982a = iArr;
            try {
                iArr[EnumC0508a.VOICE_CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42982a[EnumC0508a.VOICE_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42982a[EnumC0508a.MEDIA_PLAY_AND_RECORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42982a[EnumC0508a.MEDIA_PLAYBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.audio.impl.route.a$a, reason: collision with other inner class name */
    public enum EnumC0508a {
        STOPPED,
        VOICE_CHAT,
        MEDIA_PLAY_AND_RECORD,
        MEDIA_PLAYBACK,
        VOICE_PLAYBACK,
        IDLE;

        public boolean a() {
            return this == MEDIA_PLAY_AND_RECORD || this == MEDIA_PLAYBACK;
        }

        public boolean b() {
            return this == VOICE_CHAT || this == VOICE_PLAYBACK;
        }
    }

    public static int a(EnumC0508a enumC0508a) {
        int i11 = AnonymousClass1.f42982a[enumC0508a.ordinal()];
        return (i11 == 1 || i11 == 2) ? 3 : 0;
    }
}
