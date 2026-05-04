package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements m0<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final String f58402a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f58403b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f58404c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f58405d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f58406e;

        public a(String str, boolean z11, String str2, String str3) {
            this.f58404c = z11;
            this.f58405d = str2;
            this.f58406e = str3;
            this.f58402a = str;
            this.f58403b = z11;
        }

        @Override // h5.m0
        public /* bridge */ /* synthetic */ String a(Boolean bool) {
            return e(bool.booleanValue());
        }

        @Override // h5.m0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean b(String str) {
            return Boolean.valueOf(kotlin.jvm.internal.g0.g(str, this.f58405d) ? true : kotlin.jvm.internal.g0.g(str, this.f58406e) ? false : this.f58404c);
        }

        @Override // h5.m0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean getDefaultValue() {
            return Boolean.valueOf(this.f58403b);
        }

        public String e(boolean z11) {
            return z11 ? this.f58405d : this.f58406e;
        }

        @Override // h5.m0
        public String getKey() {
            return this.f58402a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Incorrect field signature: TT; */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nGameSettingDefs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameSettingDefs.kt\ncom/baicizhan/app/biz/game/model/GameSettingDefsKt$enumSettingDef$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
    public static final class b<T> implements m0<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f58407a;

        /* renamed from: b, reason: collision with root package name */
        public final Enum f58408b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Enum f58409c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, String> f58410d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.l<String, T> f58411e;

        /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Lx00/l<-TT;Ljava/lang/String;>;Lx00/l<-Ljava/lang/String;+TT;>;)V */
        public b(String str, Enum r22, x00.l lVar, x00.l lVar2) {
            this.f58409c = r22;
            this.f58410d = lVar;
            this.f58411e = lVar2;
            this.f58407a = str;
            this.f58408b = r22;
        }

        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
        @Override // h5.m0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Enum b(String str) {
            Enum r22;
            return (str == null || (r22 = (Enum) this.f58411e.invoke(str)) == null) ? this.f58409c : r22;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // h5.m0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Enum getDefaultValue() {
            return this.f58408b;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/String; */
        @Override // h5.m0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String a(Enum value) {
            kotlin.jvm.internal.g0.p(value, "value");
            return this.f58410d.invoke(value);
        }

        @Override // h5.m0
        public String getKey() {
            return this.f58407a;
        }
    }

    @m80.k
    public static final m0<Boolean> a(@m80.k String key, boolean z11, @m80.k String trueValue, @m80.k String falseValue) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(trueValue, "trueValue");
        kotlin.jvm.internal.g0.p(falseValue, "falseValue");
        return new a(key, z11, trueValue, falseValue);
    }

    public static /* synthetic */ m0 b(String str, boolean z11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = k3.u0.f65628b;
        }
        if ((i11 & 8) != 0) {
            str3 = "disable";
        }
        return a(str, z11, str2, str3);
    }

    public static final /* synthetic */ <T extends Enum<T>> m0<T> c(String key, T t11, x00.l<? super T, String> toValue, x00.l<? super String, ? extends T> fromValue) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(t11, "default");
        kotlin.jvm.internal.g0.p(toValue, "toValue");
        kotlin.jvm.internal.g0.p(fromValue, "fromValue");
        kotlin.jvm.internal.g0.w();
        return new b(key, t11, toValue, fromValue);
    }
}
