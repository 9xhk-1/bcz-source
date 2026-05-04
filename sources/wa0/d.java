package wa0;

import a00.h0;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import org.koin.core.definition.Kind;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt\n+ 2 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 3 Module.kt\norg/koin/core/module/Module\n+ 4 Module.kt\norg/koin/core/module/ModuleKt\n+ 5 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,219:1\n42#2,5:220\n42#2,5:244\n42#2,5:273\n42#2,5:302\n42#2,5:331\n42#2,5:360\n42#2,5:389\n42#2,5:418\n42#2,5:447\n42#2,5:476\n42#2,5:505\n42#2,5:534\n42#2,5:563\n42#2,5:592\n42#2,5:621\n42#2,5:650\n42#2,5:679\n42#2,5:708\n42#2,5:737\n42#2,5:766\n42#2,5:795\n42#2,5:824\n42#2,5:853\n162#3:225\n163#3,2:242\n162#3:249\n163#3,2:266\n162#3:268\n163#3,2:271\n162#3:278\n163#3,2:295\n162#3:297\n163#3,2:300\n162#3:307\n163#3,2:324\n162#3:326\n163#3,2:329\n162#3:336\n163#3,2:353\n162#3:355\n163#3,2:358\n162#3:365\n163#3,2:382\n162#3:384\n163#3,2:387\n162#3:394\n163#3,2:411\n162#3:413\n163#3,2:416\n162#3:423\n163#3,2:440\n162#3:442\n163#3,2:445\n162#3:452\n163#3,2:469\n162#3:471\n163#3,2:474\n162#3:481\n163#3,2:498\n162#3:500\n163#3,2:503\n162#3:510\n163#3,2:527\n162#3:529\n163#3,2:532\n162#3:539\n163#3,2:556\n162#3:558\n163#3,2:561\n162#3:568\n163#3,2:585\n162#3:587\n163#3,2:590\n162#3:597\n163#3,2:614\n162#3:616\n163#3,2:619\n162#3:626\n163#3,2:643\n162#3:645\n163#3,2:648\n162#3:655\n163#3,2:672\n162#3:674\n163#3,2:677\n162#3:684\n163#3,2:701\n162#3:703\n163#3,2:706\n162#3:713\n163#3,2:730\n162#3:732\n163#3,2:735\n162#3:742\n163#3,2:759\n162#3:761\n163#3,2:764\n162#3:771\n163#3,2:788\n162#3:790\n163#3,2:793\n162#3:800\n163#3,2:817\n162#3:819\n163#3,2:822\n162#3:829\n163#3,2:846\n162#3:848\n163#3,2:851\n162#3:858\n163#3,2:875\n162#3:877\n163#3,2:880\n212#4:226\n213#4:241\n212#4:250\n213#4:265\n212#4,2:269\n212#4:279\n213#4:294\n212#4,2:298\n212#4:308\n213#4:323\n212#4,2:327\n212#4:337\n213#4:352\n212#4,2:356\n212#4:366\n213#4:381\n212#4,2:385\n212#4:395\n213#4:410\n212#4,2:414\n212#4:424\n213#4:439\n212#4,2:443\n212#4:453\n213#4:468\n212#4,2:472\n212#4:482\n213#4:497\n212#4,2:501\n212#4:511\n213#4:526\n212#4,2:530\n212#4:540\n213#4:555\n212#4,2:559\n212#4:569\n213#4:584\n212#4,2:588\n212#4:598\n213#4:613\n212#4,2:617\n212#4:627\n213#4:642\n212#4,2:646\n212#4:656\n213#4:671\n212#4,2:675\n212#4:685\n213#4:700\n212#4,2:704\n212#4:714\n213#4:729\n212#4,2:733\n212#4:743\n213#4:758\n212#4,2:762\n212#4:772\n213#4:787\n212#4,2:791\n212#4:801\n213#4:816\n212#4,2:820\n212#4:830\n213#4:845\n212#4,2:849\n212#4:859\n213#4:874\n212#4,2:878\n115#5,14:227\n115#5,14:251\n115#5,14:280\n115#5,14:309\n115#5,14:338\n115#5,14:367\n115#5,14:396\n115#5,14:425\n115#5,14:454\n115#5,14:483\n115#5,14:512\n115#5,14:541\n115#5,14:570\n115#5,14:599\n115#5,14:628\n115#5,14:657\n115#5,14:686\n115#5,14:715\n115#5,14:744\n115#5,14:773\n115#5,14:802\n115#5,14:831\n115#5,14:860\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt\n*L\n42#1:220,5\n50#1:244,5\n58#1:273,5\n66#1:302,5\n74#1:331,5\n82#1:360,5\n90#1:389,5\n98#1:418,5\n106#1:447,5\n114#1:476,5\n122#1:505,5\n130#1:534,5\n138#1:563,5\n146#1:592,5\n154#1:621,5\n162#1:650,5\n170#1:679,5\n178#1:708,5\n186#1:737,5\n194#1:766,5\n202#1:795,5\n210#1:824,5\n218#1:853,5\n42#1:225\n42#1:242,2\n50#1:249\n50#1:266,2\n50#1:268\n50#1:271,2\n58#1:278\n58#1:295,2\n58#1:297\n58#1:300,2\n66#1:307\n66#1:324,2\n66#1:326\n66#1:329,2\n74#1:336\n74#1:353,2\n74#1:355\n74#1:358,2\n82#1:365\n82#1:382,2\n82#1:384\n82#1:387,2\n90#1:394\n90#1:411,2\n90#1:413\n90#1:416,2\n98#1:423\n98#1:440,2\n98#1:442\n98#1:445,2\n106#1:452\n106#1:469,2\n106#1:471\n106#1:474,2\n114#1:481\n114#1:498,2\n114#1:500\n114#1:503,2\n122#1:510\n122#1:527,2\n122#1:529\n122#1:532,2\n130#1:539\n130#1:556,2\n130#1:558\n130#1:561,2\n138#1:568\n138#1:585,2\n138#1:587\n138#1:590,2\n146#1:597\n146#1:614,2\n146#1:616\n146#1:619,2\n154#1:626\n154#1:643,2\n154#1:645\n154#1:648,2\n162#1:655\n162#1:672,2\n162#1:674\n162#1:677,2\n170#1:684\n170#1:701,2\n170#1:703\n170#1:706,2\n178#1:713\n178#1:730,2\n178#1:732\n178#1:735,2\n186#1:742\n186#1:759,2\n186#1:761\n186#1:764,2\n194#1:771\n194#1:788,2\n194#1:790\n194#1:793,2\n202#1:800\n202#1:817,2\n202#1:819\n202#1:822,2\n210#1:829\n210#1:846,2\n210#1:848\n210#1:851,2\n218#1:858\n218#1:875,2\n218#1:877\n218#1:880,2\n42#1:226\n42#1:241\n50#1:250\n50#1:265\n50#1:269,2\n58#1:279\n58#1:294\n58#1:298,2\n66#1:308\n66#1:323\n66#1:327,2\n74#1:337\n74#1:352\n74#1:356,2\n82#1:366\n82#1:381\n82#1:385,2\n90#1:395\n90#1:410\n90#1:414,2\n98#1:424\n98#1:439\n98#1:443,2\n106#1:453\n106#1:468\n106#1:472,2\n114#1:482\n114#1:497\n114#1:501,2\n122#1:511\n122#1:526\n122#1:530,2\n130#1:540\n130#1:555\n130#1:559,2\n138#1:569\n138#1:584\n138#1:588,2\n146#1:598\n146#1:613\n146#1:617,2\n154#1:627\n154#1:642\n154#1:646,2\n162#1:656\n162#1:671\n162#1:675,2\n170#1:685\n170#1:700\n170#1:704,2\n178#1:714\n178#1:729\n178#1:733,2\n186#1:743\n186#1:758\n186#1:762,2\n194#1:772\n194#1:787\n194#1:791,2\n202#1:801\n202#1:816\n202#1:820,2\n210#1:830\n210#1:845\n210#1:849,2\n218#1:859\n218#1:874\n218#1:878,2\n42#1:227,14\n50#1:251,14\n58#1:280,14\n66#1:309,14\n74#1:338,14\n82#1:367,14\n90#1:396,14\n98#1:425,14\n106#1:454,14\n114#1:483,14\n122#1:512,14\n130#1:541,14\n138#1:570,14\n146#1:599,14\n154#1:628,14\n162#1:657,14\n170#1:686,14\n178#1:715,14\n186#1:744,14\n194#1:773,14\n202#1:802,14\n210#1:831,14\n218#1:860,14\n*E\n"})
/* loaded from: classes9.dex */
public final class d {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$10\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n99#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$10\n*L\n114#1:220\n114#1:221,5\n*E\n"})
    public static final class a<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.w<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f96049a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> wVar) {
            this.f96049a = wVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.w<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> wVar = this.f96049a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            return wVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$11\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n106#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$11\n*L\n122#1:220\n122#1:221,5\n*E\n"})
    public static final class b<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.b<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> f96050a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.b<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> bVar) {
            this.f96050a = bVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.b<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> bVar = this.f96050a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            return bVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$12\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n113#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$12\n*L\n130#1:220\n130#1:221,5\n*E\n"})
    public static final class c<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.c<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> f96051a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(x00.c<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> cVar) {
            this.f96051a = cVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.c<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> cVar = this.f96051a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            return cVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$13\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n120#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$13\n*L\n138#1:220\n138#1:221,5\n*E\n"})
    /* renamed from: wa0.d$d, reason: collision with other inner class name */
    public static final class C1288d<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.d<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> f96052a;

        /* JADX WARN: Multi-variable type inference failed */
        public C1288d(x00.d<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> dVar) {
            this.f96052a = dVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.d<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> dVar = this.f96052a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            return dVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$14\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n127#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$14\n*L\n146#1:220\n146#1:221,5\n*E\n"})
    public static final class e<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.e<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> f96053a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(x00.e<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> eVar) {
            this.f96053a = eVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.e<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> eVar = this.f96053a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            return eVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$15\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n134#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$15\n*L\n154#1:220\n154#1:221,5\n*E\n"})
    public static final class f<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.f<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> f96054a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(x00.f<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> fVar) {
            this.f96054a = fVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.f<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> fVar = this.f96054a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            Object i24 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T14");
            return fVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$16\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n141#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$16\n*L\n162#1:220\n162#1:221,5\n*E\n"})
    public static final class g<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.g<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> f96055a;

        /* JADX WARN: Multi-variable type inference failed */
        public g(x00.g<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> gVar) {
            this.f96055a = gVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.g<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> gVar = this.f96055a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            Object i24 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T14");
            Object i25 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T15");
            return gVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$17\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n148#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$17\n*L\n170#1:220\n170#1:221,5\n*E\n"})
    public static final class h<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.h<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> f96056a;

        /* JADX WARN: Multi-variable type inference failed */
        public h(x00.h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> hVar) {
            this.f96056a = hVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.h<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> hVar = this.f96056a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            Object i24 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T14");
            Object i25 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T15");
            Object i26 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T16");
            return hVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$18\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n155#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$18\n*L\n178#1:220\n178#1:221,5\n*E\n"})
    public static final class i<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.i<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> f96057a;

        /* JADX WARN: Multi-variable type inference failed */
        public i(x00.i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> iVar) {
            this.f96057a = iVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.i<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> iVar = this.f96057a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            Object i24 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T14");
            Object i25 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T15");
            Object i26 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T16");
            Object i27 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T17");
            return iVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$19\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n162#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$19\n*L\n186#1:220\n186#1:221,5\n*E\n"})
    public static final class j<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.j<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> f96058a;

        /* JADX WARN: Multi-variable type inference failed */
        public j(x00.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> jVar) {
            this.f96058a = jVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.j<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> jVar = this.f96058a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            Object i24 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T14");
            Object i25 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T15");
            Object i26 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T16");
            Object i27 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T17");
            Object i28 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T18");
            return jVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27, i28, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$1\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n*L\n1#1,219:1\n36#2:220\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$1\n*L\n42#1:220\n*E\n"})
    public static final class k<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<R> f96059a;

        /* JADX WARN: Multi-variable type inference failed */
        public k(x00.a<? extends R> aVar) {
            this.f96059a = aVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            return this.f96059a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$20\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n169#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$20\n*L\n194#1:220\n194#1:221,5\n*E\n"})
    public static final class l<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.k<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> f96060a;

        /* JADX WARN: Multi-variable type inference failed */
        public l(x00.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> kVar) {
            this.f96060a = kVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.k<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> kVar = this.f96060a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            Object i24 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T14");
            Object i25 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T15");
            Object i26 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T16");
            Object i27 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T17");
            Object i28 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T18");
            Object i29 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T19");
            return kVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27, i28, i29, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$21\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n176#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$21\n*L\n202#1:220\n202#1:221,5\n*E\n"})
    public static final class m<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.m<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> f96061a;

        /* JADX WARN: Multi-variable type inference failed */
        public m(x00.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> mVar) {
            this.f96061a = mVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.m<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> mVar = this.f96061a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            Object i24 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T14");
            Object i25 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T15");
            Object i26 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T16");
            Object i27 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T17");
            Object i28 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T18");
            Object i29 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T19");
            Object i31 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T20");
            return mVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27, i28, i29, i31, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$22\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n183#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$22\n*L\n210#1:220\n210#1:221,5\n*E\n"})
    public static final class n<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> f96062a;

        /* JADX WARN: Multi-variable type inference failed */
        public n(x00.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> nVar) {
            this.f96062a = nVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> nVar = this.f96062a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            Object i24 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T14");
            Object i25 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T15");
            Object i26 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T16");
            Object i27 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T17");
            Object i28 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T18");
            Object i29 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T19");
            Object i31 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T20");
            Object i32 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T21");
            return nVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27, i28, i29, i31, i32, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$23\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n190#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$23\n*L\n218#1:220\n218#1:221,5\n*E\n"})
    public static final class o<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.o<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> f96063a;

        /* JADX WARN: Multi-variable type inference failed */
        public o(x00.o<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> oVar) {
            this.f96063a = oVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.o<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> oVar = this.f96063a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            Object i18 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T9");
            Object i19 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T10");
            Object i21 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T11");
            Object i22 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T12");
            Object i23 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T13");
            Object i24 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T14");
            Object i25 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T15");
            Object i26 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T16");
            Object i27 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T17");
            Object i28 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T18");
            Object i29 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T19");
            Object i31 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T20");
            Object i32 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T21");
            Object i33 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T22");
            return oVar.invoke(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27, i28, i29, i31, i32, i33, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$2\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n43#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$2\n*L\n50#1:220\n50#1:221,5\n*E\n"})
    public static final class p<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<T1, R> f96064a;

        /* JADX WARN: Multi-variable type inference failed */
        public p(x00.l<? super T1, ? extends R> lVar) {
            this.f96064a = lVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.l<T1, R> lVar = this.f96064a;
            g0.y(4, "T1");
            return lVar.invoke(factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$3\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n50#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$3\n*L\n58#1:220\n58#1:221,5\n*E\n"})
    public static final class q<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.p<T1, T2, R> f96065a;

        /* JADX WARN: Multi-variable type inference failed */
        public q(x00.p<? super T1, ? super T2, ? extends R> pVar) {
            this.f96065a = pVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.p<T1, T2, R> pVar = this.f96065a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            return pVar.invoke(i11, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$4\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n57#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$4\n*L\n66#1:220\n66#1:221,5\n*E\n"})
    public static final class r<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.q<T1, T2, T3, R> f96066a;

        /* JADX WARN: Multi-variable type inference failed */
        public r(x00.q<? super T1, ? super T2, ? super T3, ? extends R> qVar) {
            this.f96066a = qVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.q<T1, T2, T3, R> qVar = this.f96066a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            return qVar.invoke(i11, i12, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$5\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n64#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$5\n*L\n74#1:220\n74#1:221,5\n*E\n"})
    public static final class s<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.r<T1, T2, T3, T4, R> f96067a;

        /* JADX WARN: Multi-variable type inference failed */
        public s(x00.r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar) {
            this.f96067a = rVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.r<T1, T2, T3, T4, R> rVar = this.f96067a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            return rVar.invoke(i11, i12, i13, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$6\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n71#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$6\n*L\n82#1:220\n82#1:221,5\n*E\n"})
    public static final class t<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.s<T1, T2, T3, T4, T5, R> f96068a;

        /* JADX WARN: Multi-variable type inference failed */
        public t(x00.s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar) {
            this.f96068a = sVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.s<T1, T2, T3, T4, T5, R> sVar = this.f96068a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            return sVar.invoke(i11, i12, i13, i14, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$7\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n78#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$7\n*L\n90#1:220\n90#1:221,5\n*E\n"})
    public static final class u<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.t<T1, T2, T3, T4, T5, T6, R> f96069a;

        /* JADX WARN: Multi-variable type inference failed */
        public u(x00.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> tVar) {
            this.f96069a = tVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.t<T1, T2, T3, T4, T5, T6, R> tVar = this.f96069a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            return tVar.invoke(i11, i12, i13, i14, i15, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$8\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n85#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$8\n*L\n98#1:220\n98#1:221,5\n*E\n"})
    public static final class v<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.u<T1, T2, T3, T4, T5, T6, T7, R> f96070a;

        /* JADX WARN: Multi-variable type inference failed */
        public v(x00.u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> uVar) {
            this.f96070a = uVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.u<T1, T2, T3, T4, T5, T6, T7, R> uVar = this.f96070a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            return uVar.invoke(i11, i12, i13, i14, i15, i16, factory.i(o0.d(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScopedFactoryOf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$9\n+ 2 New.kt\norg/koin/core/module/dsl/NewKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,219:1\n92#2:220\n138#3,5:221\n*S KotlinDebug\n*F\n+ 1 ScopedFactoryOf.kt\norg/koin/core/module/dsl/ScopedFactoryOfKt$factoryOf$9\n*L\n106#1:220\n106#1:221,5\n*E\n"})
    public static final class w<R> implements x00.p<cb0.b, ya0.a, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.v<T1, T2, T3, T4, T5, T6, T7, T8, R> f96071a;

        /* JADX WARN: Multi-variable type inference failed */
        public w(x00.v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> vVar) {
            this.f96071a = vVar;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(cb0.b factory, ya0.a it) {
            g0.p(factory, "$this$factory");
            g0.p(it, "it");
            x00.v<T1, T2, T3, T4, T5, T6, T7, T8, R> vVar = this.f96071a;
            g0.y(4, "T1");
            Object i11 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T2");
            Object i12 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T3");
            Object i13 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T4");
            Object i14 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T5");
            Object i15 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T6");
            Object i16 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T7");
            Object i17 = factory.i(o0.d(Object.class), null, null);
            g0.y(4, "T8");
            return vVar.invoke(i11, i12, i13, i14, i15, i16, i17, factory.i(o0.d(Object.class), null, null));
        }
    }

    public static /* synthetic */ ra0.f A(eb0.f fVar, x00.d constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        C1288d c1288d = new C1288d(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, c1288d, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f B(eb0.f fVar, x00.e constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        e eVar = new e(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, eVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f C(eb0.f fVar, x00.f constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        f fVar2 = new f(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, fVar2, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f D(eb0.f fVar, x00.g constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        g gVar = new g(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, gVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f E(eb0.f fVar, x00.h constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        h hVar = new h(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, hVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f F(eb0.f fVar, x00.i constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        i iVar = new i(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, iVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f G(eb0.f fVar, x00.j constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        j jVar = new j(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, jVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f H(eb0.f fVar, x00.k constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        l lVar2 = new l(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, lVar2, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f I(eb0.f fVar, x00.l constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        p pVar = new p(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, pVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f J(eb0.f fVar, x00.m constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        m mVar = new m(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, mVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f K(eb0.f fVar, x00.n constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        n nVar = new n(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, nVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f L(eb0.f fVar, x00.o constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        o oVar = new o(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, oVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f M(eb0.f fVar, x00.p constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        q qVar = new q(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, qVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f N(eb0.f fVar, x00.q constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        r rVar = new r(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, rVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f O(eb0.f fVar, x00.r constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        s sVar = new s(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, sVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f P(eb0.f fVar, x00.s constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        t tVar = new t(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, tVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f Q(eb0.f fVar, x00.t constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        u uVar = new u(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, uVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f R(eb0.f fVar, x00.u constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        v vVar = new v(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, vVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f S(eb0.f fVar, x00.v constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        w wVar = new w(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, wVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f T(eb0.f fVar, x00.w constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        a aVar = new a(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar2 = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, aVar, kind, J));
        c11.q(aVar2);
        return wa0.c.g(new ra0.f(c11, aVar2), lVar);
    }

    public static final /* synthetic */ <R> ra0.f<R> a(eb0.f fVar, x00.a<? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        k kVar = new k(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, kVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> ra0.f<R> b(eb0.f fVar, x00.b<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        b bVar = new b(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, bVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> ra0.f<R> c(eb0.f fVar, x00.c<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        c cVar = new c(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, cVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> ra0.f<R> d(eb0.f fVar, x00.d<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        C1288d c1288d = new C1288d(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, c1288d, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> ra0.f<R> e(eb0.f fVar, x00.e<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        e eVar = new e(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, eVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> ra0.f<R> f(eb0.f fVar, x00.f<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        f fVar2 = new f(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, fVar2, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> ra0.f<R> g(eb0.f fVar, x00.g<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        g gVar = new g(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, gVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> ra0.f<R> h(eb0.f fVar, x00.h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        h hVar = new h(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, hVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> ra0.f<R> i(eb0.f fVar, x00.i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        i iVar = new i(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, iVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> ra0.f<R> j(eb0.f fVar, x00.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        j jVar = new j(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, jVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> ra0.f<R> k(eb0.f fVar, x00.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        l lVar2 = new l(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, lVar2, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1> ra0.f<R> l(eb0.f fVar, x00.l<? super T1, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        p pVar = new p(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, pVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ra0.f<R> m(eb0.f fVar, x00.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        m mVar = new m(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, mVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ra0.f<R> n(eb0.f fVar, x00.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        n nVar = new n(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, nVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ra0.f<R> o(eb0.f fVar, x00.o<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        o oVar = new o(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, oVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2> ra0.f<R> p(eb0.f fVar, x00.p<? super T1, ? super T2, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        q qVar = new q(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, qVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3> ra0.f<R> q(eb0.f fVar, x00.q<? super T1, ? super T2, ? super T3, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        r rVar = new r(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, rVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4> ra0.f<R> r(eb0.f fVar, x00.r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        s sVar = new s(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, sVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5> ra0.f<R> s(eb0.f fVar, x00.s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        t tVar = new t(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, tVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6> ra0.f<R> t(eb0.f fVar, x00.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        u uVar = new u(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, uVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7> ra0.f<R> u(eb0.f fVar, x00.u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        v vVar = new v(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, vVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8> ra0.f<R> v(eb0.f fVar, x00.v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        w wVar = new w(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, wVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9> ra0.f<R> w(eb0.f fVar, x00.w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> constructor, x00.l<? super ra0.b<R>, g2> lVar) {
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        a aVar = new a(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar2 = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, aVar, kind, J));
        c11.q(aVar2);
        return wa0.c.g(new ra0.f(c11, aVar2), lVar);
    }

    public static /* synthetic */ ra0.f x(eb0.f fVar, x00.a constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        k kVar = new k(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, kVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f y(eb0.f fVar, x00.b constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        b bVar = new b(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, bVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }

    public static /* synthetic */ ra0.f z(eb0.f fVar, x00.c constructor, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        g0.p(fVar, "<this>");
        g0.p(constructor, "constructor");
        g0.w();
        c cVar = new c(constructor);
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, "R");
        ta0.a aVar = new ta0.a(new ra0.b(d11, o0.d(Object.class), null, cVar, kind, J));
        c11.q(aVar);
        return wa0.c.g(new ra0.f(c11, aVar), lVar);
    }
}
