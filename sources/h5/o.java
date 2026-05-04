package h5;

import com.baicizhan.app.biz.game.model.WordAccent;
import com.baicizhan.app.biz.game.model.WordOptionType;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGameSettingDefs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameSettingDefs.kt\ncom/baicizhan/app/biz/game/model/GameSettingDefs\n+ 2 GameSettingDefs.kt\ncom/baicizhan/app/biz/game/model/GameSettingDefsKt\n*L\n1#1,149:1\n41#2,6:150\n41#2,6:156\n*S KotlinDebug\n*F\n+ 1 GameSettingDefs.kt\ncom/baicizhan/app/biz/game/model/GameSettingDefs\n*L\n85#1:150,6\n98#1:156,6\n*E\n"})
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final o f58391a = new o();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final m0<WordAccent> f58392b = new a("accent", WordAccent.US);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final m0<WordOptionType> f58393c = new b("option", WordOptionType.Confusable);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nGameSettingDefs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameSettingDefs.kt\ncom/baicizhan/app/biz/game/model/GameSettingDefsKt$enumSettingDef$1\n+ 2 GameSettingDefs.kt\ncom/baicizhan/app/biz/game/model/GameSettingDefs\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n88#2:150\n89#2:152\n1#3:151\n*E\n"})
    public static final class a implements m0<WordAccent> {

        /* renamed from: a, reason: collision with root package name */
        public final String f58394a;

        /* renamed from: b, reason: collision with root package name */
        public final WordAccent f58395b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Enum f58396c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, Enum r22) {
            this.f58396c = r22;
            this.f58394a = str;
            this.f58395b = r22;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [com.baicizhan.app.biz.game.model.WordAccent, java.lang.Enum] */
        @Override // h5.m0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public WordAccent b(String str) {
            Object obj;
            if (str != null) {
                Iterator<E> it = WordAccent.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.g0.g(((WordAccent) obj).getValue(), str)) {
                        break;
                    }
                }
                WordAccent wordAccent = (WordAccent) obj;
                if (wordAccent != null) {
                    return wordAccent;
                }
            }
            return this.f58396c;
        }

        @Override // h5.m0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public WordAccent getDefaultValue() {
            return this.f58395b;
        }

        @Override // h5.m0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String a(WordAccent value) {
            kotlin.jvm.internal.g0.p(value, "value");
            return value.getValue();
        }

        @Override // h5.m0
        public String getKey() {
            return this.f58394a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nGameSettingDefs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameSettingDefs.kt\ncom/baicizhan/app/biz/game/model/GameSettingDefsKt$enumSettingDef$1\n+ 2 GameSettingDefs.kt\ncom/baicizhan/app/biz/game/model/GameSettingDefs\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n101#2:150\n102#2:152\n1#3:151\n*E\n"})
    public static final class b implements m0<WordOptionType> {

        /* renamed from: a, reason: collision with root package name */
        public final String f58397a;

        /* renamed from: b, reason: collision with root package name */
        public final WordOptionType f58398b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Enum f58399c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, Enum r22) {
            this.f58399c = r22;
            this.f58397a = str;
            this.f58398b = r22;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [com.baicizhan.app.biz.game.model.WordOptionType, java.lang.Enum] */
        @Override // h5.m0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public WordOptionType b(String str) {
            Object obj;
            if (str != null) {
                Iterator<E> it = WordOptionType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.g0.g(((WordOptionType) obj).getValue(), str)) {
                        break;
                    }
                }
                WordOptionType wordOptionType = (WordOptionType) obj;
                if (wordOptionType != null) {
                    return wordOptionType;
                }
            }
            return this.f58399c;
        }

        @Override // h5.m0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public WordOptionType getDefaultValue() {
            return this.f58398b;
        }

        @Override // h5.m0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String a(WordOptionType value) {
            kotlin.jvm.internal.g0.p(value, "value");
            return value.getValue();
        }

        @Override // h5.m0
        public String getKey() {
            return this.f58397a;
        }
    }

    @m80.k
    public final m0<WordAccent> a() {
        return f58392b;
    }

    @m80.k
    public final m0<WordOptionType> b() {
        return f58393c;
    }
}
