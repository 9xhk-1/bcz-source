package com.baicizhan.app.biz.game.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import u30.k0;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nRoundCateFlags.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundCateFlags.kt\ncom/baicizhan/app/biz/game/model/RoundCateFlags\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,172:1\n3919#2:173\n4434#2,2:174\n*S KotlinDebug\n*F\n+ 1 RoundCateFlags.kt\ncom/baicizhan/app/biz/game/model/RoundCateFlags\n*L\n56#1:173\n56#1:174,2\n*E\n"})
/* loaded from: classes3.dex */
public final class RoundCateFlags {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f14167b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f14168c = g(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f14169d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14170e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14171f;

    /* renamed from: a, reason: collision with root package name */
    public final int f14172a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Flag {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Flag[] $VALUES;

        @k
        public static final a Companion;
        public static final Flag NEW_USER = new Flag("NEW_USER", 0, 1, "新用户局");
        public static final Flag PURCHASED_BOOK = new Flag("PURCHASED_BOOK", 1, 2, "已购词书局");
        private final int bit;

        @k
        private final String description;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public /* synthetic */ a(v vVar) {
                this();
            }

            @k
            public final Flag[] a() {
                return new Flag[]{Flag.NEW_USER, Flag.PURCHASED_BOOK};
            }

            public a() {
            }
        }

        private static final /* synthetic */ Flag[] $values() {
            return new Flag[]{NEW_USER, PURCHASED_BOOK};
        }

        static {
            Flag[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
            Companion = new a(null);
        }

        private Flag(String str, int i11, int i12, String str2) {
            this.bit = i12;
            this.description = str2;
        }

        @k
        public static m00.a<Flag> getEntries() {
            return $ENTRIES;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }

        public final int getBit() {
            return this.bit;
        }

        @k
        public final String getDescription() {
            return this.description;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRoundCateFlags.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundCateFlags.kt\ncom/baicizhan/app/biz/game/model/RoundCateFlags$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,172:1\n13216#2,3:173\n*S KotlinDebug\n*F\n+ 1 RoundCateFlags.kt\ncom/baicizhan/app/biz/game/model/RoundCateFlags$Companion\n*L\n96#1:173,3\n*E\n"})
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.app.biz.game.model.RoundCateFlags$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0203a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14173a;

            static {
                int[] iArr = new int[RoundCate.values().length];
                try {
                    iArr[RoundCate.NewUserGame.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RoundCate.Default.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14173a = iArr;
            }
        }

        public /* synthetic */ a(v vVar) {
            this();
        }

        public final int a(@k RoundCate roundCate) {
            g0.p(roundCate, "roundCate");
            int i11 = C0203a.f14173a[roundCate.ordinal()];
            if (i11 == 1) {
                return c();
            }
            if (i11 == 2) {
                return d();
            }
            throw new NoWhenBranchMatchedException();
        }

        public final int b() {
            return RoundCateFlags.f14171f;
        }

        public final int c() {
            return RoundCateFlags.f14169d;
        }

        public final int d() {
            return RoundCateFlags.f14168c;
        }

        public final int e() {
            return RoundCateFlags.f14170e;
        }

        public final int f(@k Flag... flags) {
            g0.p(flags, "flags");
            int i11 = 0;
            for (Flag flag : flags) {
                i11 |= flag.getBit();
            }
            return RoundCateFlags.g(i11);
        }

        public a() {
        }
    }

    static {
        Flag flag = Flag.NEW_USER;
        f14169d = g(flag.getBit());
        Flag flag2 = Flag.PURCHASED_BOOK;
        f14170e = g(flag2.getBit());
        f14171f = g(flag.getBit() | flag2.getBit());
    }

    public /* synthetic */ RoundCateFlags(int i11) {
        this.f14172a = i11;
    }

    public static final int e(int i11, @k Flag flag) {
        g0.p(flag, "flag");
        return g(i11 | flag.getBit());
    }

    public static final /* synthetic */ RoundCateFlags f(int i11) {
        return new RoundCateFlags(i11);
    }

    public static boolean h(int i11, Object obj) {
        return (obj instanceof RoundCateFlags) && i11 == ((RoundCateFlags) obj).u();
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    @k
    public static final List<Flag> j(int i11) {
        Flag[] values = Flag.values();
        ArrayList arrayList = new ArrayList();
        for (Flag flag : values) {
            if (l(i11, flag)) {
                arrayList.add(flag);
            }
        }
        return arrayList;
    }

    public static final boolean l(int i11, @k Flag flag) {
        g0.p(flag, "flag");
        return (i11 & flag.getBit()) != 0;
    }

    public static int m(int i11) {
        return Integer.hashCode(i11);
    }

    public static final boolean n(int i11) {
        return l(i11, Flag.NEW_USER);
    }

    public static final boolean o(int i11) {
        return l(i11, Flag.PURCHASED_BOOK);
    }

    public static final int p(int i11, @k Flag flag) {
        g0.p(flag, "flag");
        return g(i11 & (~flag.getBit()));
    }

    @k
    public static final String q(int i11) {
        String num = Integer.toString(i11, kotlin.text.a.a(2));
        g0.o(num, "toString(...)");
        return k0.m4(num, 8, '0');
    }

    @k
    public static final RoundCate r(int i11) {
        return n(i11) ? RoundCate.NewUserGame : RoundCate.Default;
    }

    public static String s(int i11) {
        return "RoundCateFlags(value=" + i11 + ')';
    }

    public static final int t(int i11, @k Flag flag) {
        g0.p(flag, "flag");
        return g(i11 ^ flag.getBit());
    }

    public boolean equals(Object obj) {
        return h(this.f14172a, obj);
    }

    public int hashCode() {
        return m(this.f14172a);
    }

    public final int k() {
        return this.f14172a;
    }

    public String toString() {
        return s(this.f14172a);
    }

    public final /* synthetic */ int u() {
        return this.f14172a;
    }

    public static int g(int i11) {
        return i11;
    }
}
