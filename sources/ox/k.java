package ox;

import a00.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParserDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/OrGrammar\n+ 2 ParserDsl.kt\nio/ktor/http/parsing/ParserDslKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n57#2,2:64\n59#2,2:67\n61#2:70\n1863#3:66\n1864#3:69\n*S KotlinDebug\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/OrGrammar\n*L\n33#1:64,2\n33#1:67,2\n33#1:70\n33#1:66\n33#1:69\n*E\n"})
/* loaded from: classes8.dex */
public final class k extends e implements c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<e> f78477a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k List<? extends e> sourceGrammars) {
        super(null);
        g0.p(sourceGrammars, "sourceGrammars");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sourceGrammars) {
            if (obj instanceof k) {
                m0.s0(arrayList, ((c) obj).a());
            } else {
                arrayList.add(obj);
            }
        }
        this.f78477a = arrayList;
    }

    @Override // ox.c
    @m80.k
    public List<e> a() {
        return this.f78477a;
    }
}
