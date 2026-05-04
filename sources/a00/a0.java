package a00;

import e00.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.random.Random;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,25600:1\n13020#1,2:25601\n13030#1,2:25603\n1400#1,2:25605\n1408#1,2:25607\n1416#1,2:25609\n1424#1,2:25611\n1432#1,2:25613\n1440#1,2:25615\n1448#1,2:25617\n1456#1,2:25619\n1464#1,2:25621\n2443#1,5:25623\n2456#1,5:25628\n2469#1,5:25633\n2482#1,5:25638\n2495#1,5:25643\n2508#1,5:25648\n2521#1,5:25653\n2534#1,5:25658\n2547#1,5:25663\n4434#1,2:25669\n4444#1,2:25671\n4454#1,2:25673\n4464#1,2:25675\n4474#1,2:25677\n4484#1,2:25679\n4494#1,2:25681\n4504#1,2:25683\n4514#1,2:25685\n4101#1:25687\n13870#1,2:25688\n4102#1,2:25690\n13872#1:25692\n4104#1:25693\n4115#1:25694\n13880#1,2:25695\n4116#1,2:25697\n13882#1:25699\n4118#1:25700\n4129#1:25701\n13890#1,2:25702\n4130#1,2:25704\n13892#1:25706\n4132#1:25707\n4143#1:25708\n13900#1,2:25709\n4144#1,2:25711\n13902#1:25713\n4146#1:25714\n4157#1:25715\n13910#1,2:25716\n4158#1,2:25718\n13912#1:25720\n4160#1:25721\n4171#1:25722\n13920#1,2:25723\n4172#1,2:25725\n13922#1:25727\n4174#1:25728\n4185#1:25729\n13930#1,2:25730\n4186#1,2:25732\n13932#1:25734\n4188#1:25735\n4199#1:25736\n13940#1,2:25737\n4200#1,2:25739\n13942#1:25741\n4202#1:25742\n4213#1:25743\n13950#1,2:25744\n4214#1,2:25746\n13952#1:25748\n4216#1:25749\n13870#1,3:25750\n13880#1,3:25753\n13890#1,3:25756\n13900#1,3:25759\n13910#1,3:25762\n13920#1,3:25765\n13930#1,3:25768\n13940#1,3:25771\n13950#1,3:25774\n4234#1,2:25777\n4344#1,2:25779\n4354#1,2:25781\n4364#1,2:25783\n4374#1,2:25785\n4384#1,2:25787\n4394#1,2:25789\n4404#1,2:25791\n4414#1,2:25793\n4424#1,2:25795\n9584#1,4:25797\n9599#1,4:25801\n9614#1,4:25805\n9629#1,4:25809\n9644#1,4:25813\n9659#1,4:25817\n9674#1,4:25821\n9689#1,4:25825\n9704#1,4:25829\n9297#1,4:25833\n9313#1,4:25837\n9329#1,4:25841\n9345#1,4:25845\n9361#1,4:25849\n9377#1,4:25853\n9393#1,4:25857\n9409#1,4:25861\n9425#1,4:25865\n9441#1,4:25869\n9457#1,4:25873\n9473#1,4:25877\n9489#1,4:25881\n9505#1,4:25885\n9521#1,4:25889\n9537#1,4:25893\n9553#1,4:25897\n9569#1,4:25901\n9872#1,4:25905\n10890#1,5:25909\n10901#1,5:25914\n10912#1,5:25919\n10923#1,5:25924\n10934#1,5:25929\n10945#1,5:25934\n10956#1,5:25939\n10967#1,5:25944\n10978#1,5:25949\n10993#1,5:25954\n11234#1,3:25959\n11237#1,3:25969\n11251#1,3:25972\n11254#1,3:25982\n11268#1,3:25985\n11271#1,3:25995\n11285#1,3:25998\n11288#1,3:26008\n11302#1,3:26011\n11305#1,3:26021\n11319#1,3:26024\n11322#1,3:26034\n11336#1,3:26037\n11339#1,3:26047\n11353#1,3:26050\n11356#1,3:26060\n11370#1,3:26063\n11373#1,3:26073\n11388#1,3:26076\n11391#1,3:26086\n11406#1,3:26089\n11409#1,3:26099\n11424#1,3:26102\n11427#1,3:26112\n11442#1,3:26115\n11445#1,3:26125\n11460#1,3:26128\n11463#1,3:26138\n11478#1,3:26141\n11481#1,3:26151\n11496#1,3:26154\n11499#1,3:26164\n11514#1,3:26167\n11517#1,3:26177\n11532#1,3:26180\n11535#1,3:26190\n11896#1,3:26319\n11906#1,3:26322\n11916#1,3:26325\n11926#1,3:26328\n11936#1,3:26331\n11946#1,3:26334\n11956#1,3:26337\n11966#1,3:26340\n11976#1,3:26343\n11762#1,4:26346\n11775#1,4:26350\n11788#1,4:26354\n11801#1,4:26358\n11814#1,4:26362\n11827#1,4:26366\n11840#1,4:26370\n11853#1,4:26374\n11866#1,4:26378\n11751#1:26382\n13870#1,2:26383\n13872#1:26386\n11752#1:26387\n13870#1,3:26388\n11887#1:26391\n13805#1:26392\n13806#1:26394\n11888#1:26395\n13805#1,2:26396\n13870#1,3:26398\n13880#1,3:26401\n13890#1,3:26404\n13900#1,3:26407\n13910#1,3:26410\n13920#1,3:26413\n13930#1,3:26416\n13940#1,3:26419\n13950#1,3:26422\n21873#1,2:26425\n21875#1,6:26428\n22089#1,2:26434\n22091#1,6:26437\n24212#1,6:26443\n24228#1,6:26449\n24244#1,6:26455\n24260#1,6:26461\n24276#1,6:26467\n24292#1,6:26473\n24308#1,6:26479\n24324#1,6:26485\n24340#1,6:26491\n24446#1,8:26497\n24464#1,8:26505\n24482#1,8:26513\n24500#1,8:26521\n24518#1,8:26529\n24536#1,8:26537\n24554#1,8:26545\n24572#1,8:26553\n24590#1,8:26561\n24688#1,6:26569\n24704#1,6:26575\n24720#1,6:26581\n24736#1,6:26587\n24752#1,6:26593\n24768#1,6:26599\n24784#1,6:26605\n24800#1,6:26611\n1#2:25668\n1#2:26385\n1#2:26393\n1#2:26427\n1#2:26436\n382#3,7:25962\n382#3,7:25975\n382#3,7:25988\n382#3,7:26001\n382#3,7:26014\n382#3,7:26027\n382#3,7:26040\n382#3,7:26053\n382#3,7:26066\n382#3,7:26079\n382#3,7:26092\n382#3,7:26105\n382#3,7:26118\n382#3,7:26131\n382#3,7:26144\n382#3,7:26157\n382#3,7:26170\n382#3,7:26183\n382#3,7:26193\n382#3,7:26200\n382#3,7:26207\n382#3,7:26214\n382#3,7:26221\n382#3,7:26228\n382#3,7:26235\n382#3,7:26242\n382#3,7:26249\n382#3,7:26256\n382#3,7:26263\n382#3,7:26270\n382#3,7:26277\n382#3,7:26284\n382#3,7:26291\n382#3,7:26298\n382#3,7:26305\n382#3,7:26312\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n647#1:25601,2\n656#1:25603,2\n950#1:25605,2\n960#1:25607,2\n970#1:25609,2\n980#1:25611,2\n990#1:25613,2\n1000#1:25615,2\n1010#1:25617,2\n1020#1:25619,2\n1030#1:25621,2\n1040#1:25623,5\n1050#1:25628,5\n1060#1:25633,5\n1070#1:25638,5\n1080#1:25643,5\n1090#1:25648,5\n1100#1:25653,5\n1110#1:25658,5\n1120#1:25663,5\n3919#1:25669,2\n3928#1:25671,2\n3937#1:25673,2\n3946#1:25675,2\n3955#1:25677,2\n3964#1:25679,2\n3973#1:25681,2\n3982#1:25683,2\n3991#1:25685,2\n4002#1:25687\n4002#1:25688,2\n4002#1:25690,2\n4002#1:25692\n4002#1:25693\n4013#1:25694\n4013#1:25695,2\n4013#1:25697,2\n4013#1:25699\n4013#1:25700\n4024#1:25701\n4024#1:25702,2\n4024#1:25704,2\n4024#1:25706\n4024#1:25707\n4035#1:25708\n4035#1:25709,2\n4035#1:25711,2\n4035#1:25713\n4035#1:25714\n4046#1:25715\n4046#1:25716,2\n4046#1:25718,2\n4046#1:25720\n4046#1:25721\n4057#1:25722\n4057#1:25723,2\n4057#1:25725,2\n4057#1:25727\n4057#1:25728\n4068#1:25729\n4068#1:25730,2\n4068#1:25732,2\n4068#1:25734\n4068#1:25735\n4079#1:25736\n4079#1:25737,2\n4079#1:25739,2\n4079#1:25741\n4079#1:25742\n4090#1:25743\n4090#1:25744,2\n4090#1:25746,2\n4090#1:25748\n4090#1:25749\n4101#1:25750,3\n4115#1:25753,3\n4129#1:25756,3\n4143#1:25759,3\n4157#1:25762,3\n4171#1:25765,3\n4185#1:25768,3\n4199#1:25771,3\n4213#1:25774,3\n4225#1:25777,2\n4244#1:25779,2\n4253#1:25781,2\n4262#1:25783,2\n4271#1:25785,2\n4280#1:25787,2\n4289#1:25789,2\n4298#1:25791,2\n4307#1:25793,2\n4316#1:25795,2\n8903#1:25797,4\n8918#1:25801,4\n8933#1:25805,4\n8948#1:25809,4\n8963#1:25813,4\n8978#1:25817,4\n8993#1:25821,4\n9008#1:25825,4\n9023#1:25829,4\n9038#1:25833,4\n9053#1:25837,4\n9068#1:25841,4\n9083#1:25845,4\n9098#1:25849,4\n9113#1:25853,4\n9128#1:25857,4\n9143#1:25861,4\n9158#1:25865,4\n9172#1:25869,4\n9186#1:25873,4\n9200#1:25877,4\n9214#1:25881,4\n9228#1:25885,4\n9242#1:25889,4\n9256#1:25893,4\n9270#1:25897,4\n9284#1:25901,4\n9723#1:25905,4\n10468#1:25909,5\n10477#1:25914,5\n10486#1:25919,5\n10495#1:25924,5\n10504#1:25929,5\n10513#1:25934,5\n10522#1:25939,5\n10531#1:25944,5\n10540#1:25949,5\n10553#1:25954,5\n11009#1:25959,3\n11009#1:25969,3\n11021#1:25972,3\n11021#1:25982,3\n11033#1:25985,3\n11033#1:25995,3\n11045#1:25998,3\n11045#1:26008,3\n11057#1:26011,3\n11057#1:26021,3\n11069#1:26024,3\n11069#1:26034,3\n11081#1:26037,3\n11081#1:26047,3\n11093#1:26050,3\n11093#1:26060,3\n11105#1:26063,3\n11105#1:26073,3\n11118#1:26076,3\n11118#1:26086,3\n11131#1:26089,3\n11131#1:26099,3\n11144#1:26102,3\n11144#1:26112,3\n11157#1:26115,3\n11157#1:26125,3\n11170#1:26128,3\n11170#1:26138,3\n11183#1:26141,3\n11183#1:26151,3\n11196#1:26154,3\n11196#1:26164,3\n11209#1:26167,3\n11209#1:26177,3\n11222#1:26180,3\n11222#1:26190,3\n11561#1:26319,3\n11571#1:26322,3\n11581#1:26325,3\n11591#1:26328,3\n11601#1:26331,3\n11611#1:26334,3\n11621#1:26337,3\n11631#1:26340,3\n11641#1:26343,3\n11651#1:26346,4\n11661#1:26350,4\n11671#1:26354,4\n11681#1:26358,4\n11691#1:26362,4\n11701#1:26366,4\n11711#1:26370,4\n11721#1:26374,4\n11731#1:26378,4\n11741#1:26382\n11741#1:26383,2\n11741#1:26386\n11741#1:26387\n11751#1:26388,3\n11879#1:26391\n11879#1:26392\n11879#1:26394\n11879#1:26395\n11887#1:26396,2\n20159#1:26398,3\n20171#1:26401,3\n20183#1:26404,3\n20195#1:26407,3\n20207#1:26410,3\n20219#1:26413,3\n20231#1:26416,3\n20243#1:26419,3\n20255#1:26422,3\n22703#1:26425,2\n22703#1:26428,6\n22856#1:26434,2\n22856#1:26437,6\n24121#1:26443,6\n24131#1:26449,6\n24141#1:26455,6\n24151#1:26461,6\n24161#1:26467,6\n24171#1:26473,6\n24181#1:26479,6\n24191#1:26485,6\n24201#1:26491,6\n24355#1:26497,8\n24365#1:26505,8\n24375#1:26513,8\n24385#1:26521,8\n24395#1:26529,8\n24405#1:26537,8\n24415#1:26545,8\n24425#1:26553,8\n24435#1:26561,8\n24607#1:26569,6\n24617#1:26575,6\n24627#1:26581,6\n24637#1:26587,6\n24647#1:26593,6\n24657#1:26599,6\n24667#1:26605,6\n24677#1:26611,6\n11741#1:26385\n11879#1:26393\n22703#1:26427\n22856#1:26436\n11009#1:25962,7\n11021#1:25975,7\n11033#1:25988,7\n11045#1:26001,7\n11057#1:26014,7\n11069#1:26027,7\n11081#1:26040,7\n11093#1:26053,7\n11105#1:26066,7\n11118#1:26079,7\n11131#1:26092,7\n11144#1:26105,7\n11157#1:26118,7\n11170#1:26131,7\n11183#1:26144,7\n11196#1:26157,7\n11209#1:26170,7\n11222#1:26183,7\n11236#1:26193,7\n11253#1:26200,7\n11270#1:26207,7\n11287#1:26214,7\n11304#1:26221,7\n11321#1:26228,7\n11338#1:26235,7\n11355#1:26242,7\n11372#1:26249,7\n11390#1:26256,7\n11408#1:26263,7\n11426#1:26270,7\n11444#1:26277,7\n11462#1:26284,7\n11480#1:26291,7\n11498#1:26298,7\n11516#1:26305,7\n11534#1:26312,7\n*E\n"})
/* loaded from: classes8.dex */
public class a0 extends a00.q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25143#2:71\n*E\n"})
    public static final class a<T> implements Iterable<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f1060a;

        public a(Object[] objArr) {
            this.f1060a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.h.a(this.f1060a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25151#2:71\n*E\n"})
    public static final class b implements Iterable<Byte>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f1061a;

        public b(byte[] bArr) {
            this.f1061a = bArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Byte> iterator() {
            return kotlin.jvm.internal.i.b(this.f1061a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25159#2:71\n*E\n"})
    public static final class c implements Iterable<Short>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ short[] f1062a;

        public c(short[] sArr) {
            this.f1062a = sArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Short> iterator() {
            return kotlin.jvm.internal.i.h(this.f1062a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25167#2:71\n*E\n"})
    public static final class d implements Iterable<Integer>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f1063a;

        public d(int[] iArr) {
            this.f1063a = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Integer> iterator() {
            return kotlin.jvm.internal.i.f(this.f1063a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25175#2:71\n*E\n"})
    public static final class e implements Iterable<Long>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long[] f1064a;

        public e(long[] jArr) {
            this.f1064a = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Long> iterator() {
            return kotlin.jvm.internal.i.g(this.f1064a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25183#2:71\n*E\n"})
    public static final class f implements Iterable<Float>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float[] f1065a;

        public f(float[] fArr) {
            this.f1065a = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Float> iterator() {
            return kotlin.jvm.internal.i.e(this.f1065a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25191#2:71\n*E\n"})
    public static final class g implements Iterable<Double>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ double[] f1066a;

        public g(double[] dArr) {
            this.f1066a = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Double> iterator() {
            return kotlin.jvm.internal.i.d(this.f1066a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25199#2:71\n*E\n"})
    public static final class h implements Iterable<Boolean>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f1067a;

        public h(boolean[] zArr) {
            this.f1067a = zArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Boolean> iterator() {
            return kotlin.jvm.internal.i.a(this.f1067a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n25207#2:71\n*E\n"})
    public static final class i implements Iterable<Character>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ char[] f1068a;

        public i(char[] cArr) {
            this.f1068a = cArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return kotlin.jvm.internal.i.c(this.f1068a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,731:1\n25217#2:732\n*E\n"})
    public static final class j<T> implements q30.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f1069a;

        public j(Object[] objArr) {
            this.f1069a = objArr;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.h.a(this.f1069a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,731:1\n25227#2:732\n*E\n"})
    public static final class k implements q30.m<Byte> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f1070a;

        public k(byte[] bArr) {
            this.f1070a = bArr;
        }

        @Override // q30.m
        public Iterator<Byte> iterator() {
            return kotlin.jvm.internal.i.b(this.f1070a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,731:1\n25237#2:732\n*E\n"})
    public static final class l implements q30.m<Short> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ short[] f1071a;

        public l(short[] sArr) {
            this.f1071a = sArr;
        }

        @Override // q30.m
        public Iterator<Short> iterator() {
            return kotlin.jvm.internal.i.h(this.f1071a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,731:1\n25247#2:732\n*E\n"})
    public static final class m implements q30.m<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f1072a;

        public m(int[] iArr) {
            this.f1072a = iArr;
        }

        @Override // q30.m
        public Iterator<Integer> iterator() {
            return kotlin.jvm.internal.i.f(this.f1072a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,731:1\n25257#2:732\n*E\n"})
    public static final class n implements q30.m<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long[] f1073a;

        public n(long[] jArr) {
            this.f1073a = jArr;
        }

        @Override // q30.m
        public Iterator<Long> iterator() {
            return kotlin.jvm.internal.i.g(this.f1073a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,731:1\n25267#2:732\n*E\n"})
    public static final class o implements q30.m<Float> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float[] f1074a;

        public o(float[] fArr) {
            this.f1074a = fArr;
        }

        @Override // q30.m
        public Iterator<Float> iterator() {
            return kotlin.jvm.internal.i.e(this.f1074a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,731:1\n25277#2:732\n*E\n"})
    public static final class p implements q30.m<Double> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ double[] f1075a;

        public p(double[] dArr) {
            this.f1075a = dArr;
        }

        @Override // q30.m
        public Iterator<Double> iterator() {
            return kotlin.jvm.internal.i.d(this.f1075a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,731:1\n25287#2:732\n*E\n"})
    public static final class q implements q30.m<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f1076a;

        public q(boolean[] zArr) {
            this.f1076a = zArr;
        }

        @Override // q30.m
        public Iterator<Boolean> iterator() {
            return kotlin.jvm.internal.i.a(this.f1076a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,731:1\n25297#2:732\n*E\n"})
    public static final class r implements q30.m<Character> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ char[] f1077a;

        public r(char[] cArr) {
            this.f1077a = cArr;
        }

        @Override // q30.m
        public Iterator<Character> iterator() {
            return kotlin.jvm.internal.i.c(this.f1077a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt$groupingBy$1\n*L\n1#1,25600:1\n*E\n"})
    public static final class s<K, T> implements w0<T, K> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T[] f1078a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, K> f1079b;

        /* JADX WARN: Multi-variable type inference failed */
        public s(T[] tArr, x00.l<? super T, ? extends K> lVar) {
            this.f1078a = tArr;
            this.f1079b = lVar;
        }

        @Override // a00.w0
        public K a(T t11) {
            return this.f1079b.invoke(t11);
        }

        @Override // a00.w0
        public Iterator<T> b() {
            return kotlin.jvm.internal.h.a(this.f1078a);
        }
    }

    public static boolean A5(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M A6(@m80.k char[] cArr, @m80.k M destination, @m80.k x00.l<? super Character, ? extends K> keySelector, @m80.k x00.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (char c11 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c11)), valueTransform.invoke(Character.valueOf(c11)));
        }
        return destination;
    }

    @w00.j(name = "averageOfLong")
    public static final double A7(@m80.k Long[] lArr) {
        kotlin.jvm.internal.g0.p(lArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (Long l11 : lArr) {
            d11 += l11.longValue();
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    public static boolean A8(@m80.k long[] jArr, long j11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return ag(jArr, j11) >= 0;
    }

    @m80.k
    public static final List<Float> A9(@m80.k float[] fArr, int i11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (i11 >= 0) {
            return ay(fArr, g10.u.u(fArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R> List<Pair<Double, R>> AA(@m80.k double[] dArr, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            double d11 = dArr[i11];
            arrayList.add(yz.h1.a(Double.valueOf(d11), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Character> Aa(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                arrayList.add(Character.valueOf(c11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Integer>> C Ab(@m80.k int[] iArr, @m80.k C destination, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                destination.add(Integer.valueOf(i11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Float Ac(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (float f11 : fArr) {
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                return Float.valueOf(f11);
            }
        }
        return null;
    }

    public static final <R> R Ad(@m80.k float[] fArr, R r11, @m80.k x00.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (float f11 : fArr) {
            r11 = operation.invoke(r11, Float.valueOf(f11));
        }
        return r11;
    }

    @m80.k
    public static final g10.l Ae(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return new g10.l(0, Je(cArr));
    }

    @m80.k
    public static final <K> Map<K, List<Boolean>> Af(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z11 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Boolean.valueOf(z11));
        }
        return linkedHashMap;
    }

    @m80.k
    public static final Set<Integer> Ag(@m80.k int[] iArr, @m80.k Iterable<Integer> other) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Integer> uz2 = uz(iArr);
        m0.T0(uz2, other);
        return uz2;
    }

    public static /* synthetic */ String Ah(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return rh(dArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.k
    public static final <R> List<R> Ai(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b11 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b11)));
        }
        return arrayList;
    }

    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> float Aj(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        if (Le != 0) {
            R invoke = selector.invoke(Float.valueOf(f11));
            int i11 = 1;
            if (1 <= Le) {
                while (true) {
                    float f12 = fArr[i11];
                    R invoke2 = selector.invoke(Float.valueOf(f12));
                    if (invoke.compareTo(invoke2) < 0) {
                        f11 = f12;
                        invoke = invoke2;
                    }
                    if (i11 == Le) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return f11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Ak(char[] cArr, x00.l<? super Character, Float> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(cArr[i11])).floatValue());
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Long Al(@m80.k long[] jArr, @m80.k Comparator<? super Long> comparator) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                if (comparator.compare(Long.valueOf(j11), Long.valueOf(j12)) < 0) {
                    j11 = j12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Am(int[] iArr, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                R invoke2 = selector.invoke(Integer.valueOf(iArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <T extends Comparable<? super T>> T An(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                T t12 = tArr[i11];
                if (t11.compareTo(t12) > 0) {
                    t11 = t12;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return t11;
    }

    public static final boolean Ao(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final Character Ap(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return Bp(cArr, Random.Default);
    }

    public static final double Aq(@m80.k double[] dArr, @m80.k x00.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ke = Ke(dArr);
        if (Ke < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d11 = dArr[Ke];
        for (int i11 = Ke - 1; i11 >= 0; i11--) {
            d11 = operation.invoke(Double.valueOf(dArr[i11]), Double.valueOf(d11)).doubleValue();
        }
        return d11;
    }

    @yz.y0(version = "1.4")
    public static final void Ar(@m80.k boolean[] zArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        a00.d.Companion.d(i11, i12, zArr.length);
        int i13 = (i11 + i12) / 2;
        if (i11 == i13) {
            return;
        }
        int i14 = i12 - 1;
        while (i11 < i13) {
            boolean z11 = zArr[i11];
            zArr[i11] = zArr[i14];
            zArr[i14] = z11;
            i14--;
            i11++;
        }
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <S, T extends S> List<S> As(@m80.k T[] tArr, @m80.k x00.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            return h0.J();
        }
        S s11 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s11);
        int length = tArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            s11 = operation.invoke(Integer.valueOf(i11), s11, (Object) tArr[i11]);
            arrayList.add(s11);
        }
        return arrayList;
    }

    public static <T> T At(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @m80.k
    public static long[] Au(@m80.k long[] jArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? new long[0] : a00.q.k1(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Character> Av(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return aw(cArr, new g.a(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final int Aw(@m80.k float[] fArr, @m80.k x00.l<? super Float, Integer> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (float f11 : fArr) {
            i11 += selector.invoke(Float.valueOf(f11)).intValue();
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final int Ax(int[] iArr, x00.l<? super Integer, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        for (int i12 : iArr) {
            i11 = yz.s1.i(i11 + selector.invoke(Integer.valueOf(i12)).m0());
        }
        return i11;
    }

    @m80.k
    public static final byte[] Ay(@m80.k Byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr2[i11] = bArr[i11].byteValue();
        }
        return bArr2;
    }

    @m80.k
    public static final Set<Character> Az(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? (Set) Dy(cArr, new LinkedHashSet(k1.j(g10.u.B(cArr.length, 128)))) : v1.f(Character.valueOf(cArr[0])) : w1.k();
    }

    public static final boolean B5(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final <K, M extends Map<? super K, ? super Double>> M B6(@m80.k double[] dArr, @m80.k M destination, @m80.k x00.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (double d11 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d11)), Double.valueOf(d11));
        }
        return destination;
    }

    @w00.j(name = "averageOfShort")
    public static final double B7(@m80.k Short[] shArr) {
        kotlin.jvm.internal.g0.p(shArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (Short sh2 : shArr) {
            d11 += sh2.shortValue();
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    public static <T> boolean B8(@m80.k T[] tArr, T t11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return bg(tArr, t11) >= 0;
    }

    @m80.k
    public static final List<Integer> B9(@m80.k int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (i11 >= 0) {
            return cy(iArr, g10.u.u(iArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R, V> List<V> BA(@m80.k double[] dArr, @m80.k R[] other, @m80.k x00.p<? super Double, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i11]), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Double> Ba(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d11 : dArr) {
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                arrayList.add(Double.valueOf(d11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Long>> C Bb(@m80.k long[] jArr, @m80.k C destination, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                destination.add(Long.valueOf(j11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Integer Bc(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <R> R Bd(@m80.k int[] iArr, R r11, @m80.k x00.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int i11 : iArr) {
            r11 = operation.invoke(r11, Integer.valueOf(i11));
        }
        return r11;
    }

    @m80.k
    public static final g10.l Be(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return new g10.l(0, Ke(dArr));
    }

    @m80.k
    public static final <K, V> Map<K, List<V>> Bf(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends K> keySelector, @m80.k x00.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z11 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Boolean.valueOf(z11)));
        }
        return linkedHashMap;
    }

    @m80.k
    public static final Set<Long> Bg(@m80.k long[] jArr, @m80.k Iterable<Long> other) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Long> vz2 = vz(jArr);
        m0.T0(vz2, other);
        return vz2;
    }

    public static /* synthetic */ String Bh(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return sh(fArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.k
    public static final <R> List<R> Bi(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c11 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c11)));
        }
        return arrayList;
    }

    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> int Bj(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        if (Me != 0) {
            R invoke = selector.invoke(Integer.valueOf(i11));
            int i12 = 1;
            if (1 <= Me) {
                while (true) {
                    int i13 = iArr[i12];
                    R invoke2 = selector.invoke(Integer.valueOf(i13));
                    if (invoke.compareTo(invoke2) < 0) {
                        i11 = i13;
                        invoke = invoke2;
                    }
                    if (i12 == Me) {
                        break;
                    }
                    i12++;
                }
            }
        }
        return i11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Bk(double[] dArr, x00.l<? super Double, Float> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Double.valueOf(dArr[i11])).floatValue());
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <T> T Bl(@m80.k T[] tArr, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                T t12 = tArr[i11];
                if (comparator.compare(t11, t12) < 0) {
                    t11 = t12;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return t11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Bm(long[] jArr, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                R invoke2 = selector.invoke(Long.valueOf(jArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double Bn(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                d11 = Math.min(d11, dArr[i11]);
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    public static final boolean Bo(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr.length == 0;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Character Bp(@m80.k char[] cArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.nextInt(cArr.length)]);
    }

    public static final float Bq(@m80.k float[] fArr, @m80.k x00.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Le = Le(fArr);
        if (Le < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f11 = fArr[Le];
        for (int i11 = Le - 1; i11 >= 0; i11--) {
            f11 = operation.invoke(Float.valueOf(fArr[i11]), Float.valueOf(f11)).floatValue();
        }
        return f11;
    }

    @m80.k
    public static final List<Byte> Br(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return h0.J();
        }
        List<Byte> hz2 = hz(bArr);
        o0.t1(hz2);
        return hz2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Short> Bs(short[] sArr, x00.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            return h0.J();
        }
        short s11 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s11));
        int length = sArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            s11 = operation.invoke(Integer.valueOf(i11), Short.valueOf(s11), Short.valueOf(sArr[i11])).shortValue();
            arrayList.add(Short.valueOf(s11));
        }
        return arrayList;
    }

    public static final <T> T Bt(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        boolean z11 = false;
        for (T t12 : tArr) {
            if (predicate.invoke(t12).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z11 = true;
                t11 = t12;
            }
        }
        if (z11) {
            return t11;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static long[] Bu(@m80.k long[] jArr, @m80.k Collection<Integer> indices) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr2[i11] = jArr[it.next().intValue()];
            i11++;
        }
        return jArr2;
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Double> Bv(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return bw(dArr, new g.a(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final int Bw(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Integer> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += selector.invoke(Integer.valueOf(i12)).intValue();
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final int Bx(long[] jArr, x00.l<? super Long, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        for (long j11 : jArr) {
            i11 = yz.s1.i(i11 + selector.invoke(Long.valueOf(j11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final char[] By(@m80.k Character[] chArr) {
        kotlin.jvm.internal.g0.p(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = chArr[i11].charValue();
        }
        return cArr;
    }

    @m80.k
    public static final Set<Double> Bz(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? (Set) Ey(dArr, new LinkedHashSet(k1.j(dArr.length))) : v1.f(Double.valueOf(dArr[0])) : w1.k();
    }

    public static final boolean C5(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M C6(@m80.k double[] dArr, @m80.k M destination, @m80.k x00.l<? super Double, ? extends K> keySelector, @m80.k x00.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (double d11 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d11)), valueTransform.invoke(Double.valueOf(d11)));
        }
        return destination;
    }

    @o00.f
    public static final byte C7(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr[0];
    }

    public static boolean C8(@m80.k short[] sArr, short s11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return cg(sArr, s11) >= 0;
    }

    @m80.k
    public static final List<Long> C9(@m80.k long[] jArr, int i11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (i11 >= 0) {
            return dy(jArr, g10.u.u(jArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R> List<Pair<Float, R>> CA(@m80.k float[] fArr, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(Float.valueOf(fArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final List<Float> Ca(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f11 : fArr) {
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                arrayList.add(Float.valueOf(f11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C Cb(@m80.k T[] tArr, @m80.k C destination, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                destination.add(t11);
            }
        }
        return destination;
    }

    @m80.l
    public static final Integer Cc(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return Integer.valueOf(i11);
            }
        }
        return null;
    }

    public static final <R> R Cd(@m80.k long[] jArr, R r11, @m80.k x00.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (long j11 : jArr) {
            r11 = operation.invoke(r11, Long.valueOf(j11));
        }
        return r11;
    }

    @m80.k
    public static final g10.l Ce(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return new g10.l(0, Le(fArr));
    }

    @m80.k
    public static final <K, M extends Map<? super K, List<Byte>>> M Cf(@m80.k byte[] bArr, @m80.k M destination, @m80.k x00.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (byte b11 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Byte.valueOf(b11));
        }
        return destination;
    }

    @m80.k
    public static final <T> Set<T> Cg(@m80.k T[] tArr, @m80.k Iterable<? extends T> other) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<T> wz2 = wz(tArr);
        m0.T0(wz2, other);
        return wz2;
    }

    public static /* synthetic */ String Ch(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return th(iArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.k
    public static final <R> List<R> Ci(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d11 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d11)));
        }
        return arrayList;
    }

    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> long Cj(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        if (Ne != 0) {
            R invoke = selector.invoke(Long.valueOf(j11));
            int i11 = 1;
            if (1 <= Ne) {
                while (true) {
                    long j12 = jArr[i11];
                    R invoke2 = selector.invoke(Long.valueOf(j12));
                    if (invoke.compareTo(invoke2) < 0) {
                        j11 = j12;
                        invoke = invoke2;
                    }
                    if (i11 == Ne) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return j11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Ck(float[] fArr, x00.l<? super Float, Float> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Float.valueOf(fArr[i11])).floatValue());
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Short Cl(@m80.k short[] sArr, @m80.k Comparator<? super Short> comparator) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                if (comparator.compare(Short.valueOf(s11), Short.valueOf(s12)) < 0) {
                    s11 = s12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R Cm(T[] tArr, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(tArr[0]);
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                R invoke2 = selector.invoke(tArr[i11]);
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double Cn(@m80.k Double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        int Oe = Oe(dArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                doubleValue = Math.min(doubleValue, dArr[i11].doubleValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    public static final boolean Co(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final Double Cp(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return Dp(dArr, Random.Default);
    }

    public static final int Cq(@m80.k int[] iArr, @m80.k x00.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Me = Me(iArr);
        if (Me < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i11 = iArr[Me];
        for (int i12 = Me - 1; i12 >= 0; i12--) {
            i11 = operation.invoke(Integer.valueOf(iArr[i12]), Integer.valueOf(i11)).intValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Character> Cr(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return h0.J();
        }
        List<Character> iz2 = iz(cArr);
        o0.t1(iz2);
        return iz2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Boolean> Cs(boolean[] zArr, x00.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            return h0.J();
        }
        boolean z11 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z11));
        int length = zArr.length;
        int i11 = 1;
        while (i11 < length) {
            Boolean invoke = operation.invoke(Integer.valueOf(i11), Boolean.valueOf(z11), Boolean.valueOf(zArr[i11]));
            boolean booleanValue = invoke.booleanValue();
            arrayList.add(invoke);
            i11++;
            z11 = booleanValue;
        }
        return arrayList;
    }

    public static short Ct(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @m80.k
    public static final <T> T[] Cu(@m80.k T[] tArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? (T[]) a00.q.l1(tArr, 0, 0) : (T[]) a00.q.l1(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Float> Cv(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return cw(fArr, new g.a(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final int Cw(@m80.k long[] jArr, @m80.k x00.l<? super Long, Integer> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (long j11 : jArr) {
            i11 += selector.invoke(Long.valueOf(j11)).intValue();
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final <T> int Cx(T[] tArr, x00.l<? super T, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        for (T t11 : tArr) {
            i11 = yz.s1.i(i11 + selector.invoke(t11).m0());
        }
        return i11;
    }

    @m80.k
    public static final <C extends Collection<? super Byte>> C Cy(@m80.k byte[] bArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (byte b11 : bArr) {
            destination.add(Byte.valueOf(b11));
        }
        return destination;
    }

    @m80.k
    public static final Set<Float> Cz(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? (Set) Fy(fArr, new LinkedHashSet(k1.j(fArr.length))) : v1.f(Float.valueOf(fArr[0])) : w1.k();
    }

    public static final boolean D5(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final <K, M extends Map<? super K, ? super Float>> M D6(@m80.k float[] fArr, @m80.k M destination, @m80.k x00.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (float f11 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f11)), Float.valueOf(f11));
        }
        return destination;
    }

    @o00.f
    public static final char D7(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr[0];
    }

    public static boolean D8(@m80.k boolean[] zArr, boolean z11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return dg(zArr, z11) >= 0;
    }

    @m80.k
    public static <T> List<T> D9(@m80.k T[] tArr, int i11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (i11 >= 0) {
            return ey(tArr, g10.u.u(tArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R, V> List<V> DA(@m80.k float[] fArr, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super Float, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final List<Integer> Da(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Short>> C Db(@m80.k short[] sArr, @m80.k C destination, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                destination.add(Short.valueOf(s11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Long Dc(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Dd(@m80.k T[] tArr, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (d dVar : tArr) {
            r11 = operation.invoke(r11, dVar);
        }
        return r11;
    }

    @m80.k
    public static g10.l De(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return new g10.l(0, Me(iArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, M extends Map<? super K, List<V>>> M Df(@m80.k byte[] bArr, @m80.k M destination, @m80.k x00.l<? super Byte, ? extends K> keySelector, @m80.k x00.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (byte b11 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Byte.valueOf(b11)));
        }
        return destination;
    }

    @m80.k
    public static final Set<Short> Dg(@m80.k short[] sArr, @m80.k Iterable<Short> other) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Short> xz2 = xz(sArr);
        m0.T0(xz2, other);
        return xz2;
    }

    public static /* synthetic */ String Dh(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return uh(jArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.k
    public static final <R> List<R> Di(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f11 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f11)));
        }
        return arrayList;
    }

    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T Dj(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        if (Oe != 0) {
            R invoke = selector.invoke(t11);
            int i11 = 1;
            if (1 <= Oe) {
                while (true) {
                    T t12 = tArr[i11];
                    R invoke2 = selector.invoke(t12);
                    if (invoke.compareTo(invoke2) < 0) {
                        t11 = t12;
                        invoke = invoke2;
                    }
                    if (i11 == Oe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return t11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Dk(int[] iArr, x00.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Integer.valueOf(iArr[i11])).floatValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final byte Dl(@m80.k byte[] bArr, @m80.k Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                if (comparator.compare(Byte.valueOf(b11), Byte.valueOf(b12)) < 0) {
                    b11 = b12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return b11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Dm(short[] sArr, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                R invoke2 = selector.invoke(Short.valueOf(sArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static Float Dn(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                f11 = Math.min(f11, fArr[i11]);
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final byte[] Do(byte[] bArr, x00.l<? super Byte, g2> action) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (byte b11 : bArr) {
            action.invoke(Byte.valueOf(b11));
        }
        return bArr;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double Dp(@m80.k double[] dArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.nextInt(dArr.length)]);
    }

    public static final long Dq(@m80.k long[] jArr, @m80.k x00.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ne = Ne(jArr);
        if (Ne < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j11 = jArr[Ne];
        for (int i11 = Ne - 1; i11 >= 0; i11--) {
            j11 = operation.invoke(Long.valueOf(jArr[i11]), Long.valueOf(j11)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Double> Dr(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return h0.J();
        }
        List<Double> jz2 = jz(dArr);
        o0.t1(jz2);
        return jz2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Ds(byte[] bArr, R r11, x00.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r11);
        for (byte b11 : bArr) {
            r11 = operation.invoke(r11, Byte.valueOf(b11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    public static final short Dt(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Short sh2 = null;
        boolean z11 = false;
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                sh2 = Short.valueOf(s11);
                z11 = true;
            }
        }
        if (!z11) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.g0.n(sh2, "null cannot be cast to non-null type kotlin.Short");
        return sh2.shortValue();
    }

    @m80.k
    public static final <T> T[] Du(@m80.k T[] tArr, @m80.k Collection<Integer> indices) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        T[] tArr2 = (T[]) a00.o.a(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            tArr2[i11] = tArr[it.next().intValue()];
            i11++;
        }
        return tArr2;
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Integer> Dv(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return dw(iArr, new g.a(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final <T> int Dw(@m80.k T[] tArr, @m80.k x00.l<? super T, Integer> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (T t11 : tArr) {
            i11 += selector.invoke(t11).intValue();
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final int Dx(short[] sArr, x00.l<? super Short, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        for (short s11 : sArr) {
            i11 = yz.s1.i(i11 + selector.invoke(Short.valueOf(s11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final <C extends Collection<? super Character>> C Dy(@m80.k char[] cArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (char c11 : cArr) {
            destination.add(Character.valueOf(c11));
        }
        return destination;
    }

    @m80.k
    public static final Set<Integer> Dz(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? (Set) Gy(iArr, new LinkedHashSet(k1.j(iArr.length))) : v1.f(Integer.valueOf(iArr[0])) : w1.k();
    }

    @m80.k
    public static final Iterable<Byte> E5(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr.length == 0 ? h0.J() : new b(bArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M E6(@m80.k float[] fArr, @m80.k M destination, @m80.k x00.l<? super Float, ? extends K> keySelector, @m80.k x00.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (float f11 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f11)), valueTransform.invoke(Float.valueOf(f11)));
        }
        return destination;
    }

    @o00.f
    public static final double E7(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr[0];
    }

    @yz.y0(version = "2.2")
    @kotlin.c
    @o00.f
    public static final byte[] E8(byte[] bArr, int i11, x00.l<? super Integer, Byte> init) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        byte[] copyOf = Arrays.copyOf(bArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        for (int length = bArr.length; length < i11; length++) {
            copyOf[length] = init.invoke(Integer.valueOf(length)).byteValue();
        }
        return copyOf;
    }

    @m80.k
    public static final List<Short> E9(@m80.k short[] sArr, int i11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (i11 >= 0) {
            return fy(sArr, g10.u.u(sArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final List<Pair<Float, Float>> EA(@m80.k float[] fArr, @m80.k float[] other) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(yz.h1.a(Float.valueOf(fArr[i11]), Float.valueOf(other[i11])));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Long> Ea(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                arrayList.add(Long.valueOf(j11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Boolean>> C Eb(@m80.k boolean[] zArr, @m80.k C destination, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                destination.add(Boolean.valueOf(z11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Long Ec(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                return Long.valueOf(j11);
            }
        }
        return null;
    }

    public static final <R> R Ed(@m80.k short[] sArr, R r11, @m80.k x00.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (short s11 : sArr) {
            r11 = operation.invoke(r11, Short.valueOf(s11));
        }
        return r11;
    }

    @m80.k
    public static g10.l Ee(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return new g10.l(0, Ne(jArr));
    }

    @m80.k
    public static final <K, M extends Map<? super K, List<Character>>> M Ef(@m80.k char[] cArr, @m80.k M destination, @m80.k x00.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (char c11 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(c11));
        }
        return destination;
    }

    @m80.k
    public static final Set<Boolean> Eg(@m80.k boolean[] zArr, @m80.k Iterable<Boolean> other) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Boolean> yz2 = yz(zArr);
        m0.T0(yz2, other);
        return yz2;
    }

    public static /* synthetic */ String Eh(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return vh(objArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.k
    public static final <R> List<R> Ei(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> short Ej(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        if (Pe != 0) {
            R invoke = selector.invoke(Short.valueOf(s11));
            int i11 = 1;
            if (1 <= Pe) {
                while (true) {
                    short s12 = sArr[i11];
                    R invoke2 = selector.invoke(Short.valueOf(s12));
                    if (invoke.compareTo(invoke2) < 0) {
                        s11 = s12;
                        invoke = invoke2;
                    }
                    if (i11 == Pe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return s11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Ek(long[] jArr, x00.l<? super Long, Float> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Long.valueOf(jArr[i11])).floatValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final char El(@m80.k char[] cArr, @m80.k Comparator<? super Character> comparator) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                if (comparator.compare(Character.valueOf(c11), Character.valueOf(c12)) < 0) {
                    c11 = c12;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return c11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Em(boolean[] zArr, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                R invoke2 = selector.invoke(Boolean.valueOf(zArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Float En(@m80.k Float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        int Oe = Oe(fArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                floatValue = Math.min(floatValue, fArr[i11].floatValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final char[] Eo(char[] cArr, x00.l<? super Character, g2> action) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (char c11 : cArr) {
            action.invoke(Character.valueOf(c11));
        }
        return cArr;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final Float Ep(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return Fp(fArr, Random.Default);
    }

    public static final <S, T extends S> S Eq(@m80.k T[] tArr, @m80.k x00.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Oe = Oe(tArr);
        if (Oe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s11 = (S) tArr[Oe];
        for (int i11 = Oe - 1; i11 >= 0; i11--) {
            s11 = operation.invoke((Object) tArr[i11], s11);
        }
        return s11;
    }

    @m80.k
    public static final List<Float> Er(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return h0.J();
        }
        List<Float> kz2 = kz(fArr);
        o0.t1(kz2);
        return kz2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Es(char[] cArr, R r11, x00.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r11);
        for (char c11 : cArr) {
            r11 = operation.invoke(r11, Character.valueOf(c11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    public static final boolean Et(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @m80.k
    public static short[] Eu(@m80.k short[] sArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? new short[0] : a00.q.m1(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Long> Ev(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return ew(jArr, new g.a(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final int Ew(@m80.k short[] sArr, @m80.k x00.l<? super Short, Integer> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (short s11 : sArr) {
            i11 += selector.invoke(Short.valueOf(s11)).intValue();
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final int Ex(boolean[] zArr, x00.l<? super Boolean, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        for (boolean z11 : zArr) {
            i11 = yz.s1.i(i11 + selector.invoke(Boolean.valueOf(z11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final <C extends Collection<? super Double>> C Ey(@m80.k double[] dArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (double d11 : dArr) {
            destination.add(Double.valueOf(d11));
        }
        return destination;
    }

    @m80.k
    public static Set<Long> Ez(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? (Set) Hy(jArr, new LinkedHashSet(k1.j(jArr.length))) : v1.f(Long.valueOf(jArr[0])) : w1.k();
    }

    @m80.k
    public static final Iterable<Character> F5(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr.length == 0 ? h0.J() : new i(cArr);
    }

    @m80.k
    public static final <K, M extends Map<? super K, ? super Integer>> M F6(@m80.k int[] iArr, @m80.k M destination, @m80.k x00.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (int i11 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i11)), Integer.valueOf(i11));
        }
        return destination;
    }

    @o00.f
    public static final float F7(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr[0];
    }

    @yz.y0(version = "2.2")
    @kotlin.c
    @o00.f
    public static final char[] F8(char[] cArr, int i11, x00.l<? super Integer, Character> init) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        char[] copyOf = Arrays.copyOf(cArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        for (int length = cArr.length; length < i11; length++) {
            copyOf[length] = init.invoke(Integer.valueOf(length)).charValue();
        }
        return copyOf;
    }

    @m80.k
    public static final List<Boolean> F9(@m80.k boolean[] zArr, int i11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (i11 >= 0) {
            return gy(zArr, g10.u.u(zArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <V> List<V> FA(@m80.k float[] fArr, @m80.k float[] other, @m80.k x00.p<? super Float, ? super Float, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i11]), Float.valueOf(other[i11])));
        }
        return arrayList;
    }

    @m80.k
    public static final <T> List<T> Fa(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @o00.f
    public static final Boolean Fb(boolean[] zArr, x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                return Boolean.valueOf(z11);
            }
        }
        return null;
    }

    @m80.l
    public static <T> T Fc(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <R> R Fd(@m80.k boolean[] zArr, R r11, @m80.k x00.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (boolean z11 : zArr) {
            r11 = operation.invoke(r11, Boolean.valueOf(z11));
        }
        return r11;
    }

    @m80.k
    public static <T> g10.l Fe(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return new g10.l(0, Oe(tArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, M extends Map<? super K, List<V>>> M Ff(@m80.k char[] cArr, @m80.k M destination, @m80.k x00.l<? super Character, ? extends K> keySelector, @m80.k x00.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (char c11 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(c11)));
        }
        return destination;
    }

    @o00.f
    public static final boolean Fg(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr.length == 0;
    }

    public static /* synthetic */ String Fh(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return wh(sArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.k
    public static final <R> List<R> Fi(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j11 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j11)));
        }
        return arrayList;
    }

    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean Fj(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        if (Qe != 0) {
            R invoke = selector.invoke(Boolean.valueOf(z11));
            int i11 = 1;
            if (1 <= Qe) {
                while (true) {
                    boolean z12 = zArr[i11];
                    R invoke2 = selector.invoke(Boolean.valueOf(z12));
                    if (invoke.compareTo(invoke2) < 0) {
                        z11 = z12;
                        invoke = invoke2;
                    }
                    if (i11 == Qe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return z11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Float Fk(T[] tArr, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(tArr[i11]).floatValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final double Fl(@m80.k double[] dArr, @m80.k Comparator<? super Double> comparator) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                double d12 = dArr[i11];
                if (comparator.compare(Double.valueOf(d11), Double.valueOf(d12)) < 0) {
                    d11 = d12;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return d11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Fm(byte[] bArr, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                R invoke2 = selector.invoke(Byte.valueOf(bArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static Integer Fn(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                if (i11 > i13) {
                    i11 = i13;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final double[] Fo(double[] dArr, x00.l<? super Double, g2> action) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (double d11 : dArr) {
            action.invoke(Double.valueOf(d11));
        }
        return dArr;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Float Fp(@m80.k float[] fArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.nextInt(fArr.length)]);
    }

    public static final short Fq(@m80.k short[] sArr, @m80.k x00.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Pe = Pe(sArr);
        if (Pe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s11 = sArr[Pe];
        for (int i11 = Pe - 1; i11 >= 0; i11--) {
            s11 = operation.invoke(Short.valueOf(sArr[i11]), Short.valueOf(s11)).shortValue();
        }
        return s11;
    }

    @m80.k
    public static final List<Integer> Fr(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return h0.J();
        }
        List<Integer> lz2 = lz(iArr);
        o0.t1(lz2);
        return lz2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Fs(double[] dArr, R r11, x00.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r11);
        for (double d11 : dArr) {
            r11 = operation.invoke(r11, Double.valueOf(d11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    public static final boolean Ft(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Boolean bool = null;
        boolean z11 = false;
        for (boolean z12 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z12)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                bool = Boolean.valueOf(z12);
                z11 = true;
            }
        }
        if (!z11) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.g0.n(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }

    @m80.k
    public static short[] Fu(@m80.k short[] sArr, @m80.k Collection<Integer> indices) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            sArr2[i11] = sArr[it.next().intValue()];
            i11++;
        }
        return sArr2;
    }

    @m80.k
    public static final <T, R extends Comparable<? super R>> List<T> Fv(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return fw(tArr, new g.a(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final int Fw(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (boolean z11 : zArr) {
            i11 += selector.invoke(Boolean.valueOf(z11)).intValue();
        }
        return i11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final long Fx(byte[] bArr, x00.l<? super Byte, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (byte b11 : bArr) {
            i11 = yz.w1.i(i11 + selector.invoke(Byte.valueOf(b11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final <C extends Collection<? super Float>> C Fy(@m80.k float[] fArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (float f11 : fArr) {
            destination.add(Float.valueOf(f11));
        }
        return destination;
    }

    @m80.k
    public static <T> Set<T> Fz(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) Iy(tArr, new LinkedHashSet(k1.j(tArr.length))) : v1.f(tArr[0]) : w1.k();
    }

    @m80.k
    public static Iterable<Double> G5(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr.length == 0 ? h0.J() : new g(dArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M G6(@m80.k int[] iArr, @m80.k M destination, @m80.k x00.l<? super Integer, ? extends K> keySelector, @m80.k x00.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (int i11 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i11)), valueTransform.invoke(Integer.valueOf(i11)));
        }
        return destination;
    }

    @o00.f
    public static final int G7(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr[0];
    }

    @yz.y0(version = "2.2")
    @kotlin.c
    @o00.f
    public static final double[] G8(double[] dArr, int i11, x00.l<? super Integer, Double> init) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        double[] copyOf = Arrays.copyOf(dArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        for (int length = dArr.length; length < i11; length++) {
            copyOf[length] = init.invoke(Integer.valueOf(length)).doubleValue();
        }
        return copyOf;
    }

    @m80.k
    public static final List<Byte> G9(@m80.k byte[] bArr, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (i11 >= 0) {
            return Ox(bArr, g10.u.u(bArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R> List<Pair<Float, R>> GA(@m80.k float[] fArr, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            float f11 = fArr[i11];
            arrayList.add(yz.h1.a(Float.valueOf(f11), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Short> Ga(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                arrayList.add(Short.valueOf(s11));
            }
        }
        return arrayList;
    }

    @o00.f
    public static final Byte Gb(byte[] bArr, x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (byte b11 : bArr) {
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                return Byte.valueOf(b11);
            }
        }
        return null;
    }

    @m80.l
    public static final <T> T Gc(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        return null;
    }

    public static final <R> R Gd(@m80.k byte[] bArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, Byte.valueOf(bArr[i11]));
            i11++;
            i12++;
        }
        return r11;
    }

    @m80.k
    public static g10.l Ge(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return new g10.l(0, Pe(sArr));
    }

    @m80.k
    public static final <K, M extends Map<? super K, List<Double>>> M Gf(@m80.k double[] dArr, @m80.k M destination, @m80.k x00.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (double d11 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Double.valueOf(d11));
        }
        return destination;
    }

    @o00.f
    public static final boolean Gg(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr.length == 0;
    }

    public static /* synthetic */ String Gh(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return xh(zArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.k
    public static <T, R> List<R> Gi(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t11 : tArr) {
            arrayList.add(transform.invoke(t11));
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double Gj(byte[] bArr, x00.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Byte.valueOf(bArr[i11])).doubleValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Gk(short[] sArr, x00.l<? super Short, Float> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Short.valueOf(sArr[i11])).floatValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final float Gl(@m80.k float[] fArr, @m80.k Comparator<? super Float> comparator) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                float f12 = fArr[i11];
                if (comparator.compare(Float.valueOf(f11), Float.valueOf(f12)) < 0) {
                    f11 = f12;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return f11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Gm(char[] cArr, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                R invoke2 = selector.invoke(Character.valueOf(cArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Long Gn(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                if (j11 > j12) {
                    j11 = j12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final float[] Go(float[] fArr, x00.l<? super Float, g2> action) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (float f11 : fArr) {
            action.invoke(Float.valueOf(f11));
        }
        return fArr;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final Integer Gp(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return Hp(iArr, Random.Default);
    }

    public static final boolean Gq(@m80.k boolean[] zArr, @m80.k x00.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Qe = Qe(zArr);
        if (Qe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z11 = zArr[Qe];
        for (int i11 = Qe - 1; i11 >= 0; i11--) {
            z11 = operation.invoke(Boolean.valueOf(zArr[i11]), Boolean.valueOf(z11)).booleanValue();
        }
        return z11;
    }

    @m80.k
    public static final List<Long> Gr(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return h0.J();
        }
        List<Long> mz2 = mz(jArr);
        o0.t1(mz2);
        return mz2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Gs(float[] fArr, R r11, x00.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r11);
        for (float f11 : fArr) {
            r11 = operation.invoke(r11, Float.valueOf(f11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Boolean Gt(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    @m80.k
    public static final boolean[] Gu(@m80.k boolean[] zArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : a00.q.n1(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Short> Gv(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return gw(sArr, new g.a(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final double Gw(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (byte b11 : bArr) {
            d11 += selector.invoke(Byte.valueOf(b11)).doubleValue();
        }
        return d11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final long Gx(char[] cArr, x00.l<? super Character, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (char c11 : cArr) {
            i11 = yz.w1.i(i11 + selector.invoke(Character.valueOf(c11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final <C extends Collection<? super Integer>> C Gy(@m80.k int[] iArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (int i11 : iArr) {
            destination.add(Integer.valueOf(i11));
        }
        return destination;
    }

    @m80.k
    public static final Set<Short> Gz(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? (Set) Jy(sArr, new LinkedHashSet(k1.j(sArr.length))) : v1.f(Short.valueOf(sArr[0])) : w1.k();
    }

    @m80.k
    public static Iterable<Float> H5(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr.length == 0 ? h0.J() : new f(fArr);
    }

    @m80.k
    public static final <K, M extends Map<? super K, ? super Long>> M H6(@m80.k long[] jArr, @m80.k M destination, @m80.k x00.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (long j11 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j11)), Long.valueOf(j11));
        }
        return destination;
    }

    @o00.f
    public static final long H7(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr[0];
    }

    @yz.y0(version = "2.2")
    @kotlin.c
    @o00.f
    public static final float[] H8(float[] fArr, int i11, x00.l<? super Integer, Float> init) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        float[] copyOf = Arrays.copyOf(fArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        for (int length = fArr.length; length < i11; length++) {
            copyOf[length] = init.invoke(Integer.valueOf(length)).floatValue();
        }
        return copyOf;
    }

    @m80.k
    public static final List<Character> H9(@m80.k char[] cArr, int i11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (i11 >= 0) {
            return Px(cArr, g10.u.u(cArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R, V> List<V> HA(@m80.k float[] fArr, @m80.k R[] other, @m80.k x00.p<? super Float, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i11]), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Boolean> Ha(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z11));
            }
        }
        return arrayList;
    }

    @o00.f
    public static final Character Hb(char[] cArr, x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                return Character.valueOf(c11);
            }
        }
        return null;
    }

    @m80.l
    public static final Short Hc(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final <R> R Hd(@m80.k char[] cArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int length = cArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, Character.valueOf(cArr[i11]));
            i11++;
            i12++;
        }
        return r11;
    }

    @m80.k
    public static final g10.l He(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return new g10.l(0, Qe(zArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, M extends Map<? super K, List<V>>> M Hf(@m80.k double[] dArr, @m80.k M destination, @m80.k x00.l<? super Double, ? extends K> keySelector, @m80.k x00.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (double d11 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Double.valueOf(d11)));
        }
        return destination;
    }

    @o00.f
    public static final boolean Hg(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr.length == 0;
    }

    public static byte Hh(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[Ie(bArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.k
    public static final <R> List<R> Hi(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s11 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s11)));
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double Hj(char[] cArr, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(cArr[i11])).doubleValue());
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Hk(boolean[] zArr, x00.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Boolean.valueOf(zArr[i11])).floatValue());
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final int Hl(@m80.k int[] iArr, @m80.k Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                if (comparator.compare(Integer.valueOf(i11), Integer.valueOf(i13)) < 0) {
                    i11 = i13;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Hm(double[] dArr, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                R invoke2 = selector.invoke(Double.valueOf(dArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Short Hn(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                if (s11 > s12) {
                    s11 = s12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int[] Ho(int[] iArr, x00.l<? super Integer, g2> action) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (int i11 : iArr) {
            action.invoke(Integer.valueOf(i11));
        }
        return iArr;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Integer Hp(@m80.k int[] iArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.nextInt(iArr.length)]);
    }

    public static final byte Hq(@m80.k byte[] bArr, @m80.k x00.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ie = Ie(bArr);
        if (Ie < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b11 = bArr[Ie];
        for (int i11 = Ie - 1; i11 >= 0; i11--) {
            b11 = operation.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i11]), Byte.valueOf(b11)).byteValue();
        }
        return b11;
    }

    @m80.k
    public static final <T> List<T> Hr(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return h0.J();
        }
        List<T> nz2 = nz(tArr);
        o0.t1(nz2);
        return nz2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Hs(int[] iArr, R r11, x00.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r11);
        for (int i11 : iArr) {
            r11 = operation.invoke(r11, Integer.valueOf(i11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Boolean Ht(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Boolean bool = null;
        boolean z11 = false;
        for (boolean z12 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z12)).booleanValue()) {
                if (z11) {
                    return null;
                }
                bool = Boolean.valueOf(z12);
                z11 = true;
            }
        }
        if (z11) {
            return bool;
        }
        return null;
    }

    @m80.k
    public static final boolean[] Hu(@m80.k boolean[] zArr, @m80.k Collection<Integer> indices) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            zArr2[i11] = zArr[it.next().intValue()];
            i11++;
        }
        return zArr2;
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Boolean> Hv(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return hw(zArr, new g.a(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final double Hw(@m80.k char[] cArr, @m80.k x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (char c11 : cArr) {
            d11 += selector.invoke(Character.valueOf(c11)).doubleValue();
        }
        return d11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final long Hx(double[] dArr, x00.l<? super Double, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (double d11 : dArr) {
            i11 = yz.w1.i(i11 + selector.invoke(Double.valueOf(d11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final <C extends Collection<? super Long>> C Hy(@m80.k long[] jArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (long j11 : jArr) {
            destination.add(Long.valueOf(j11));
        }
        return destination;
    }

    @m80.k
    public static final Set<Boolean> Hz(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? (Set) Ky(zArr, new LinkedHashSet(k1.j(zArr.length))) : v1.f(Boolean.valueOf(zArr[0])) : w1.k();
    }

    @m80.k
    public static Iterable<Integer> I5(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr.length == 0 ? h0.J() : new d(iArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M I6(@m80.k long[] jArr, @m80.k M destination, @m80.k x00.l<? super Long, ? extends K> keySelector, @m80.k x00.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (long j11 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j11)), valueTransform.invoke(Long.valueOf(j11)));
        }
        return destination;
    }

    @o00.f
    public static final <T> T I7(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr[0];
    }

    @yz.y0(version = "2.2")
    @kotlin.c
    @o00.f
    public static final int[] I8(int[] iArr, int i11, x00.l<? super Integer, Integer> init) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        int[] copyOf = Arrays.copyOf(iArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        for (int length = iArr.length; length < i11; length++) {
            copyOf[length] = init.invoke(Integer.valueOf(length)).intValue();
        }
        return copyOf;
    }

    @m80.k
    public static final List<Double> I9(@m80.k double[] dArr, int i11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (i11 >= 0) {
            return Qx(dArr, g10.u.u(dArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R> List<Pair<Integer, R>> IA(@m80.k int[] iArr, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(Integer.valueOf(iArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final List<Byte> Ia(@m80.k byte[] bArr, @m80.k x00.p<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            byte b11 = bArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Byte.valueOf(b11)).booleanValue()) {
                arrayList.add(Byte.valueOf(b11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @o00.f
    public static final Double Ib(double[] dArr, x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (double d11 : dArr) {
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                return Double.valueOf(d11);
            }
        }
        return null;
    }

    @m80.l
    public static final Short Ic(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                return Short.valueOf(s11);
            }
        }
        return null;
    }

    public static final <R> R Id(@m80.k double[] dArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int length = dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, Double.valueOf(dArr[i11]));
            i11++;
            i12++;
        }
        return r11;
    }

    public static int Ie(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr.length - 1;
    }

    @m80.k
    public static final <K, M extends Map<? super K, List<Float>>> M If(@m80.k float[] fArr, @m80.k M destination, @m80.k x00.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (float f11 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Float.valueOf(f11));
        }
        return destination;
    }

    @o00.f
    public static final boolean Ig(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr.length == 0;
    }

    public static final byte Ih(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                byte b11 = bArr[length];
                if (!predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return b11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <R> List<R> Ii(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z11 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z11)));
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double Ij(double[] dArr, x00.l<? super Double, Double> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Double.valueOf(dArr[i11])).doubleValue());
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Ik(byte[] bArr, Comparator<? super R> comparator, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                Object obj2 = (R) selector.invoke(Byte.valueOf(bArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final long Il(@m80.k long[] jArr, @m80.k Comparator<? super Long> comparator) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                if (comparator.compare(Long.valueOf(j11), Long.valueOf(j12)) < 0) {
                    j11 = j12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return j11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Im(float[] fArr, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                R invoke2 = selector.invoke(Float.valueOf(fArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final byte In(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                if (b11 > b12) {
                    b11 = b12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return b11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final long[] Io(long[] jArr, x00.l<? super Long, g2> action) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (long j11 : jArr) {
            action.invoke(Long.valueOf(j11));
        }
        return jArr;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final Long Ip(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return Jp(jArr, Random.Default);
    }

    public static final char Iq(@m80.k char[] cArr, @m80.k x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Je = Je(cArr);
        if (Je < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c11 = cArr[Je];
        for (int i11 = Je - 1; i11 >= 0; i11--) {
            c11 = operation.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i11]), Character.valueOf(c11)).charValue();
        }
        return c11;
    }

    @m80.k
    public static final List<Short> Ir(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return h0.J();
        }
        List<Short> oz2 = oz(sArr);
        o0.t1(oz2);
        return oz2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Is(long[] jArr, R r11, x00.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r11);
        for (long j11 : jArr) {
            r11 = operation.invoke(r11, Long.valueOf(j11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Byte It(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void Iu(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length > 1) {
            a00.q.h4(tArr, new g.a(selector));
        }
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Byte> Iv(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return Zv(bArr, new g.c(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final double Iw(@m80.k double[] dArr, @m80.k x00.l<? super Double, Double> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (double d12 : dArr) {
            d11 += selector.invoke(Double.valueOf(d12)).doubleValue();
        }
        return d11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final long Ix(float[] fArr, x00.l<? super Float, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (float f11 : fArr) {
            i11 = yz.w1.i(i11 + selector.invoke(Float.valueOf(f11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C Iy(@m80.k T[] tArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (T t11 : tArr) {
            destination.add(t11);
        }
        return destination;
    }

    @m80.k
    public static final short[] Iz(@m80.k Short[] shArr) {
        kotlin.jvm.internal.g0.p(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i11 = 0; i11 < length; i11++) {
            sArr[i11] = shArr[i11].shortValue();
        }
        return sArr;
    }

    @m80.k
    public static Iterable<Long> J5(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr.length == 0 ? h0.J() : new e(jArr);
    }

    @m80.k
    public static final <T, K, M extends Map<? super K, ? super T>> M J6(@m80.k T[] tArr, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (T t11 : tArr) {
            destination.put(keySelector.invoke(t11), t11);
        }
        return destination;
    }

    @o00.f
    public static final short J7(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr[0];
    }

    @yz.y0(version = "2.2")
    @kotlin.c
    @o00.f
    public static final long[] J8(long[] jArr, int i11, x00.l<? super Integer, Long> init) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        long[] copyOf = Arrays.copyOf(jArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        for (int length = jArr.length; length < i11; length++) {
            copyOf[length] = init.invoke(Integer.valueOf(length)).longValue();
        }
        return copyOf;
    }

    @m80.k
    public static final List<Float> J9(@m80.k float[] fArr, int i11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (i11 >= 0) {
            return Rx(fArr, g10.u.u(fArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R, V> List<V> JA(@m80.k int[] iArr, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super Integer, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final List<Character> Ja(@m80.k char[] cArr, @m80.k x00.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            char c11 = cArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Character.valueOf(c11)).booleanValue()) {
                arrayList.add(Character.valueOf(c11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @o00.f
    public static final Float Jb(float[] fArr, x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (float f11 : fArr) {
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                return Float.valueOf(f11);
            }
        }
        return null;
    }

    @m80.k
    public static final <R> List<R> Jc(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b11 : bArr) {
            m0.s0(arrayList, transform.invoke(Byte.valueOf(b11)));
        }
        return arrayList;
    }

    public static final <R> R Jd(@m80.k float[] fArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int length = fArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, Float.valueOf(fArr[i11]));
            i11++;
            i12++;
        }
        return r11;
    }

    public static final int Je(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, M extends Map<? super K, List<V>>> M Jf(@m80.k float[] fArr, @m80.k M destination, @m80.k x00.l<? super Float, ? extends K> keySelector, @m80.k x00.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (float f11 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Float.valueOf(f11)));
        }
        return destination;
    }

    @o00.f
    public static final boolean Jg(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr.length == 0;
    }

    public static final char Jh(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[Je(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.k
    public static final <R> List<R> Ji(@m80.k byte[] bArr, @m80.k x00.p<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), Byte.valueOf(bArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double Jj(float[] fArr, x00.l<? super Float, Double> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Float.valueOf(fArr[i11])).doubleValue());
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Jk(char[] cArr, Comparator<? super R> comparator, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                Object obj2 = (R) selector.invoke(Character.valueOf(cArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final <T> T Jl(@m80.k T[] tArr, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                T t12 = tArr[i11];
                if (comparator.compare(t11, t12) < 0) {
                    t11 = t12;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return t11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Jm(int[] iArr, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                R invoke2 = selector.invoke(Integer.valueOf(iArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final char Jn(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                if (kotlin.jvm.internal.g0.t(c11, c12) > 0) {
                    c11 = c12;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return c11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> T[] Jo(T[] tArr, x00.l<? super T, g2> action) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (T t11 : tArr) {
            action.invoke(t11);
        }
        return tArr;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Long Jp(@m80.k long[] jArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.nextInt(jArr.length)]);
    }

    public static final double Jq(@m80.k double[] dArr, @m80.k x00.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ke = Ke(dArr);
        if (Ke < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d11 = dArr[Ke];
        for (int i11 = Ke - 1; i11 >= 0; i11--) {
            d11 = operation.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i11]), Double.valueOf(d11)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Boolean> Jr(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return h0.J();
        }
        List<Boolean> pz2 = pz(zArr);
        o0.t1(pz2);
        return pz2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @m80.k
    public static final <T, R> List<R> Js(@m80.k T[] tArr, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r11);
        for (d dVar : tArr) {
            r11 = operation.invoke(r11, dVar);
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Byte Jt(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Byte b11 = null;
        boolean z11 = false;
        for (byte b12 : bArr) {
            if (predicate.invoke(Byte.valueOf(b12)).booleanValue()) {
                if (z11) {
                    return null;
                }
                b11 = Byte.valueOf(b12);
                z11 = true;
            }
        }
        if (z11) {
            return b11;
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void Ju(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length > 1) {
            a00.q.h4(tArr, new g.c(selector));
        }
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Character> Jv(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return aw(cArr, new g.c(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final double Jw(@m80.k float[] fArr, @m80.k x00.l<? super Float, Double> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (float f11 : fArr) {
            d11 += selector.invoke(Float.valueOf(f11)).doubleValue();
        }
        return d11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final long Jx(int[] iArr, x00.l<? super Integer, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (int i12 : iArr) {
            i11 = yz.w1.i(i11 + selector.invoke(Integer.valueOf(i12)).m0());
        }
        return i11;
    }

    @m80.k
    public static final <C extends Collection<? super Short>> C Jy(@m80.k short[] sArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (short s11 : sArr) {
            destination.add(Short.valueOf(s11));
        }
        return destination;
    }

    @m80.k
    public static final Set<Byte> Jz(@m80.k byte[] bArr, @m80.k Iterable<Byte> other) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Byte> qz2 = qz(bArr);
        m0.s0(qz2, other);
        return qz2;
    }

    @m80.k
    public static <T> Iterable<T> K5(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr.length == 0 ? h0.J() : new a(tArr);
    }

    @m80.k
    public static final <T, K, V, M extends Map<? super K, ? super V>> M K6(@m80.k T[] tArr, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (T t11 : tArr) {
            destination.put(keySelector.invoke(t11), valueTransform.invoke(t11));
        }
        return destination;
    }

    @o00.f
    public static final boolean K7(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr[0];
    }

    @yz.y0(version = "2.2")
    @kotlin.c
    @o00.f
    public static final <T> T[] K8(T[] tArr, int i11, x00.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i11);
        kotlin.jvm.internal.g0.o(tArr2, "copyOf(...)");
        for (int length = tArr.length; length < i11; length++) {
            tArr2[length] = init.invoke(Integer.valueOf(length));
        }
        return tArr2;
    }

    @m80.k
    public static final List<Integer> K9(@m80.k int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (i11 >= 0) {
            return Sx(iArr, g10.u.u(iArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final List<Pair<Integer, Integer>> KA(@m80.k int[] iArr, @m80.k int[] other) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(yz.h1.a(Integer.valueOf(iArr[i11]), Integer.valueOf(other[i11])));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Double> Ka(@m80.k double[] dArr, @m80.k x00.p<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            double d11 = dArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Double.valueOf(d11)).booleanValue()) {
                arrayList.add(Double.valueOf(d11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @o00.f
    public static final Integer Kb(int[] iArr, x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return Integer.valueOf(i11);
            }
        }
        return null;
    }

    @m80.k
    public static final <R> List<R> Kc(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c11 : cArr) {
            m0.s0(arrayList, transform.invoke(Character.valueOf(c11)));
        }
        return arrayList;
    }

    public static final <R> R Kd(@m80.k int[] iArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, Integer.valueOf(iArr[i11]));
            i11++;
            i12++;
        }
        return r11;
    }

    public static final int Ke(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr.length - 1;
    }

    @m80.k
    public static final <K, M extends Map<? super K, List<Integer>>> M Kf(@m80.k int[] iArr, @m80.k M destination, @m80.k x00.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (int i11 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Integer.valueOf(i11));
        }
        return destination;
    }

    @o00.f
    public static final boolean Kg(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr.length == 0;
    }

    public static final char Kh(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                char c11 = cArr[length];
                if (!predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return c11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <R> List<R> Ki(@m80.k char[] cArr, @m80.k x00.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), Character.valueOf(cArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double Kj(int[] iArr, x00.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Integer.valueOf(iArr[i11])).doubleValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Kk(double[] dArr, Comparator<? super R> comparator, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                Object obj2 = (R) selector.invoke(Double.valueOf(dArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final short Kl(@m80.k short[] sArr, @m80.k Comparator<? super Short> comparator) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                if (comparator.compare(Short.valueOf(s11), Short.valueOf(s12)) < 0) {
                    s11 = s12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Km(long[] jArr, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                R invoke2 = selector.invoke(Long.valueOf(jArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final double Kn(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                d11 = Math.min(d11, dArr[i11]);
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return d11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final short[] Ko(short[] sArr, x00.l<? super Short, g2> action) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (short s11 : sArr) {
            action.invoke(Short.valueOf(s11));
        }
        return sArr;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> T Kp(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return (T) Lp(tArr, Random.Default);
    }

    public static final float Kq(@m80.k float[] fArr, @m80.k x00.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Le = Le(fArr);
        if (Le < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f11 = fArr[Le];
        for (int i11 = Le - 1; i11 >= 0; i11--) {
            f11 = operation.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i11]), Float.valueOf(f11)).floatValue();
        }
        return f11;
    }

    @m80.k
    public static byte[] Kr(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int Ie = Ie(bArr);
        if (Ie >= 0) {
            int i11 = 0;
            while (true) {
                bArr2[Ie - i11] = bArr[i11];
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return bArr2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Ks(short[] sArr, R r11, x00.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r11);
        for (short s11 : sArr) {
            r11 = operation.invoke(r11, Short.valueOf(s11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Character Kt(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final void Ku(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length > 1) {
            a00.q.G3(bArr);
            jr(bArr);
        }
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Double> Kv(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return bw(dArr, new g.c(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final double Kw(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (int i11 : iArr) {
            d11 += selector.invoke(Integer.valueOf(i11)).doubleValue();
        }
        return d11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final long Kx(long[] jArr, x00.l<? super Long, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (long j11 : jArr) {
            i11 = yz.w1.i(i11 + selector.invoke(Long.valueOf(j11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final <C extends Collection<? super Boolean>> C Ky(@m80.k boolean[] zArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (boolean z11 : zArr) {
            destination.add(Boolean.valueOf(z11));
        }
        return destination;
    }

    @m80.k
    public static final Set<Character> Kz(@m80.k char[] cArr, @m80.k Iterable<Character> other) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Character> rz2 = rz(cArr);
        m0.s0(rz2, other);
        return rz2;
    }

    @m80.k
    public static final Iterable<Short> L5(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr.length == 0 ? h0.J() : new c(sArr);
    }

    @m80.k
    public static final <K, M extends Map<? super K, ? super Short>> M L6(@m80.k short[] sArr, @m80.k M destination, @m80.k x00.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (short s11 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s11)), Short.valueOf(s11));
        }
        return destination;
    }

    @o00.f
    public static final byte L7(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr[1];
    }

    @yz.y0(version = "2.2")
    @kotlin.c
    @o00.f
    public static final short[] L8(short[] sArr, int i11, x00.l<? super Integer, Short> init) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        short[] copyOf = Arrays.copyOf(sArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        for (int length = sArr.length; length < i11; length++) {
            copyOf[length] = init.invoke(Integer.valueOf(length)).shortValue();
        }
        return copyOf;
    }

    @m80.k
    public static final List<Long> L9(@m80.k long[] jArr, int i11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (i11 >= 0) {
            return Tx(jArr, g10.u.u(jArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <V> List<V> LA(@m80.k int[] iArr, @m80.k int[] other, @m80.k x00.p<? super Integer, ? super Integer, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i11]), Integer.valueOf(other[i11])));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Float> La(@m80.k float[] fArr, @m80.k x00.p<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            float f11 = fArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Float.valueOf(f11)).booleanValue()) {
                arrayList.add(Float.valueOf(f11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @o00.f
    public static final Long Lb(long[] jArr, x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                return Long.valueOf(j11);
            }
        }
        return null;
    }

    @m80.k
    public static final <R> List<R> Lc(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d11 : dArr) {
            m0.s0(arrayList, transform.invoke(Double.valueOf(d11)));
        }
        return arrayList;
    }

    public static final <R> R Ld(@m80.k long[] jArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int length = jArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, Long.valueOf(jArr[i11]));
            i11++;
            i12++;
        }
        return r11;
    }

    public static int Le(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, M extends Map<? super K, List<V>>> M Lf(@m80.k int[] iArr, @m80.k M destination, @m80.k x00.l<? super Integer, ? extends K> keySelector, @m80.k x00.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (int i11 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Integer.valueOf(i11)));
        }
        return destination;
    }

    @o00.f
    public static final <T> boolean Lg(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr.length == 0;
    }

    public static final double Lh(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[Ke(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.k
    public static final <R> List<R> Li(@m80.k double[] dArr, @m80.k x00.p<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), Double.valueOf(dArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double Lj(long[] jArr, x00.l<? super Long, Double> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Long.valueOf(jArr[i11])).doubleValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Lk(float[] fArr, Comparator<? super R> comparator, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                Object obj2 = (R) selector.invoke(Float.valueOf(fArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final boolean Ll(@m80.k boolean[] zArr, @m80.k Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                boolean z12 = zArr[i11];
                if (comparator.compare(Boolean.valueOf(z11), Boolean.valueOf(z12)) < 0) {
                    z11 = z12;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return z11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R Lm(T[] tArr, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(tArr[0]);
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                R invoke2 = selector.invoke(tArr[i11]);
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final double Ln(@m80.k Double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        int Oe = Oe(dArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                doubleValue = Math.min(doubleValue, dArr[i11].doubleValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean[] Lo(boolean[] zArr, x00.l<? super Boolean, g2> action) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (boolean z11 : zArr) {
            action.invoke(Boolean.valueOf(z11));
        }
        return zArr;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <T> T Lp(@m80.k T[] tArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.nextInt(tArr.length)];
    }

    public static final int Lq(@m80.k int[] iArr, @m80.k x00.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Me = Me(iArr);
        if (Me < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i11 = iArr[Me];
        for (int i12 = Me - 1; i12 >= 0; i12--) {
            i11 = operation.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i12]), Integer.valueOf(i11)).intValue();
        }
        return i11;
    }

    @m80.k
    public static final char[] Lr(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int Je = Je(cArr);
        if (Je >= 0) {
            int i11 = 0;
            while (true) {
                cArr2[Je - i11] = cArr[i11];
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return cArr2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Ls(boolean[] zArr, R r11, x00.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r11);
        for (boolean z11 : zArr) {
            r11 = operation.invoke(r11, Boolean.valueOf(z11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Character Lt(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Character ch2 = null;
        boolean z11 = false;
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                if (z11) {
                    return null;
                }
                ch2 = Character.valueOf(c11);
                z11 = true;
            }
        }
        if (z11) {
            return ch2;
        }
        return null;
    }

    @yz.y0(version = "1.4")
    public static final void Lu(@m80.k byte[] bArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        a00.q.H3(bArr, i11, i12);
        kr(bArr, i11, i12);
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Float> Lv(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return cw(fArr, new g.c(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final double Lw(@m80.k long[] jArr, @m80.k x00.l<? super Long, Double> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (long j11 : jArr) {
            d11 += selector.invoke(Long.valueOf(j11)).doubleValue();
        }
        return d11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final <T> long Lx(T[] tArr, x00.l<? super T, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (T t11 : tArr) {
            i11 = yz.w1.i(i11 + selector.invoke(t11).m0());
        }
        return i11;
    }

    @m80.k
    public static final double[] Ly(@m80.k Double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i11 = 0; i11 < length; i11++) {
            dArr2[i11] = dArr[i11].doubleValue();
        }
        return dArr2;
    }

    @m80.k
    public static final Set<Double> Lz(@m80.k double[] dArr, @m80.k Iterable<Double> other) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Double> sz2 = sz(dArr);
        m0.s0(sz2, other);
        return sz2;
    }

    @m80.k
    public static final Iterable<Boolean> M5(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr.length == 0 ? h0.J() : new h(zArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M M6(@m80.k short[] sArr, @m80.k M destination, @m80.k x00.l<? super Short, ? extends K> keySelector, @m80.k x00.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (short s11 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s11)), valueTransform.invoke(Short.valueOf(s11)));
        }
        return destination;
    }

    @o00.f
    public static final char M7(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr[1];
    }

    @yz.y0(version = "2.2")
    @kotlin.c
    @o00.f
    public static final boolean[] M8(boolean[] zArr, int i11, x00.l<? super Integer, Boolean> init) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        boolean[] copyOf = Arrays.copyOf(zArr, i11);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        for (int length = zArr.length; length < i11; length++) {
            copyOf[length] = init.invoke(Integer.valueOf(length)).booleanValue();
        }
        return copyOf;
    }

    @m80.k
    public static final <T> List<T> M9(@m80.k T[] tArr, int i11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (i11 >= 0) {
            return Ux(tArr, g10.u.u(tArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R> List<Pair<Integer, R>> MA(@m80.k int[] iArr, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            int i12 = iArr[i11];
            arrayList.add(yz.h1.a(Integer.valueOf(i12), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Integer> Ma(@m80.k int[] iArr, @m80.k x00.p<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            int i14 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Integer.valueOf(i13)).booleanValue()) {
                arrayList.add(Integer.valueOf(i13));
            }
            i11++;
            i12 = i14;
        }
        return arrayList;
    }

    @o00.f
    public static final <T> T Mb(T[] tArr, x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        return null;
    }

    @m80.k
    public static final <R> List<R> Mc(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f11 : fArr) {
            m0.s0(arrayList, transform.invoke(Float.valueOf(f11)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Md(@m80.k T[] tArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, tArr[i11]);
            i11++;
            i12++;
        }
        return r11;
    }

    public static int Me(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr.length - 1;
    }

    @m80.k
    public static final <K, M extends Map<? super K, List<Long>>> M Mf(@m80.k long[] jArr, @m80.k M destination, @m80.k x00.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (long j11 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Long.valueOf(j11));
        }
        return destination;
    }

    @o00.f
    public static final boolean Mg(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr.length == 0;
    }

    public static final double Mh(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                double d11 = dArr[length];
                if (!predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return d11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <R> List<R> Mi(@m80.k float[] fArr, @m80.k x00.p<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), Float.valueOf(fArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> double Mj(T[] tArr, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(tArr[i11]).doubleValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Mk(int[] iArr, Comparator<? super R> comparator, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                Object obj2 = (R) selector.invoke(Integer.valueOf(iArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean Ml(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        if (Qe == 0) {
            return Boolean.valueOf(z11);
        }
        R invoke = selector.invoke(Boolean.valueOf(z11));
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                boolean z12 = zArr[i11];
                R invoke2 = selector.invoke(Boolean.valueOf(z12));
                if (invoke.compareTo(invoke2) > 0) {
                    z11 = z12;
                    invoke = invoke2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Mm(short[] sArr, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                R invoke2 = selector.invoke(Short.valueOf(sArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final float Mn(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                f11 = Math.min(f11, fArr[i11]);
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return f11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final byte[] Mo(byte[] bArr, x00.p<? super Integer, ? super Byte, g2> action) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Byte.valueOf(bArr[i11]));
            i11++;
            i12++;
        }
        return bArr;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final Short Mp(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return Np(sArr, Random.Default);
    }

    public static final long Mq(@m80.k long[] jArr, @m80.k x00.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ne = Ne(jArr);
        if (Ne < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j11 = jArr[Ne];
        for (int i11 = Ne - 1; i11 >= 0; i11--) {
            j11 = operation.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i11]), Long.valueOf(j11)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final double[] Mr(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int Ke = Ke(dArr);
        if (Ke >= 0) {
            int i11 = 0;
            while (true) {
                dArr2[Ke - i11] = dArr[i11];
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return dArr2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Ms(byte[] bArr, R r11, x00.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r11);
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Byte.valueOf(bArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Double Mt(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final void Mu(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length > 1) {
            a00.q.I3(cArr);
            lr(cArr);
        }
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Integer> Mv(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return dw(iArr, new g.c(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final <T> double Mw(@m80.k T[] tArr, @m80.k x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (T t11 : tArr) {
            d11 += selector.invoke(t11).doubleValue();
        }
        return d11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final long Mx(short[] sArr, x00.l<? super Short, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (short s11 : sArr) {
            i11 = yz.w1.i(i11 + selector.invoke(Short.valueOf(s11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final float[] My(@m80.k Float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i11 = 0; i11 < length; i11++) {
            fArr2[i11] = fArr[i11].floatValue();
        }
        return fArr2;
    }

    @m80.k
    public static final Set<Float> Mz(@m80.k float[] fArr, @m80.k Iterable<Float> other) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Float> tz2 = tz(fArr);
        m0.s0(tz2, other);
        return tz2;
    }

    @m80.k
    public static final q30.m<Byte> N5(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr.length == 0 ? q30.x.l() : new k(bArr);
    }

    @m80.k
    public static final <K, M extends Map<? super K, ? super Boolean>> M N6(@m80.k boolean[] zArr, @m80.k M destination, @m80.k x00.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (boolean z11 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z11)), Boolean.valueOf(z11));
        }
        return destination;
    }

    @o00.f
    public static final double N7(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr[1];
    }

    @o00.f
    public static final int N8(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr.length;
    }

    @m80.k
    public static final List<Short> N9(@m80.k short[] sArr, int i11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (i11 >= 0) {
            return Vx(sArr, g10.u.u(sArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R, V> List<V> NA(@m80.k int[] iArr, @m80.k R[] other, @m80.k x00.p<? super Integer, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i11]), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Long> Na(@m80.k long[] jArr, @m80.k x00.p<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            long j11 = jArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Long.valueOf(j11)).booleanValue()) {
                arrayList.add(Long.valueOf(j11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @o00.f
    public static final Short Nb(short[] sArr, x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                return Short.valueOf(s11);
            }
        }
        return null;
    }

    @m80.k
    public static final <R> List<R> Nc(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    public static final <R> R Nd(@m80.k short[] sArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int length = sArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, Short.valueOf(sArr[i11]));
            i11++;
            i12++;
        }
        return r11;
    }

    public static int Ne(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, M extends Map<? super K, List<V>>> M Nf(@m80.k long[] jArr, @m80.k M destination, @m80.k x00.l<? super Long, ? extends K> keySelector, @m80.k x00.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (long j11 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Long.valueOf(j11)));
        }
        return destination;
    }

    @o00.f
    public static final boolean Ng(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr.length == 0;
    }

    public static final float Nh(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[Le(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.k
    public static final <R> List<R> Ni(@m80.k int[] iArr, @m80.k x00.p<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double Nj(short[] sArr, x00.l<? super Short, Double> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Short.valueOf(sArr[i11])).doubleValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Nk(long[] jArr, Comparator<? super R> comparator, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                Object obj2 = (R) selector.invoke(Long.valueOf(jArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte Nl(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        if (Ie == 0) {
            return Byte.valueOf(b11);
        }
        R invoke = selector.invoke(Byte.valueOf(b11));
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                R invoke2 = selector.invoke(Byte.valueOf(b12));
                if (invoke.compareTo(invoke2) > 0) {
                    b11 = b12;
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Nm(boolean[] zArr, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                R invoke2 = selector.invoke(Boolean.valueOf(zArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final float Nn(@m80.k Float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = fArr[0].floatValue();
        int Oe = Oe(fArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                floatValue = Math.min(floatValue, fArr[i11].floatValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final char[] No(char[] cArr, x00.p<? super Integer, ? super Character, g2> action) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = cArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Character.valueOf(cArr[i11]));
            i11++;
            i12++;
        }
        return cArr;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Short Np(@m80.k short[] sArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.nextInt(sArr.length)]);
    }

    public static final <S, T extends S> S Nq(@m80.k T[] tArr, @m80.k x00.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Oe = Oe(tArr);
        if (Oe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s11 = (S) tArr[Oe];
        for (int i11 = Oe - 1; i11 >= 0; i11--) {
            s11 = operation.invoke(Integer.valueOf(i11), (Object) tArr[i11], s11);
        }
        return s11;
    }

    @m80.k
    public static final float[] Nr(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int Le = Le(fArr);
        if (Le >= 0) {
            int i11 = 0;
            while (true) {
                fArr2[Le - i11] = fArr[i11];
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return fArr2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Ns(char[] cArr, R r11, x00.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r11);
        int length = cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Character.valueOf(cArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Double Nt(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Double d11 = null;
        boolean z11 = false;
        for (double d12 : dArr) {
            if (predicate.invoke(Double.valueOf(d12)).booleanValue()) {
                if (z11) {
                    return null;
                }
                d11 = Double.valueOf(d12);
                z11 = true;
            }
        }
        if (z11) {
            return d11;
        }
        return null;
    }

    @yz.y0(version = "1.4")
    public static final void Nu(@m80.k char[] cArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        a00.q.J3(cArr, i11, i12);
        mr(cArr, i11, i12);
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Long> Nv(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return ew(jArr, new g.c(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final double Nw(@m80.k short[] sArr, @m80.k x00.l<? super Short, Double> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (short s11 : sArr) {
            d11 += selector.invoke(Short.valueOf(s11)).doubleValue();
        }
        return d11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final long Nx(boolean[] zArr, x00.l<? super Boolean, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (boolean z11 : zArr) {
            i11 = yz.w1.i(i11 + selector.invoke(Boolean.valueOf(z11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final HashSet<Byte> Ny(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return (HashSet) Cy(bArr, new HashSet(k1.j(bArr.length)));
    }

    @m80.k
    public static final Set<Integer> Nz(@m80.k int[] iArr, @m80.k Iterable<Integer> other) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Integer> uz2 = uz(iArr);
        m0.s0(uz2, other);
        return uz2;
    }

    @m80.k
    public static final q30.m<Character> O5(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr.length == 0 ? q30.x.l() : new r(cArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M O6(@m80.k boolean[] zArr, @m80.k M destination, @m80.k x00.l<? super Boolean, ? extends K> keySelector, @m80.k x00.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (boolean z11 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z11)), valueTransform.invoke(Boolean.valueOf(z11)));
        }
        return destination;
    }

    @o00.f
    public static final float O7(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr[1];
    }

    public static final int O8(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (byte b11 : bArr) {
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @m80.k
    public static final List<Boolean> O9(@m80.k boolean[] zArr, int i11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (i11 >= 0) {
            return Wx(zArr, g10.u.u(zArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R> List<Pair<Long, R>> OA(@m80.k long[] jArr, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(Long.valueOf(jArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final <T> List<T> Oa(@m80.k T[] tArr, @m80.k x00.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            T t11 = tArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), t11).booleanValue()) {
                arrayList.add(t11);
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @o00.f
    public static final Boolean Ob(boolean[] zArr, x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            boolean z11 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                return Boolean.valueOf(z11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.k
    public static final <R> List<R> Oc(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j11 : jArr) {
            m0.s0(arrayList, transform.invoke(Long.valueOf(j11)));
        }
        return arrayList;
    }

    public static final <R> R Od(@m80.k boolean[] zArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int length = zArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, Boolean.valueOf(zArr[i11]));
            i11++;
            i12++;
        }
        return r11;
    }

    public static <T> int Oe(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr.length - 1;
    }

    @m80.k
    public static final <T, K, M extends Map<? super K, List<T>>> M Of(@m80.k T[] tArr, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (T t11 : tArr) {
            K invoke = keySelector.invoke(t11);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(t11);
        }
        return destination;
    }

    @o00.f
    public static final boolean Og(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final float Oh(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                float f11 = fArr[length];
                if (!predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return f11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <R> List<R> Oi(@m80.k long[] jArr, @m80.k x00.p<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), Long.valueOf(jArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double Oj(boolean[] zArr, x00.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Boolean.valueOf(zArr[i11])).doubleValue());
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R Ok(T[] tArr, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(tArr[0]);
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                Object obj2 = (R) selector.invoke(tArr[i11]);
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Character Ol(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        if (Je == 0) {
            return Character.valueOf(c11);
        }
        R invoke = selector.invoke(Character.valueOf(c11));
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                R invoke2 = selector.invoke(Character.valueOf(c12));
                if (invoke.compareTo(invoke2) > 0) {
                    c11 = c12;
                    invoke = invoke2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double Om(byte[] bArr, x00.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Byte.valueOf(bArr[i11])).doubleValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static int On(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                if (i11 > i13) {
                    i11 = i13;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final double[] Oo(double[] dArr, x00.p<? super Integer, ? super Double, g2> action) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Double.valueOf(dArr[i11]));
            i11++;
            i12++;
        }
        return dArr;
    }

    public static final byte Op(@m80.k byte[] bArr, @m80.k x00.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                b11 = operation.invoke(Byte.valueOf(b11), Byte.valueOf(bArr[i11])).byteValue();
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return b11;
    }

    public static final short Oq(@m80.k short[] sArr, @m80.k x00.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Pe = Pe(sArr);
        if (Pe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s11 = sArr[Pe];
        for (int i11 = Pe - 1; i11 >= 0; i11--) {
            s11 = operation.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i11]), Short.valueOf(s11)).shortValue();
        }
        return s11;
    }

    @m80.k
    public static int[] Or(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int Me = Me(iArr);
        if (Me >= 0) {
            int i11 = 0;
            while (true) {
                iArr2[Me - i11] = iArr[i11];
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return iArr2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Os(double[] dArr, R r11, x00.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r11);
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Double.valueOf(dArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Float Ot(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final void Ou(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length > 1) {
            a00.q.K3(dArr);
            nr(dArr);
        }
    }

    @m80.k
    public static final <T, R extends Comparable<? super R>> List<T> Ov(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return fw(tArr, new g.c(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final double Ow(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (boolean z11 : zArr) {
            d11 += selector.invoke(Boolean.valueOf(z11)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Byte> Ox(@m80.k byte[] bArr, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= bArr.length) {
            return Xy(bArr);
        }
        if (i11 == 1) {
            return g0.l(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (byte b11 : bArr) {
            arrayList.add(Byte.valueOf(b11));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final HashSet<Character> Oy(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return (HashSet) Dy(cArr, new HashSet(k1.j(g10.u.B(cArr.length, 128))));
    }

    @m80.k
    public static final Set<Long> Oz(@m80.k long[] jArr, @m80.k Iterable<Long> other) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Long> vz2 = vz(jArr);
        m0.s0(vz2, other);
        return vz2;
    }

    @m80.k
    public static final q30.m<Double> P5(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr.length == 0 ? q30.x.l() : new p(dArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M P6(@m80.k byte[] bArr, @m80.k M destination, @m80.k x00.l<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (byte b11 : bArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Byte.valueOf(b11));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @o00.f
    public static final int P7(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr[1];
    }

    @o00.f
    public static final int P8(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr.length;
    }

    @m80.k
    public static final List<Byte> P9(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Ie = Ie(bArr); -1 < Ie; Ie--) {
            if (!predicate.invoke(Byte.valueOf(bArr[Ie])).booleanValue()) {
                return Ox(bArr, Ie + 1);
            }
        }
        return h0.J();
    }

    @m80.k
    public static final <R, V> List<V> PA(@m80.k long[] jArr, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super Long, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final List<Short> Pa(@m80.k short[] sArr, @m80.k x00.p<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            short s11 = sArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Short.valueOf(s11)).booleanValue()) {
                arrayList.add(Short.valueOf(s11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @o00.f
    public static final Byte Pb(byte[] bArr, x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            byte b11 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                return Byte.valueOf(b11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.k
    public static final <T, R> List<R> Pc(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t11 : tArr) {
            m0.s0(arrayList, transform.invoke(t11));
        }
        return arrayList;
    }

    public static final <R> R Pd(@m80.k byte[] bArr, R r11, @m80.k x00.p<? super Byte, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Ie = Ie(bArr); Ie >= 0; Ie--) {
            r11 = operation.invoke(Byte.valueOf(bArr[Ie]), r11);
        }
        return r11;
    }

    public static int Pe(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T, K, V, M extends Map<? super K, List<V>>> M Pf(@m80.k T[] tArr, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (T t11 : tArr) {
            K invoke = keySelector.invoke(t11);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(t11));
        }
        return destination;
    }

    @o00.f
    public static final boolean Pg(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static int Ph(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[Me(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.k
    public static final <T, R> List<R> Pi(@m80.k T[] tArr, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), tArr[i11]));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float Pj(byte[] bArr, x00.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Byte.valueOf(bArr[i11])).floatValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Pk(short[] sArr, Comparator<? super R> comparator, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                Object obj2 = (R) selector.invoke(Short.valueOf(sArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Double Pl(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        if (Ke == 0) {
            return Double.valueOf(d11);
        }
        R invoke = selector.invoke(Double.valueOf(d11));
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                double d12 = dArr[i11];
                R invoke2 = selector.invoke(Double.valueOf(d12));
                if (invoke.compareTo(invoke2) > 0) {
                    d11 = d12;
                    invoke = invoke2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double Pm(char[] cArr, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(cArr[i11])).doubleValue());
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final long Pn(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                if (j11 > j12) {
                    j11 = j12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return j11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final float[] Po(float[] fArr, x00.p<? super Integer, ? super Float, g2> action) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = fArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Float.valueOf(fArr[i11]));
            i11++;
            i12++;
        }
        return fArr;
    }

    public static final char Pp(@m80.k char[] cArr, @m80.k x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                c11 = operation.invoke(Character.valueOf(c11), Character.valueOf(cArr[i11])).charValue();
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return c11;
    }

    public static final boolean Pq(@m80.k boolean[] zArr, @m80.k x00.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Qe = Qe(zArr);
        if (Qe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z11 = zArr[Qe];
        for (int i11 = Qe - 1; i11 >= 0; i11--) {
            z11 = operation.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i11]), Boolean.valueOf(z11)).booleanValue();
        }
        return z11;
    }

    @m80.k
    public static long[] Pr(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int Ne = Ne(jArr);
        if (Ne >= 0) {
            int i11 = 0;
            while (true) {
                jArr2[Ne - i11] = jArr[i11];
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return jArr2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Ps(float[] fArr, R r11, x00.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r11);
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Float.valueOf(fArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Float Pt(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Float f11 = null;
        boolean z11 = false;
        for (float f12 : fArr) {
            if (predicate.invoke(Float.valueOf(f12)).booleanValue()) {
                if (z11) {
                    return null;
                }
                f11 = Float.valueOf(f12);
                z11 = true;
            }
        }
        if (z11) {
            return f11;
        }
        return null;
    }

    @yz.y0(version = "1.4")
    public static void Pu(@m80.k double[] dArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        a00.q.L3(dArr, i11, i12);
        or(dArr, i11, i12);
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Short> Pv(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return gw(sArr, new g.c(selector));
    }

    @w00.j(name = "sumOfByte")
    public static final int Pw(@m80.k Byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int i11 = 0;
        for (Byte b11 : bArr) {
            i11 += b11.byteValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Character> Px(@m80.k char[] cArr, int i11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= cArr.length) {
            return Yy(cArr);
        }
        if (i11 == 1) {
            return g0.l(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (char c11 : cArr) {
            arrayList.add(Character.valueOf(c11));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final HashSet<Double> Py(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return (HashSet) Ey(dArr, new HashSet(k1.j(dArr.length)));
    }

    @m80.k
    public static final <T> Set<T> Pz(@m80.k T[] tArr, @m80.k Iterable<? extends T> other) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<T> wz2 = wz(tArr);
        m0.s0(wz2, other);
        return wz2;
    }

    @m80.k
    public static final q30.m<Float> Q5(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr.length == 0 ? q30.x.l() : new o(fArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M Q6(@m80.k char[] cArr, @m80.k M destination, @m80.k x00.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (char c11 : cArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(c11));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @o00.f
    public static final long Q7(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr[1];
    }

    public static final int Q8(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @m80.k
    public static final List<Character> Q9(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Je = Je(cArr); -1 < Je; Je--) {
            if (!predicate.invoke(Character.valueOf(cArr[Je])).booleanValue()) {
                return Px(cArr, Je + 1);
            }
        }
        return h0.J();
    }

    @m80.k
    public static final List<Pair<Long, Long>> QA(@m80.k long[] jArr, @m80.k long[] other) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(yz.h1.a(Long.valueOf(jArr[i11]), Long.valueOf(other[i11])));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Boolean> Qa(@m80.k boolean[] zArr, @m80.k x00.p<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            boolean z11 = zArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Boolean.valueOf(z11)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @o00.f
    public static final Character Qb(char[] cArr, x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            char c11 = cArr[length];
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                return Character.valueOf(c11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.k
    public static final <R> List<R> Qc(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s11 : sArr) {
            m0.s0(arrayList, transform.invoke(Short.valueOf(s11)));
        }
        return arrayList;
    }

    public static final <R> R Qd(@m80.k char[] cArr, R r11, @m80.k x00.p<? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Je = Je(cArr); Je >= 0; Je--) {
            r11 = operation.invoke(Character.valueOf(cArr[Je]), r11);
        }
        return r11;
    }

    public static final int Qe(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr.length - 1;
    }

    @m80.k
    public static final <K, M extends Map<? super K, List<Short>>> M Qf(@m80.k short[] sArr, @m80.k M destination, @m80.k x00.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (short s11 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Short.valueOf(s11));
        }
        return destination;
    }

    @o00.f
    public static final boolean Qg(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final int Qh(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                int i12 = iArr[length];
                if (!predicate.invoke(Integer.valueOf(i12)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return i12;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <R> List<R> Qi(@m80.k short[] sArr, @m80.k x00.p<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), Short.valueOf(sArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float Qj(char[] cArr, x00.l<? super Character, Float> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(cArr[i11])).floatValue());
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Qk(boolean[] zArr, Comparator<? super R> comparator, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                Object obj2 = (R) selector.invoke(Boolean.valueOf(zArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Float Ql(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        if (Le == 0) {
            return Float.valueOf(f11);
        }
        R invoke = selector.invoke(Float.valueOf(f11));
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                float f12 = fArr[i11];
                R invoke2 = selector.invoke(Float.valueOf(f12));
                if (invoke.compareTo(invoke2) > 0) {
                    f11 = f12;
                    invoke = invoke2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double Qm(double[] dArr, x00.l<? super Double, Double> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Double.valueOf(dArr[i11])).doubleValue());
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    @m80.k
    public static <T extends Comparable<? super T>> T Qn(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                T t12 = tArr[i11];
                if (t11.compareTo(t12) > 0) {
                    t11 = t12;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return t11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final int[] Qo(int[] iArr, x00.p<? super Integer, ? super Integer, g2> action) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i11]));
            i11++;
            i12++;
        }
        return iArr;
    }

    public static final double Qp(@m80.k double[] dArr, @m80.k x00.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                d11 = operation.invoke(Double.valueOf(d11), Double.valueOf(dArr[i11])).doubleValue();
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return d11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Boolean Qq(@m80.k boolean[] zArr, @m80.k x00.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Qe = Qe(zArr);
        if (Qe < 0) {
            return null;
        }
        boolean z11 = zArr[Qe];
        for (int i11 = Qe - 1; i11 >= 0; i11--) {
            z11 = operation.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i11]), Boolean.valueOf(z11)).booleanValue();
        }
        return Boolean.valueOf(z11);
    }

    @m80.k
    public static final <T> T[] Qr(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) a00.o.a(tArr, tArr.length);
        int Oe = Oe(tArr);
        if (Oe >= 0) {
            int i11 = 0;
            while (true) {
                tArr2[Oe - i11] = tArr[i11];
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return tArr2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Qs(int[] iArr, R r11, x00.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r11);
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Integer.valueOf(iArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Integer Qt(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static final void Qu(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length > 1) {
            a00.q.M3(fArr);
            pr(fArr);
        }
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Boolean> Qv(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return hw(zArr, new g.c(selector));
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final double Qw(byte[] bArr, x00.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (byte b11 : bArr) {
            d11 += selector.invoke(Byte.valueOf(b11)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Double> Qx(@m80.k double[] dArr, int i11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= dArr.length) {
            return Zy(dArr);
        }
        if (i11 == 1) {
            return g0.l(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (double d11 : dArr) {
            arrayList.add(Double.valueOf(d11));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final HashSet<Float> Qy(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return (HashSet) Fy(fArr, new HashSet(k1.j(fArr.length)));
    }

    @m80.k
    public static final Set<Short> Qz(@m80.k short[] sArr, @m80.k Iterable<Short> other) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Short> xz2 = xz(sArr);
        m0.s0(xz2, other);
        return xz2;
    }

    @m80.k
    public static final q30.m<Integer> R5(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr.length == 0 ? q30.x.l() : new m(iArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M R6(@m80.k double[] dArr, @m80.k M destination, @m80.k x00.l<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (double d11 : dArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Double.valueOf(d11));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @o00.f
    public static final <T> T R7(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr[1];
    }

    @o00.f
    public static final int R8(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr.length;
    }

    @m80.k
    public static final List<Double> R9(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Ke = Ke(dArr); -1 < Ke; Ke--) {
            if (!predicate.invoke(Double.valueOf(dArr[Ke])).booleanValue()) {
                return Qx(dArr, Ke + 1);
            }
        }
        return h0.J();
    }

    @m80.k
    public static final <V> List<V> RA(@m80.k long[] jArr, @m80.k long[] other, @m80.k x00.p<? super Long, ? super Long, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i11]), Long.valueOf(other[i11])));
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Byte>> C Ra(@m80.k byte[] bArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            byte b11 = bArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Byte.valueOf(b11)).booleanValue()) {
                destination.add(Byte.valueOf(b11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @o00.f
    public static final Double Rb(double[] dArr, x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            double d11 = dArr[length];
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                return Double.valueOf(d11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.k
    public static final <R> List<R> Rc(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z11 : zArr) {
            m0.s0(arrayList, transform.invoke(Boolean.valueOf(z11)));
        }
        return arrayList;
    }

    public static final <R> R Rd(@m80.k double[] dArr, R r11, @m80.k x00.p<? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Ke = Ke(dArr); Ke >= 0; Ke--) {
            r11 = operation.invoke(Double.valueOf(dArr[Ke]), r11);
        }
        return r11;
    }

    @o00.f
    public static final byte Re(byte[] bArr, int i11, x00.l<? super Integer, Byte> defaultValue) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= bArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).byteValue() : bArr[i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, M extends Map<? super K, List<V>>> M Rf(@m80.k short[] sArr, @m80.k M destination, @m80.k x00.l<? super Short, ? extends K> keySelector, @m80.k x00.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (short s11 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Short.valueOf(s11)));
        }
        return destination;
    }

    @o00.f
    public static final boolean Rg(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static long Rh(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[Ne(jArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.k
    public static final <R> List<R> Ri(@m80.k boolean[] zArr, @m80.k x00.p<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), Boolean.valueOf(zArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float Rj(double[] dArr, x00.l<? super Double, Float> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Double.valueOf(dArr[i11])).floatValue());
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Rk(byte[] bArr, Comparator<? super R> comparator, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                Object obj2 = (R) selector.invoke(Byte.valueOf(bArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Integer Rl(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        if (Me == 0) {
            return Integer.valueOf(i11);
        }
        R invoke = selector.invoke(Integer.valueOf(i11));
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                R invoke2 = selector.invoke(Integer.valueOf(i13));
                if (invoke.compareTo(invoke2) > 0) {
                    i11 = i13;
                    invoke = invoke2;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double Rm(float[] fArr, x00.l<? super Float, Double> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Float.valueOf(fArr[i11])).doubleValue());
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final short Rn(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                if (s11 > s12) {
                    s11 = s12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final long[] Ro(long[] jArr, x00.p<? super Integer, ? super Long, g2> action) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = jArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Long.valueOf(jArr[i11]));
            i11++;
            i12++;
        }
        return jArr;
    }

    public static final float Rp(@m80.k float[] fArr, @m80.k x00.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                f11 = operation.invoke(Float.valueOf(f11), Float.valueOf(fArr[i11])).floatValue();
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return f11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Byte Rq(@m80.k byte[] bArr, @m80.k x00.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ie = Ie(bArr);
        if (Ie < 0) {
            return null;
        }
        byte b11 = bArr[Ie];
        for (int i11 = Ie - 1; i11 >= 0; i11--) {
            b11 = operation.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i11]), Byte.valueOf(b11)).byteValue();
        }
        return Byte.valueOf(b11);
    }

    @m80.k
    public static short[] Rr(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int Pe = Pe(sArr);
        if (Pe >= 0) {
            int i11 = 0;
            while (true) {
                sArr2[Pe - i11] = sArr[i11];
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return sArr2;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Rs(long[] jArr, R r11, x00.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r11);
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Long.valueOf(jArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Integer Rt(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Integer num = null;
        boolean z11 = false;
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                if (z11) {
                    return null;
                }
                num = Integer.valueOf(i11);
                z11 = true;
            }
        }
        if (z11) {
            return num;
        }
        return null;
    }

    @yz.y0(version = "1.4")
    public static void Ru(@m80.k float[] fArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        a00.q.N3(fArr, i11, i12);
        qr(fArr, i11, i12);
    }

    @m80.k
    public static final List<Byte> Rv(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.G3(copyOf);
        return Br(copyOf);
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final double Rw(char[] cArr, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (char c11 : cArr) {
            d11 += selector.invoke(Character.valueOf(c11)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Float> Rx(@m80.k float[] fArr, int i11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= fArr.length) {
            return az(fArr);
        }
        if (i11 == 1) {
            return g0.l(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (float f11 : fArr) {
            arrayList.add(Float.valueOf(f11));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final HashSet<Integer> Ry(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return (HashSet) Gy(iArr, new HashSet(k1.j(iArr.length)));
    }

    @m80.k
    public static final Set<Boolean> Rz(@m80.k boolean[] zArr, @m80.k Iterable<Boolean> other) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Boolean> yz2 = yz(zArr);
        m0.s0(yz2, other);
        return yz2;
    }

    @m80.k
    public static final q30.m<Long> S5(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr.length == 0 ? q30.x.l() : new n(jArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M S6(@m80.k float[] fArr, @m80.k M destination, @m80.k x00.l<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (float f11 : fArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Float.valueOf(f11));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @o00.f
    public static final short S7(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr[1];
    }

    public static final int S8(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (double d11 : dArr) {
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @m80.k
    public static final List<Float> S9(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Le = Le(fArr); -1 < Le; Le--) {
            if (!predicate.invoke(Float.valueOf(fArr[Le])).booleanValue()) {
                return Rx(fArr, Le + 1);
            }
        }
        return h0.J();
    }

    @m80.k
    public static final <R> List<Pair<Long, R>> SA(@m80.k long[] jArr, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            long j11 = jArr[i11];
            arrayList.add(yz.h1.a(Long.valueOf(j11), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Character>> C Sa(@m80.k char[] cArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = cArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            char c11 = cArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Character.valueOf(c11)).booleanValue()) {
                destination.add(Character.valueOf(c11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @o00.f
    public static final Float Sb(float[] fArr, x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            float f11 = fArr[length];
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                return Float.valueOf(f11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R> List<R> Sc(byte[] bArr, x00.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), Byte.valueOf(bArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    public static final <R> R Sd(@m80.k float[] fArr, R r11, @m80.k x00.p<? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Le = Le(fArr); Le >= 0; Le--) {
            r11 = operation.invoke(Float.valueOf(fArr[Le]), r11);
        }
        return r11;
    }

    @o00.f
    public static final char Se(char[] cArr, int i11, x00.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= cArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).charValue() : cArr[i11];
    }

    @m80.k
    public static final <K, M extends Map<? super K, List<Boolean>>> M Sf(@m80.k boolean[] zArr, @m80.k M destination, @m80.k x00.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (boolean z11 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Boolean.valueOf(z11));
        }
        return destination;
    }

    @o00.f
    public static final boolean Sg(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final long Sh(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                long j11 = jArr[length];
                if (!predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return j11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <T, R> List<R> Si(@m80.k T[] tArr, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 1;
            R invoke = transform.invoke(Integer.valueOf(i12), tArr[i11]);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float Sj(float[] fArr, x00.l<? super Float, Float> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Float.valueOf(fArr[i11])).floatValue());
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Sk(char[] cArr, Comparator<? super R> comparator, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                Object obj2 = (R) selector.invoke(Character.valueOf(cArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Long Sl(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        if (Ne == 0) {
            return Long.valueOf(j11);
        }
        R invoke = selector.invoke(Long.valueOf(j11));
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                R invoke2 = selector.invoke(Long.valueOf(j12));
                if (invoke.compareTo(invoke2) > 0) {
                    j11 = j12;
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double Sm(int[] iArr, x00.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Integer.valueOf(iArr[i11])).doubleValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Boolean Sn(@m80.k boolean[] zArr, @m80.k Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                boolean z12 = zArr[i11];
                if (comparator.compare(Boolean.valueOf(z11), Boolean.valueOf(z12)) > 0) {
                    z11 = z12;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> T[] So(T[] tArr, x00.p<? super Integer, ? super T, g2> action) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), tArr[i11]);
            i11++;
            i12++;
        }
        return tArr;
    }

    public static final int Sp(@m80.k int[] iArr, @m80.k x00.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                i11 = operation.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i12])).intValue();
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Character Sq(@m80.k char[] cArr, @m80.k x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Je = Je(cArr);
        if (Je < 0) {
            return null;
        }
        char c11 = cArr[Je];
        for (int i11 = Je - 1; i11 >= 0; i11--) {
            c11 = operation.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i11]), Character.valueOf(c11)).charValue();
        }
        return Character.valueOf(c11);
    }

    @m80.k
    public static final boolean[] Sr(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int Qe = Qe(zArr);
        if (Qe >= 0) {
            int i11 = 0;
            while (true) {
                zArr2[Qe - i11] = zArr[i11];
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @m80.k
    public static final <T, R> List<R> Ss(@m80.k T[] tArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r11);
        int length = tArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, tArr[i11]);
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Long St(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final void Su(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length > 1) {
            a00.q.O3(iArr);
            rr(iArr);
        }
    }

    @m80.k
    public static final List<Character> Sv(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.I3(copyOf);
        return Cr(copyOf);
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final double Sw(double[] dArr, x00.l<? super Double, Double> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (double d12 : dArr) {
            d11 += selector.invoke(Double.valueOf(d12)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Integer> Sx(@m80.k int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= iArr.length) {
            return bz(iArr);
        }
        if (i11 == 1) {
            return g0.l(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (int i13 : iArr) {
            arrayList.add(Integer.valueOf(i13));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final HashSet<Long> Sy(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return (HashSet) Hy(jArr, new HashSet(k1.j(jArr.length)));
    }

    @m80.k
    public static final Iterable<a1<Byte>> Sz(@m80.k final byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return new b1(new x00.a() { // from class: a00.w
            @Override // x00.a
            public final Object invoke() {
                Iterator cA;
                cA = a0.cA(bArr);
                return cA;
            }
        });
    }

    @m80.k
    public static <T> q30.m<T> T5(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr.length == 0 ? q30.x.l() : new j(tArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M T6(@m80.k int[] iArr, @m80.k M destination, @m80.k x00.l<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (int i11 : iArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Integer.valueOf(i11));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @o00.f
    public static final boolean T7(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr[1];
    }

    @o00.f
    public static final int T8(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr.length;
    }

    @m80.k
    public static final List<Integer> T9(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Me = Me(iArr); -1 < Me; Me--) {
            if (!predicate.invoke(Integer.valueOf(iArr[Me])).booleanValue()) {
                return Sx(iArr, Me + 1);
            }
        }
        return h0.J();
    }

    @m80.k
    public static final <R, V> List<V> TA(@m80.k long[] jArr, @m80.k R[] other, @m80.k x00.p<? super Long, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i11]), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Double>> C Ta(@m80.k double[] dArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            double d11 = dArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Double.valueOf(d11)).booleanValue()) {
                destination.add(Double.valueOf(d11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @o00.f
    public static final Integer Tb(int[] iArr, x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            int i12 = iArr[length];
            if (predicate.invoke(Integer.valueOf(i12)).booleanValue()) {
                return Integer.valueOf(i12);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R> List<R> Tc(char[] cArr, x00.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), Character.valueOf(cArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    public static final <R> R Td(@m80.k int[] iArr, R r11, @m80.k x00.p<? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Me = Me(iArr); Me >= 0; Me--) {
            r11 = operation.invoke(Integer.valueOf(iArr[Me]), r11);
        }
        return r11;
    }

    @o00.f
    public static final double Te(double[] dArr, int i11, x00.l<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= dArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).doubleValue() : dArr[i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, M extends Map<? super K, List<V>>> M Tf(@m80.k boolean[] zArr, @m80.k M destination, @m80.k x00.l<? super Boolean, ? extends K> keySelector, @m80.k x00.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (boolean z11 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Boolean.valueOf(z11)));
        }
        return destination;
    }

    @o00.f
    public static final boolean Tg(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static <T> T Th(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[Oe(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C Ti(@m80.k T[] tArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 1;
            R invoke = transform.invoke(Integer.valueOf(i12), tArr[i11]);
            if (invoke != null) {
                destination.add(invoke);
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float Tj(int[] iArr, x00.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Integer.valueOf(iArr[i11])).floatValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Tk(double[] dArr, Comparator<? super R> comparator, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                Object obj2 = (R) selector.invoke(Double.valueOf(dArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T Tl(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        if (Oe != 0) {
            R invoke = selector.invoke(t11);
            int i11 = 1;
            if (1 <= Oe) {
                while (true) {
                    T t12 = tArr[i11];
                    R invoke2 = selector.invoke(t12);
                    if (invoke.compareTo(invoke2) > 0) {
                        t11 = t12;
                        invoke = invoke2;
                    }
                    if (i11 == Oe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return t11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double Tm(long[] jArr, x00.l<? super Long, Double> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Long.valueOf(jArr[i11])).doubleValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Byte Tn(@m80.k byte[] bArr, @m80.k Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                if (comparator.compare(Byte.valueOf(b11), Byte.valueOf(b12)) > 0) {
                    b11 = b12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final short[] To(short[] sArr, x00.p<? super Integer, ? super Short, g2> action) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = sArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Short.valueOf(sArr[i11]));
            i11++;
            i12++;
        }
        return sArr;
    }

    public static final long Tp(@m80.k long[] jArr, @m80.k x00.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                j11 = operation.invoke(Long.valueOf(j11), Long.valueOf(jArr[i11])).longValue();
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return j11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double Tq(@m80.k double[] dArr, @m80.k x00.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ke = Ke(dArr);
        if (Ke < 0) {
            return null;
        }
        double d11 = dArr[Ke];
        for (int i11 = Ke - 1; i11 >= 0; i11--) {
            d11 = operation.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i11]), Double.valueOf(d11)).doubleValue();
        }
        return Double.valueOf(d11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Tr(byte[] bArr, R r11, x00.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r11);
        for (byte b11 : bArr) {
            r11 = operation.invoke(r11, Byte.valueOf(b11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Ts(short[] sArr, R r11, x00.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r11);
        int length = sArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Short.valueOf(sArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static final Long Tt(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Long l11 = null;
        boolean z11 = false;
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                if (z11) {
                    return null;
                }
                l11 = Long.valueOf(j11);
                z11 = true;
            }
        }
        if (z11) {
            return l11;
        }
        return null;
    }

    @yz.y0(version = "1.4")
    public static void Tu(@m80.k int[] iArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        a00.q.P3(iArr, i11, i12);
        sr(iArr, i11, i12);
    }

    @m80.k
    public static final List<Double> Tv(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.K3(copyOf);
        return Dr(copyOf);
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final double Tw(float[] fArr, x00.l<? super Float, Double> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (float f11 : fArr) {
            d11 += selector.invoke(Float.valueOf(f11)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Long> Tx(@m80.k long[] jArr, int i11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= jArr.length) {
            return cz(jArr);
        }
        if (i11 == 1) {
            return g0.l(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (long j11 : jArr) {
            arrayList.add(Long.valueOf(j11));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <T> HashSet<T> Ty(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return (HashSet) Iy(tArr, new HashSet(k1.j(tArr.length)));
    }

    @m80.k
    public static final Iterable<a1<Character>> Tz(@m80.k final char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return new b1(new x00.a() { // from class: a00.r
            @Override // x00.a
            public final Object invoke() {
                Iterator jA;
                jA = a0.jA(cArr);
                return jA;
            }
        });
    }

    @m80.k
    public static final q30.m<Short> U5(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr.length == 0 ? q30.x.l() : new l(sArr);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M U6(@m80.k long[] jArr, @m80.k M destination, @m80.k x00.l<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (long j11 : jArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Long.valueOf(j11));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @o00.f
    public static final byte U7(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr[2];
    }

    public static final int U8(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (float f11 : fArr) {
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @m80.k
    public static final List<Long> U9(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Ne = Ne(jArr); -1 < Ne; Ne--) {
            if (!predicate.invoke(Long.valueOf(jArr[Ne])).booleanValue()) {
                return Tx(jArr, Ne + 1);
            }
        }
        return h0.J();
    }

    @m80.k
    public static <T, R> List<Pair<T, R>> UA(@m80.k T[] tArr, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(tArr[i11], r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Float>> C Ua(@m80.k float[] fArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = fArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            float f11 = fArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Float.valueOf(f11)).booleanValue()) {
                destination.add(Float.valueOf(f11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @o00.f
    public static final Long Ub(long[] jArr, x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            long j11 = jArr[length];
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                return Long.valueOf(j11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R> List<R> Uc(double[] dArr, x00.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), Double.valueOf(dArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    public static final <R> R Ud(@m80.k long[] jArr, R r11, @m80.k x00.p<? super Long, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Ne = Ne(jArr); Ne >= 0; Ne--) {
            r11 = operation.invoke(Long.valueOf(jArr[Ne]), r11);
        }
        return r11;
    }

    @o00.f
    public static final float Ue(float[] fArr, int i11, x00.l<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= fArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).floatValue() : fArr[i11];
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, K> w0<T, K> Uf(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        return new s(tArr, keySelector);
    }

    @o00.f
    public static final <T> boolean Ug(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static final <T> T Uh(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                T t11 = tArr[length];
                if (!predicate.invoke(t11).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return t11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C Ui(@m80.k byte[] bArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            destination.add(transform.invoke(Integer.valueOf(i12), Byte.valueOf(bArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float Uj(long[] jArr, x00.l<? super Long, Float> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Long.valueOf(jArr[i11])).floatValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Uk(float[] fArr, Comparator<? super R> comparator, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                Object obj2 = (R) selector.invoke(Float.valueOf(fArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Short Ul(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        if (Pe == 0) {
            return Short.valueOf(s11);
        }
        R invoke = selector.invoke(Short.valueOf(s11));
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                R invoke2 = selector.invoke(Short.valueOf(s12));
                if (invoke.compareTo(invoke2) > 0) {
                    s11 = s12;
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Double Um(T[] tArr, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(tArr[i11]).doubleValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Character Un(@m80.k char[] cArr, @m80.k Comparator<? super Character> comparator) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                if (comparator.compare(Character.valueOf(c11), Character.valueOf(c12)) > 0) {
                    c11 = c12;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final boolean[] Uo(boolean[] zArr, x00.p<? super Integer, ? super Boolean, g2> action) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = zArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Boolean.valueOf(zArr[i11]));
            i11++;
            i12++;
        }
        return zArr;
    }

    public static final <S, T extends S> S Up(@m80.k T[] tArr, @m80.k x00.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s11 = (Object) tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                s11 = operation.invoke(s11, (Object) tArr[i11]);
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Float Uq(@m80.k float[] fArr, @m80.k x00.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Le = Le(fArr);
        if (Le < 0) {
            return null;
        }
        float f11 = fArr[Le];
        for (int i11 = Le - 1; i11 >= 0; i11--) {
            f11 = operation.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i11]), Float.valueOf(f11)).floatValue();
        }
        return Float.valueOf(f11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Ur(char[] cArr, R r11, x00.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r11);
        for (char c11 : cArr) {
            r11 = operation.invoke(r11, Character.valueOf(c11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Us(boolean[] zArr, R r11, x00.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r11);
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Boolean.valueOf(zArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.l
    public static <T> T Ut(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final void Uu(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length > 1) {
            a00.q.Q3(jArr);
            tr(jArr);
        }
    }

    @m80.k
    public static final List<Float> Uv(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.M3(copyOf);
        return Er(copyOf);
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final double Uw(int[] iArr, x00.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (int i11 : iArr) {
            d11 += selector.invoke(Integer.valueOf(i11)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final <T> List<T> Ux(@m80.k T[] tArr, int i11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= tArr.length) {
            return dz(tArr);
        }
        if (i11 == 1) {
            return g0.l(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (T t11 : tArr) {
            arrayList.add(t11);
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final HashSet<Short> Uy(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return (HashSet) Jy(sArr, new HashSet(k1.j(sArr.length)));
    }

    @m80.k
    public static final Iterable<a1<Double>> Uz(@m80.k final double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return new b1(new x00.a() { // from class: a00.z
            @Override // x00.a
            public final Object invoke() {
                Iterator hA;
                hA = a0.hA(dArr);
                return hA;
            }
        });
    }

    @m80.k
    public static final q30.m<Boolean> V5(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr.length == 0 ? q30.x.l() : new q(zArr);
    }

    @m80.k
    public static final <T, K, V, M extends Map<? super K, ? super V>> M V6(@m80.k T[] tArr, @m80.k M destination, @m80.k x00.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (T t11 : tArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(t11);
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @o00.f
    public static final char V7(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr[2];
    }

    @o00.f
    public static final int V8(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr.length;
    }

    @m80.k
    public static final <T> List<T> V9(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Oe = Oe(tArr); -1 < Oe; Oe--) {
            if (!predicate.invoke(tArr[Oe]).booleanValue()) {
                return Ux(tArr, Oe + 1);
            }
        }
        return h0.J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T, R, V> List<V> VA(@m80.k T[] tArr, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i11], r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Integer>> C Va(@m80.k int[] iArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            int i14 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Integer.valueOf(i13)).booleanValue()) {
                destination.add(Integer.valueOf(i13));
            }
            i11++;
            i12 = i14;
        }
        return destination;
    }

    @o00.f
    public static final <T> T Vb(T[] tArr, x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            T t11 = tArr[length];
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R> List<R> Vc(float[] fArr, x00.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), Float.valueOf(fArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Vd(@m80.k T[] tArr, R r11, @m80.k x00.p<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Oe = Oe(tArr); Oe >= 0; Oe--) {
            r11 = operation.invoke(tArr[Oe], r11);
        }
        return r11;
    }

    @o00.f
    public static final int Ve(int[] iArr, int i11, x00.l<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= iArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).intValue() : iArr[i11];
    }

    public static int Vf(@m80.k byte[] bArr, byte b11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (b11 == bArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @o00.f
    public static final boolean Vg(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static short Vh(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[Pe(sArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C Vi(@m80.k char[] cArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = cArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            destination.add(transform.invoke(Integer.valueOf(i12), Character.valueOf(cArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> float Vj(T[] tArr, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(tArr[i11]).floatValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Vk(int[] iArr, Comparator<? super R> comparator, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                Object obj2 = (R) selector.invoke(Integer.valueOf(iArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> byte Vl(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        if (Ie != 0) {
            R invoke = selector.invoke(Byte.valueOf(b11));
            int i11 = 1;
            if (1 <= Ie) {
                while (true) {
                    byte b12 = bArr[i11];
                    R invoke2 = selector.invoke(Byte.valueOf(b12));
                    if (invoke.compareTo(invoke2) > 0) {
                        b11 = b12;
                        invoke = invoke2;
                    }
                    if (i11 == Ie) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return b11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double Vm(short[] sArr, x00.l<? super Short, Double> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Short.valueOf(sArr[i11])).doubleValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double Vn(@m80.k double[] dArr, @m80.k Comparator<? super Double> comparator) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                double d12 = dArr[i11];
                if (comparator.compare(Double.valueOf(d11), Double.valueOf(d12)) > 0) {
                    d11 = d12;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    @m80.k
    public static final Pair<List<Byte>, List<Byte>> Vo(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b11 : bArr) {
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                arrayList.add(Byte.valueOf(b11));
            } else {
                arrayList2.add(Byte.valueOf(b11));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final short Vp(@m80.k short[] sArr, @m80.k x00.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                s11 = operation.invoke(Short.valueOf(s11), Short.valueOf(sArr[i11])).shortValue();
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Integer Vq(@m80.k int[] iArr, @m80.k x00.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Me = Me(iArr);
        if (Me < 0) {
            return null;
        }
        int i11 = iArr[Me];
        for (int i12 = Me - 1; i12 >= 0; i12--) {
            i11 = operation.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i12]), Integer.valueOf(i11)).intValue();
        }
        return Integer.valueOf(i11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Vr(double[] dArr, R r11, x00.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r11);
        for (double d11 : dArr) {
            r11 = operation.invoke(r11, Double.valueOf(d11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void Vs(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        Ws(bArr, Random.Default);
    }

    @m80.l
    public static final <T> T Vt(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        boolean z11 = false;
        for (T t12 : tArr) {
            if (predicate.invoke(t12).booleanValue()) {
                if (z11) {
                    return null;
                }
                z11 = true;
                t11 = t12;
            }
        }
        if (z11) {
            return t11;
        }
        return null;
    }

    @yz.y0(version = "1.4")
    public static void Vu(@m80.k long[] jArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        a00.q.R3(jArr, i11, i12);
        ur(jArr, i11, i12);
    }

    @m80.k
    public static final List<Integer> Vv(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.O3(copyOf);
        return Fr(copyOf);
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final double Vw(long[] jArr, x00.l<? super Long, Double> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (long j11 : jArr) {
            d11 += selector.invoke(Long.valueOf(j11)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Short> Vx(@m80.k short[] sArr, int i11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= sArr.length) {
            return ez(sArr);
        }
        if (i11 == 1) {
            return g0.l(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (short s11 : sArr) {
            arrayList.add(Short.valueOf(s11));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final HashSet<Boolean> Vy(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return (HashSet) Ky(zArr, new HashSet(k1.j(zArr.length)));
    }

    @m80.k
    public static final Iterable<a1<Float>> Vz(@m80.k final float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return new b1(new x00.a() { // from class: a00.t
            @Override // x00.a
            public final Object invoke() {
                Iterator gA;
                gA = a0.gA(fArr);
                return gA;
            }
        });
    }

    @m80.k
    public static final <K, V> Map<K, V> W5(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(bArr.length), 16));
        for (byte b11 : bArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Byte.valueOf(b11));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M W6(@m80.k short[] sArr, @m80.k M destination, @m80.k x00.l<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (short s11 : sArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Short.valueOf(s11));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @o00.f
    public static final double W7(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr[2];
    }

    public static final int W8(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (int i12 : iArr) {
            if (predicate.invoke(Integer.valueOf(i12)).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @m80.k
    public static final List<Short> W9(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Pe = Pe(sArr); -1 < Pe; Pe--) {
            if (!predicate.invoke(Short.valueOf(sArr[Pe])).booleanValue()) {
                return Vx(sArr, Pe + 1);
            }
        }
        return h0.J();
    }

    @m80.k
    public static <T, R> List<Pair<T, R>> WA(@m80.k T[] tArr, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(yz.h1.a(tArr[i11], other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Long>> C Wa(@m80.k long[] jArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = jArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            long j11 = jArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Long.valueOf(j11)).booleanValue()) {
                destination.add(Long.valueOf(j11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @o00.f
    public static final Short Wb(short[] sArr, x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            short s11 = sArr[length];
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                return Short.valueOf(s11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R> List<R> Wc(int[] iArr, x00.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    public static final <R> R Wd(@m80.k short[] sArr, R r11, @m80.k x00.p<? super Short, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Pe = Pe(sArr); Pe >= 0; Pe--) {
            r11 = operation.invoke(Short.valueOf(sArr[Pe]), r11);
        }
        return r11;
    }

    @o00.f
    public static final long We(long[] jArr, int i11, x00.l<? super Integer, Long> defaultValue) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= jArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).longValue() : jArr[i11];
    }

    public static final int Wf(@m80.k char[] cArr, char c11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        int length = cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (c11 == cArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @o00.f
    public static final boolean Wg(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    public static final short Wh(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                short s11 = sArr[length];
                if (!predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return s11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C Wi(@m80.k double[] dArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            destination.add(transform.invoke(Integer.valueOf(i12), Double.valueOf(dArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float Wj(short[] sArr, x00.l<? super Short, Float> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Short.valueOf(sArr[i11])).floatValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Wk(long[] jArr, Comparator<? super R> comparator, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                Object obj2 = (R) selector.invoke(Long.valueOf(jArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> char Wl(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        if (Je != 0) {
            R invoke = selector.invoke(Character.valueOf(c11));
            int i11 = 1;
            if (1 <= Je) {
                while (true) {
                    char c12 = cArr[i11];
                    R invoke2 = selector.invoke(Character.valueOf(c12));
                    if (invoke.compareTo(invoke2) > 0) {
                        c11 = c12;
                        invoke = invoke2;
                    }
                    if (i11 == Je) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return c11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double Wm(boolean[] zArr, x00.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Boolean.valueOf(zArr[i11])).doubleValue());
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Float Wn(@m80.k float[] fArr, @m80.k Comparator<? super Float> comparator) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                float f12 = fArr[i11];
                if (comparator.compare(Float.valueOf(f11), Float.valueOf(f12)) > 0) {
                    f11 = f12;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    @m80.k
    public static final Pair<List<Character>, List<Character>> Wo(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                arrayList.add(Character.valueOf(c11));
            } else {
                arrayList2.add(Character.valueOf(c11));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean Wp(@m80.k boolean[] zArr, @m80.k x00.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                z11 = operation.invoke(Boolean.valueOf(z11), Boolean.valueOf(zArr[i11])).booleanValue();
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return z11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Long Wq(@m80.k long[] jArr, @m80.k x00.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ne = Ne(jArr);
        if (Ne < 0) {
            return null;
        }
        long j11 = jArr[Ne];
        for (int i11 = Ne - 1; i11 >= 0; i11--) {
            j11 = operation.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i11]), Long.valueOf(j11)).longValue();
        }
        return Long.valueOf(j11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Wr(float[] fArr, R r11, x00.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r11);
        for (float f11 : fArr) {
            r11 = operation.invoke(r11, Float.valueOf(f11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void Ws(@m80.k byte[] bArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int Ie = Ie(bArr); Ie > 0; Ie--) {
            int nextInt = random.nextInt(Ie + 1);
            byte b11 = bArr[Ie];
            bArr[Ie] = bArr[nextInt];
            bArr[nextInt] = b11;
        }
    }

    @m80.l
    public static final Short Wt(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> void Wu(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        a00.q.h4(tArr, e00.g.x());
    }

    @m80.k
    public static final List<Long> Wv(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.Q3(copyOf);
        return Gr(copyOf);
    }

    @w00.j(name = "sumOfDouble")
    public static final double Ww(@m80.k Double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        double d11 = 0.0d;
        for (Double d12 : dArr) {
            d11 += d12.doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Boolean> Wx(@m80.k boolean[] zArr, int i11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= zArr.length) {
            return fz(zArr);
        }
        if (i11 == 1) {
            return g0.l(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (boolean z11 : zArr) {
            arrayList.add(Boolean.valueOf(z11));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @m80.k
    public static int[] Wy(@m80.k Integer[] numArr) {
        kotlin.jvm.internal.g0.p(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = numArr[i11].intValue();
        }
        return iArr;
    }

    @m80.k
    public static final Iterable<a1<Integer>> Wz(@m80.k final int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return new b1(new x00.a() { // from class: a00.y
            @Override // x00.a
            public final Object invoke() {
                Iterator eA;
                eA = a0.eA(iArr);
                return eA;
            }
        });
    }

    @m80.k
    public static final <K, V> Map<K, V> X5(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(cArr.length), 16));
        for (char c11 : cArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(c11));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M X6(@m80.k boolean[] zArr, @m80.k M destination, @m80.k x00.l<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (boolean z11 : zArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Boolean.valueOf(z11));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @o00.f
    public static final float X7(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr[2];
    }

    @o00.f
    public static final int X8(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr.length;
    }

    @m80.k
    public static final List<Boolean> X9(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Qe = Qe(zArr); -1 < Qe; Qe--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[Qe])).booleanValue()) {
                return Wx(zArr, Qe + 1);
            }
        }
        return h0.J();
    }

    @m80.k
    public static final <T, R, V> List<V> XA(@m80.k T[] tArr, @m80.k R[] other, @m80.k x00.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(tArr[i11], other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C Xa(@m80.k T[] tArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            T t11 = tArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), t11).booleanValue()) {
                destination.add(t11);
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    public static byte Xb(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R> List<R> Xc(long[] jArr, x00.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), Long.valueOf(jArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    public static final <R> R Xd(@m80.k boolean[] zArr, R r11, @m80.k x00.p<? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Qe = Qe(zArr); Qe >= 0; Qe--) {
            r11 = operation.invoke(Boolean.valueOf(zArr[Qe]), r11);
        }
        return r11;
    }

    @o00.f
    public static final <T> T Xe(T[] tArr, int i11, x00.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= tArr.length) ? defaultValue.invoke(Integer.valueOf(i11)) : tArr[i11];
    }

    @yz.n(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @yz.w0(expression = "indexOfFirst { it == element }", imports = {}))
    @yz.o(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Xf(double[] dArr, double d11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (d11 == dArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <A extends Appendable> A Xg(@m80.k byte[] bArr, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Byte, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (byte b11 : bArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Byte.valueOf(b11)));
            } else {
                buffer.append(String.valueOf((int) b11));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean Xh(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[Qe(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C Xi(@m80.k float[] fArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = fArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            destination.add(transform.invoke(Integer.valueOf(i12), Float.valueOf(fArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float Xj(boolean[] zArr, x00.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Boolean.valueOf(zArr[i11])).floatValue());
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R Xk(T[] tArr, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(tArr[0]);
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                Object obj2 = (R) selector.invoke(tArr[i11]);
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> double Xl(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        if (Ke != 0) {
            R invoke = selector.invoke(Double.valueOf(d11));
            int i11 = 1;
            if (1 <= Ke) {
                while (true) {
                    double d12 = dArr[i11];
                    R invoke2 = selector.invoke(Double.valueOf(d12));
                    if (invoke.compareTo(invoke2) > 0) {
                        d11 = d12;
                        invoke = invoke2;
                    }
                    if (i11 == Ke) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return d11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Xm(byte[] bArr, x00.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Byte.valueOf(bArr[i11])).floatValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Integer Xn(@m80.k int[] iArr, @m80.k Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                if (comparator.compare(Integer.valueOf(i11), Integer.valueOf(i13)) > 0) {
                    i11 = i13;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    @m80.k
    public static final Pair<List<Double>, List<Double>> Xo(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d11 : dArr) {
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                arrayList.add(Double.valueOf(d11));
            } else {
                arrayList2.add(Double.valueOf(d11));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final byte Xp(@m80.k byte[] bArr, @m80.k x00.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                b11 = operation.invoke(Integer.valueOf(i11), Byte.valueOf(b11), Byte.valueOf(bArr[i11])).byteValue();
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return b11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <S, T extends S> S Xq(@m80.k T[] tArr, @m80.k x00.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Oe = Oe(tArr);
        if (Oe < 0) {
            return null;
        }
        S s11 = (S) tArr[Oe];
        for (int i11 = Oe - 1; i11 >= 0; i11--) {
            s11 = operation.invoke(Integer.valueOf(i11), (Object) tArr[i11], s11);
        }
        return s11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Xr(int[] iArr, R r11, x00.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r11);
        for (int i11 : iArr) {
            r11 = operation.invoke(r11, Integer.valueOf(i11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void Xs(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        Ys(cArr, Random.Default);
    }

    @m80.l
    public static final Short Xt(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Short sh2 = null;
        boolean z11 = false;
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                if (z11) {
                    return null;
                }
                sh2 = Short.valueOf(s11);
                z11 = true;
            }
        }
        if (z11) {
            return sh2;
        }
        return null;
    }

    @yz.y0(version = "1.4")
    public static final <T extends Comparable<? super T>> void Xu(@m80.k T[] tArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        a00.q.i4(tArr, e00.g.x(), i11, i12);
    }

    @m80.k
    public static final <T extends Comparable<? super T>> List<T> Xv(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return fw(tArr, e00.g.x());
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> double Xw(T[] tArr, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (T t11 : tArr) {
            d11 += selector.invoke(t11).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Byte> Xx(@m80.k byte[] bArr, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int length = bArr.length;
        if (i11 >= length) {
            return Xy(bArr);
        }
        if (i11 == 1) {
            return g0.l(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(Byte.valueOf(bArr[i12]));
        }
        return arrayList;
    }

    @m80.k
    public static List<Byte> Xy(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? hz(bArr) : g0.l(Byte.valueOf(bArr[0])) : h0.J();
    }

    @m80.k
    public static final Iterable<a1<Long>> Xz(@m80.k final long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return new b1(new x00.a() { // from class: a00.v
            @Override // x00.a
            public final Object invoke() {
                Iterator fA;
                fA = a0.fA(jArr);
                return fA;
            }
        });
    }

    @m80.k
    public static final <K, V> Map<K, V> Y5(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(dArr.length), 16));
        for (double d11 : dArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Double.valueOf(d11));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V> Map<Byte, V> Y6(byte[] bArr, x00.l<? super Byte, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(bArr.length), 16));
        for (byte b11 : bArr) {
            linkedHashMap.put(Byte.valueOf(b11), valueSelector.invoke(Byte.valueOf(b11)));
        }
        return linkedHashMap;
    }

    @o00.f
    public static final int Y7(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr[2];
    }

    public static final int Y8(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @m80.k
    public static final List<Byte> Y9(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (byte b11 : bArr) {
            if (z11) {
                arrayList.add(Byte.valueOf(b11));
            } else if (!predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                arrayList.add(Byte.valueOf(b11));
                z11 = true;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <R> List<Pair<Short, R>> YA(@m80.k short[] sArr, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(Short.valueOf(sArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Short>> C Ya(@m80.k short[] sArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = sArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            short s11 = sArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Short.valueOf(s11)).booleanValue()) {
                destination.add(Short.valueOf(s11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    public static final byte Yb(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (byte b11 : bArr) {
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                return b11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R> List<R> Yc(T[] tArr, x00.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), tArr[i11]));
            i11++;
            i12++;
        }
        return arrayList;
    }

    public static final <R> R Yd(@m80.k byte[] bArr, R r11, @m80.k x00.q<? super Integer, ? super Byte, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Ie = Ie(bArr); Ie >= 0; Ie--) {
            r11 = operation.invoke(Integer.valueOf(Ie), Byte.valueOf(bArr[Ie]), r11);
        }
        return r11;
    }

    @o00.f
    public static final short Ye(short[] sArr, int i11, x00.l<? super Integer, Short> defaultValue) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= sArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).shortValue() : sArr[i11];
    }

    @yz.n(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @yz.w0(expression = "indexOfFirst { it == element }", imports = {}))
    @yz.o(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Yf(float[] fArr, float f11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (f11 == fArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <A extends Appendable> A Yg(@m80.k char[] cArr, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Character, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (char c11 : cArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Character.valueOf(c11)));
            } else {
                buffer.append(c11);
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean Yh(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                boolean z11 = zArr[length];
                if (!predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return z11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C Yi(@m80.k int[] iArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            destination.add(transform.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Yj(byte[] bArr, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                R invoke2 = selector.invoke(Byte.valueOf(bArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Yk(short[] sArr, Comparator<? super R> comparator, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                Object obj2 = (R) selector.invoke(Short.valueOf(sArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> float Yl(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        if (Le != 0) {
            R invoke = selector.invoke(Float.valueOf(f11));
            int i11 = 1;
            if (1 <= Le) {
                while (true) {
                    float f12 = fArr[i11];
                    R invoke2 = selector.invoke(Float.valueOf(f12));
                    if (invoke.compareTo(invoke2) > 0) {
                        f11 = f12;
                        invoke = invoke2;
                    }
                    if (i11 == Le) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return f11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Ym(char[] cArr, x00.l<? super Character, Float> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(cArr[i11])).floatValue());
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Long Yn(@m80.k long[] jArr, @m80.k Comparator<? super Long> comparator) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                if (comparator.compare(Long.valueOf(j11), Long.valueOf(j12)) > 0) {
                    j11 = j12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    @m80.k
    public static final Pair<List<Float>, List<Float>> Yo(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f11 : fArr) {
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                arrayList.add(Float.valueOf(f11));
            } else {
                arrayList2.add(Float.valueOf(f11));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final char Yp(@m80.k char[] cArr, @m80.k x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                c11 = operation.invoke(Integer.valueOf(i11), Character.valueOf(c11), Character.valueOf(cArr[i11])).charValue();
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return c11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Short Yq(@m80.k short[] sArr, @m80.k x00.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Pe = Pe(sArr);
        if (Pe < 0) {
            return null;
        }
        short s11 = sArr[Pe];
        for (int i11 = Pe - 1; i11 >= 0; i11--) {
            s11 = operation.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i11]), Short.valueOf(s11)).shortValue();
        }
        return Short.valueOf(s11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> Yr(long[] jArr, R r11, x00.p<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r11);
        for (long j11 : jArr) {
            r11 = operation.invoke(r11, Long.valueOf(j11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void Ys(@m80.k char[] cArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int Je = Je(cArr); Je > 0; Je--) {
            int nextInt = random.nextInt(Je + 1);
            char c11 = cArr[Je];
            cArr[Je] = cArr[nextInt];
            cArr[nextInt] = c11;
        }
    }

    @m80.k
    public static final List<Byte> Yt(@m80.k byte[] bArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a00.q.n(a00.q.f1(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void Yu(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length > 1) {
            a00.q.W3(sArr);
            xr(sArr);
        }
    }

    @m80.k
    public static final List<Short> Yv(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.W3(copyOf);
        return Ir(copyOf);
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final double Yw(short[] sArr, x00.l<? super Short, Double> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (short s11 : sArr) {
            d11 += selector.invoke(Short.valueOf(s11)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Character> Yx(@m80.k char[] cArr, int i11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int length = cArr.length;
        if (i11 >= length) {
            return Yy(cArr);
        }
        if (i11 == 1) {
            return g0.l(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(Character.valueOf(cArr[i12]));
        }
        return arrayList;
    }

    @m80.k
    public static List<Character> Yy(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? iz(cArr) : g0.l(Character.valueOf(cArr[0])) : h0.J();
    }

    @m80.k
    public static <T> Iterable<a1<T>> Yz(@m80.k final T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return new b1(new x00.a() { // from class: a00.x
            @Override // x00.a
            public final Object invoke() {
                Iterator bA;
                bA = a0.bA(tArr);
                return bA;
            }
        });
    }

    @m80.k
    public static final <K, V> Map<K, V> Z5(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(fArr.length), 16));
        for (float f11 : fArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Float.valueOf(f11));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V> Map<Character, V> Z6(char[] cArr, x00.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(g10.u.B(cArr.length, 128)), 16));
        for (char c11 : cArr) {
            linkedHashMap.put(Character.valueOf(c11), valueSelector.invoke(Character.valueOf(c11)));
        }
        return linkedHashMap;
    }

    @o00.f
    public static final long Z7(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr[2];
    }

    @o00.f
    public static final <T> int Z8(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr.length;
    }

    @m80.k
    public static final List<Character> Z9(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (char c11 : cArr) {
            if (z11) {
                arrayList.add(Character.valueOf(c11));
            } else if (!predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                arrayList.add(Character.valueOf(c11));
                z11 = true;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <R, V> List<V> ZA(@m80.k short[] sArr, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super Short, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Boolean>> C Za(@m80.k boolean[] zArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = zArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            boolean z11 = zArr[i11];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Boolean.valueOf(z11)).booleanValue()) {
                destination.add(Boolean.valueOf(z11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    public static final char Zb(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R> List<R> Zc(short[] sArr, x00.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), Short.valueOf(sArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    public static final <R> R Zd(@m80.k char[] cArr, R r11, @m80.k x00.q<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Je = Je(cArr); Je >= 0; Je--) {
            r11 = operation.invoke(Integer.valueOf(Je), Character.valueOf(cArr[Je]), r11);
        }
        return r11;
    }

    @o00.f
    public static final boolean Ze(boolean[] zArr, int i11, x00.l<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= zArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).booleanValue() : zArr[i11];
    }

    public static int Zf(@m80.k int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (i11 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    @m80.k
    public static final <A extends Appendable> A Zg(@m80.k double[] dArr, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (double d11 : dArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Double.valueOf(d11)));
            } else {
                buffer.append(String.valueOf(d11));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int Zh(@m80.k byte[] bArr, byte b11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (b11 == bArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C Zi(@m80.k long[] jArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = jArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            destination.add(transform.invoke(Integer.valueOf(i12), Long.valueOf(jArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R Zj(char[] cArr, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                R invoke2 = selector.invoke(Character.valueOf(cArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R Zk(boolean[] zArr, Comparator<? super R> comparator, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                Object obj2 = (R) selector.invoke(Boolean.valueOf(zArr[i11]));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> int Zl(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        if (Me != 0) {
            R invoke = selector.invoke(Integer.valueOf(i11));
            int i12 = 1;
            if (1 <= Me) {
                while (true) {
                    int i13 = iArr[i12];
                    R invoke2 = selector.invoke(Integer.valueOf(i13));
                    if (invoke.compareTo(invoke2) > 0) {
                        i11 = i13;
                        invoke = invoke2;
                    }
                    if (i12 == Me) {
                        break;
                    }
                    i12++;
                }
            }
        }
        return i11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float Zm(double[] dArr, x00.l<? super Double, Float> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Double.valueOf(dArr[i11])).floatValue());
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <T> T Zn(@m80.k T[] tArr, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                T t12 = tArr[i11];
                if (comparator.compare(t11, t12) > 0) {
                    t11 = t12;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return t11;
    }

    @m80.k
    public static final Pair<List<Integer>, List<Integer>> Zo(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                arrayList.add(Integer.valueOf(i11));
            } else {
                arrayList2.add(Integer.valueOf(i11));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final double Zp(@m80.k double[] dArr, @m80.k x00.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                d11 = operation.invoke(Integer.valueOf(i11), Double.valueOf(d11), Double.valueOf(dArr[i11])).doubleValue();
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return d11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Boolean Zq(@m80.k boolean[] zArr, @m80.k x00.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Qe = Qe(zArr);
        if (Qe < 0) {
            return null;
        }
        boolean z11 = zArr[Qe];
        for (int i11 = Qe - 1; i11 >= 0; i11--) {
            z11 = operation.invoke(Boolean.valueOf(zArr[i11]), Boolean.valueOf(z11)).booleanValue();
        }
        return Boolean.valueOf(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @m80.k
    public static final <T, R> List<R> Zr(@m80.k T[] tArr, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r11);
        for (d dVar : tArr) {
            r11 = operation.invoke(r11, dVar);
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void Zs(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        at(dArr, Random.Default);
    }

    @m80.k
    public static final List<Byte> Zt(@m80.k byte[] bArr, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void Zu(@m80.k short[] sArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        a00.q.X3(sArr, i11, i12);
        yr(sArr, i11, i12);
    }

    @m80.k
    public static final List<Byte> Zv(@m80.k byte[] bArr, @m80.k Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Byte[] N4 = a00.q.N4(bArr);
        a00.q.h4(N4, comparator);
        return a00.q.t(N4);
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final double Zw(boolean[] zArr, x00.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (boolean z11 : zArr) {
            d11 += selector.invoke(Boolean.valueOf(z11)).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final List<Double> Zx(@m80.k double[] dArr, int i11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int length = dArr.length;
        if (i11 >= length) {
            return Zy(dArr);
        }
        if (i11 == 1) {
            return g0.l(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(Double.valueOf(dArr[i12]));
        }
        return arrayList;
    }

    @m80.k
    public static List<Double> Zy(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? jz(dArr) : g0.l(Double.valueOf(dArr[0])) : h0.J();
    }

    @m80.k
    public static final Iterable<a1<Short>> Zz(@m80.k final short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return new b1(new x00.a() { // from class: a00.s
            @Override // x00.a
            public final Object invoke() {
                Iterator dA;
                dA = a0.dA(sArr);
                return dA;
            }
        });
    }

    @m80.k
    public static final <K, V> Map<K, V> a6(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(iArr.length), 16));
        for (int i11 : iArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Integer.valueOf(i11));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V> Map<Double, V> a7(double[] dArr, x00.l<? super Double, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(dArr.length), 16));
        for (double d11 : dArr) {
            linkedHashMap.put(Double.valueOf(d11), valueSelector.invoke(Double.valueOf(d11)));
        }
        return linkedHashMap;
    }

    @o00.f
    public static final <T> T a8(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr[2];
    }

    public static final <T> int a9(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @m80.k
    public static final Iterable<a1<Boolean>> aA(@m80.k final boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return new b1(new x00.a() { // from class: a00.u
            @Override // x00.a
            public final Object invoke() {
                Iterator iA;
                iA = a0.iA(zArr);
                return iA;
            }
        });
    }

    @m80.k
    public static final <R> List<Pair<Short, R>> aB(@m80.k short[] sArr, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            short s11 = sArr[i11];
            arrayList.add(yz.h1.a(Short.valueOf(s11), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Double> aa(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (double d11 : dArr) {
            if (z11) {
                arrayList.add(Double.valueOf(d11));
            } else if (!predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                arrayList.add(Double.valueOf(d11));
                z11 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R> List<R> ab(Object[] objArr) {
        kotlin.jvm.internal.g0.p(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            kotlin.jvm.internal.g0.y(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char ac(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                return c11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R> List<R> ad(boolean[] zArr, x00.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), Boolean.valueOf(zArr[i11])));
            i11++;
            i12++;
        }
        return arrayList;
    }

    public static final <R> R ae(@m80.k double[] dArr, R r11, @m80.k x00.q<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Ke = Ke(dArr); Ke >= 0; Ke--) {
            r11 = operation.invoke(Integer.valueOf(Ke), Double.valueOf(dArr[Ke]), r11);
        }
        return r11;
    }

    @m80.l
    public static final Boolean af(@m80.k boolean[] zArr, int i11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (i11 < 0 || i11 >= zArr.length) {
            return null;
        }
        return Boolean.valueOf(zArr[i11]);
    }

    public static int ag(@m80.k long[] jArr, long j11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (j11 == jArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <A extends Appendable> A ah(@m80.k float[] fArr, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (float f11 : fArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Float.valueOf(f11)));
            } else {
                buffer.append(String.valueOf(f11));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final int ai(@m80.k char[] cArr, char c11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (c11 == cArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C aj(@m80.k T[] tArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            destination.add(transform.invoke(Integer.valueOf(i12), tArr[i11]));
            i11++;
            i12++;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R ak(double[] dArr, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                R invoke2 = selector.invoke(Double.valueOf(dArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Byte al(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                if (b11 < b12) {
                    b11 = b12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> long am(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        if (Ne != 0) {
            R invoke = selector.invoke(Long.valueOf(j11));
            int i11 = 1;
            if (1 <= Ne) {
                while (true) {
                    long j12 = jArr[i11];
                    R invoke2 = selector.invoke(Long.valueOf(j12));
                    if (invoke.compareTo(invoke2) > 0) {
                        j11 = j12;
                        invoke = invoke2;
                    }
                    if (i11 == Ne) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return j11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float an(float[] fArr, x00.l<? super Float, Float> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Float.valueOf(fArr[i11])).floatValue());
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Short ao(@m80.k short[] sArr, @m80.k Comparator<? super Short> comparator) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                if (comparator.compare(Short.valueOf(s11), Short.valueOf(s12)) > 0) {
                    s11 = s12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    @m80.k
    public static final Pair<List<Long>, List<Long>> ap(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                arrayList.add(Long.valueOf(j11));
            } else {
                arrayList2.add(Long.valueOf(j11));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final float aq(@m80.k float[] fArr, @m80.k x00.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                f11 = operation.invoke(Integer.valueOf(i11), Float.valueOf(f11), Float.valueOf(fArr[i11])).floatValue();
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return f11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Byte ar(@m80.k byte[] bArr, @m80.k x00.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ie = Ie(bArr);
        if (Ie < 0) {
            return null;
        }
        byte b11 = bArr[Ie];
        for (int i11 = Ie - 1; i11 >= 0; i11--) {
            b11 = operation.invoke(Byte.valueOf(bArr[i11]), Byte.valueOf(b11)).byteValue();
        }
        return Byte.valueOf(b11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> as(short[] sArr, R r11, x00.p<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r11);
        for (short s11 : sArr) {
            r11 = operation.invoke(r11, Short.valueOf(s11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void at(@m80.k double[] dArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int Ke = Ke(dArr); Ke > 0; Ke--) {
            int nextInt = random.nextInt(Ke + 1);
            double d11 = dArr[Ke];
            dArr[Ke] = dArr[nextInt];
            dArr[nextInt] = d11;
        }
    }

    @m80.k
    public static final List<Character> au(@m80.k char[] cArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a00.q.o(a00.q.g1(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @m80.k
    public static final List<Byte> av(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        Byte[] N4 = a00.q.N4(bArr);
        a00.q.U3(N4);
        return a00.q.t(N4);
    }

    @m80.k
    public static final List<Character> aw(@m80.k char[] cArr, @m80.k Comparator<? super Character> comparator) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Character[] O4 = a00.q.O4(cArr);
        a00.q.h4(O4, comparator);
        return a00.q.t(O4);
    }

    @w00.j(name = "sumOfFloat")
    public static final float ax(@m80.k Float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        float f11 = 0.0f;
        for (Float f12 : fArr) {
            f11 += f12.floatValue();
        }
        return f11;
    }

    @m80.k
    public static final List<Float> ay(@m80.k float[] fArr, int i11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int length = fArr.length;
        if (i11 >= length) {
            return az(fArr);
        }
        if (i11 == 1) {
            return g0.l(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(Float.valueOf(fArr[i12]));
        }
        return arrayList;
    }

    @m80.k
    public static List<Float> az(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? kz(fArr) : g0.l(Float.valueOf(fArr[0])) : h0.J();
    }

    @m80.k
    public static final <K, V> Map<K, V> b6(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(jArr.length), 16));
        for (long j11 : jArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Long.valueOf(j11));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V> Map<Float, V> b7(float[] fArr, x00.l<? super Float, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(fArr.length), 16));
        for (float f11 : fArr) {
            linkedHashMap.put(Float.valueOf(f11), valueSelector.invoke(Float.valueOf(f11)));
        }
        return linkedHashMap;
    }

    @o00.f
    public static final short b8(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr[2];
    }

    @o00.f
    public static final int b9(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr.length;
    }

    public static final Iterator bA(Object[] objArr) {
        return kotlin.jvm.internal.h.a(objArr);
    }

    @m80.k
    public static final <R, V> List<V> bB(@m80.k short[] sArr, @m80.k R[] other, @m80.k x00.p<? super Short, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i11]), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Float> ba(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (float f11 : fArr) {
            if (z11) {
                arrayList.add(Float.valueOf(f11));
            } else if (!predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                arrayList.add(Float.valueOf(f11));
                z11 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C bb(Object[] objArr, C destination) {
        kotlin.jvm.internal.g0.p(objArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (Object obj : objArr) {
            kotlin.jvm.internal.g0.y(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final double bc(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C bd(byte[] bArr, C destination, x00.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), Byte.valueOf(bArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    public static final <R> R be(@m80.k float[] fArr, R r11, @m80.k x00.q<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Le = Le(fArr); Le >= 0; Le--) {
            r11 = operation.invoke(Integer.valueOf(Le), Float.valueOf(fArr[Le]), r11);
        }
        return r11;
    }

    @m80.l
    public static final Byte bf(@m80.k byte[] bArr, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (i11 < 0 || i11 >= bArr.length) {
            return null;
        }
        return Byte.valueOf(bArr[i11]);
    }

    public static <T> int bg(@m80.k T[] tArr, T t11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        int i11 = 0;
        if (t11 == null) {
            int length = tArr.length;
            while (i11 < length) {
                if (tArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i11 < length2) {
            if (kotlin.jvm.internal.g0.g(t11, tArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @m80.k
    public static final <A extends Appendable> A bh(@m80.k int[] iArr, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (int i13 : iArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Integer.valueOf(i13)));
            } else {
                buffer.append(String.valueOf(i13));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @yz.n(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @yz.w0(expression = "indexOfLast { it == element }", imports = {}))
    @yz.o(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int bi(double[] dArr, double d11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (d11 == dArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C bj(@m80.k short[] sArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = sArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            destination.add(transform.invoke(Integer.valueOf(i12), Short.valueOf(sArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R bk(float[] fArr, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                R invoke2 = selector.invoke(Float.valueOf(fArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Character bl(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                if (kotlin.jvm.internal.g0.t(c11, c12) < 0) {
                    c11 = c12;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T bm(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        if (Oe != 0) {
            R invoke = selector.invoke(t11);
            int i11 = 1;
            if (1 <= Oe) {
                while (true) {
                    T t12 = tArr[i11];
                    R invoke2 = selector.invoke(t12);
                    if (invoke.compareTo(invoke2) > 0) {
                        t11 = t12;
                        invoke = invoke2;
                    }
                    if (i11 == Oe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return t11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float bn(int[] iArr, x00.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Integer.valueOf(iArr[i11])).floatValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final byte bo(@m80.k byte[] bArr, @m80.k Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                if (comparator.compare(Byte.valueOf(b11), Byte.valueOf(b12)) > 0) {
                    b11 = b12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return b11;
    }

    @m80.k
    public static final <T> Pair<List<T>, List<T>> bp(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
            } else {
                arrayList2.add(t11);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final int bq(@m80.k int[] iArr, @m80.k x00.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                i11 = operation.invoke(Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(iArr[i12])).intValue();
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Character br(@m80.k char[] cArr, @m80.k x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Je = Je(cArr);
        if (Je < 0) {
            return null;
        }
        char c11 = cArr[Je];
        for (int i11 = Je - 1; i11 >= 0; i11--) {
            c11 = operation.invoke(Character.valueOf(cArr[i11]), Character.valueOf(c11)).charValue();
        }
        return Character.valueOf(c11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> bs(boolean[] zArr, R r11, x00.p<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r11);
        for (boolean z11 : zArr) {
            r11 = operation.invoke(r11, Boolean.valueOf(z11));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void bt(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        ct(fArr, Random.Default);
    }

    @m80.k
    public static final List<Character> bu(@m80.k char[] cArr, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Character> bv(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        Character[] O4 = a00.q.O4(cArr);
        a00.q.U3(O4);
        return a00.q.t(O4);
    }

    @m80.k
    public static final List<Double> bw(@m80.k double[] dArr, @m80.k Comparator<? super Double> comparator) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Double[] P4 = a00.q.P4(dArr);
        a00.q.h4(P4, comparator);
        return a00.q.t(P4);
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final int bx(byte[] bArr, x00.l<? super Byte, Integer> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (byte b11 : bArr) {
            i11 += selector.invoke(Byte.valueOf(b11)).intValue();
        }
        return i11;
    }

    @m80.k
    public static List<Integer> bz(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? lz(iArr) : g0.l(Integer.valueOf(iArr[0])) : h0.J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T, K, V> Map<K, V> c6(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(tArr.length), 16));
        for (d dVar : tArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(dVar);
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V> Map<Integer, V> c7(int[] iArr, x00.l<? super Integer, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(iArr.length), 16));
        for (int i11 : iArr) {
            linkedHashMap.put(Integer.valueOf(i11), valueSelector.invoke(Integer.valueOf(i11)));
        }
        return linkedHashMap;
    }

    @o00.f
    public static final boolean c8(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr[2];
    }

    public static final int c9(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public static final Iterator cA(byte[] bArr) {
        return kotlin.jvm.internal.i.b(bArr);
    }

    @m80.k
    public static final List<Pair<Short, Short>> cB(@m80.k short[] sArr, @m80.k short[] other) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(yz.h1.a(Short.valueOf(sArr[i11]), Short.valueOf(other[i11])));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Integer> ca(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (int i11 : iArr) {
            if (z11) {
                arrayList.add(Integer.valueOf(i11));
            } else if (!predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                arrayList.add(Integer.valueOf(i11));
                z11 = true;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final List<Byte> cb(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b11 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                arrayList.add(Byte.valueOf(b11));
            }
        }
        return arrayList;
    }

    public static final double cc(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (double d11 : dArr) {
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                return d11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C cd(char[] cArr, C destination, x00.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = cArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), Character.valueOf(cArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    public static final <R> R ce(@m80.k int[] iArr, R r11, @m80.k x00.q<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Me = Me(iArr); Me >= 0; Me--) {
            r11 = operation.invoke(Integer.valueOf(Me), Integer.valueOf(iArr[Me]), r11);
        }
        return r11;
    }

    @m80.l
    public static final Character cf(@m80.k char[] cArr, int i11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (i11 < 0 || i11 >= cArr.length) {
            return null;
        }
        return Character.valueOf(cArr[i11]);
    }

    public static int cg(@m80.k short[] sArr, short s11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        int length = sArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (s11 == sArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <A extends Appendable> A ch(@m80.k long[] jArr, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (long j11 : jArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Long.valueOf(j11)));
            } else {
                buffer.append(String.valueOf(j11));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @yz.n(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @yz.w0(expression = "indexOfLast { it == element }", imports = {}))
    @yz.o(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int ci(float[] fArr, float f11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (f11 == fArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C cj(@m80.k boolean[] zArr, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = zArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            destination.add(transform.invoke(Integer.valueOf(i12), Boolean.valueOf(zArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R ck(int[] iArr, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                R invoke2 = selector.invoke(Integer.valueOf(iArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <T extends Comparable<? super T>> T cl(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                T t12 = tArr[i11];
                if (t11.compareTo(t12) < 0) {
                    t11 = t12;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return t11;
    }

    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> short cm(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        if (Pe != 0) {
            R invoke = selector.invoke(Short.valueOf(s11));
            int i11 = 1;
            if (1 <= Pe) {
                while (true) {
                    short s12 = sArr[i11];
                    R invoke2 = selector.invoke(Short.valueOf(s12));
                    if (invoke.compareTo(invoke2) > 0) {
                        s11 = s12;
                        invoke = invoke2;
                    }
                    if (i11 == Pe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return s11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float cn(long[] jArr, x00.l<? super Long, Float> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Long.valueOf(jArr[i11])).floatValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final char co(@m80.k char[] cArr, @m80.k Comparator<? super Character> comparator) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                if (comparator.compare(Character.valueOf(c11), Character.valueOf(c12)) > 0) {
                    c11 = c12;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return c11;
    }

    @m80.k
    public static final Pair<List<Short>, List<Short>> cp(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                arrayList.add(Short.valueOf(s11));
            } else {
                arrayList2.add(Short.valueOf(s11));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final long cq(@m80.k long[] jArr, @m80.k x00.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                j11 = operation.invoke(Integer.valueOf(i11), Long.valueOf(j11), Long.valueOf(jArr[i11])).longValue();
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return j11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double cr(@m80.k double[] dArr, @m80.k x00.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ke = Ke(dArr);
        if (Ke < 0) {
            return null;
        }
        double d11 = dArr[Ke];
        for (int i11 = Ke - 1; i11 >= 0; i11--) {
            d11 = operation.invoke(Double.valueOf(dArr[i11]), Double.valueOf(d11)).doubleValue();
        }
        return Double.valueOf(d11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> cs(byte[] bArr, R r11, x00.q<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r11);
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Byte.valueOf(bArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void ct(@m80.k float[] fArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int Le = Le(fArr); Le > 0; Le--) {
            int nextInt = random.nextInt(Le + 1);
            float f11 = fArr[Le];
            fArr[Le] = fArr[nextInt];
            fArr[nextInt] = f11;
        }
    }

    @m80.k
    public static final List<Double> cu(@m80.k double[] dArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a00.q.p(a00.q.h1(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @m80.k
    public static final List<Double> cv(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        Double[] P4 = a00.q.P4(dArr);
        a00.q.U3(P4);
        return a00.q.t(P4);
    }

    @m80.k
    public static final List<Float> cw(@m80.k float[] fArr, @m80.k Comparator<? super Float> comparator) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Float[] Q4 = a00.q.Q4(fArr);
        a00.q.h4(Q4, comparator);
        return a00.q.t(Q4);
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final int cx(char[] cArr, x00.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (char c11 : cArr) {
            i11 += selector.invoke(Character.valueOf(c11)).intValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Integer> cy(@m80.k int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int length = iArr.length;
        if (i11 >= length) {
            return bz(iArr);
        }
        if (i11 == 1) {
            return g0.l(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(Integer.valueOf(iArr[i12]));
        }
        return arrayList;
    }

    @m80.k
    public static List<Long> cz(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? mz(jArr) : g0.l(Long.valueOf(jArr[0])) : h0.J();
    }

    public static final boolean d5(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (byte b11 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <K, V> Map<K, V> d6(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(sArr.length), 16));
        for (short s11 : sArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Short.valueOf(s11));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V> Map<Long, V> d7(long[] jArr, x00.l<? super Long, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(jArr.length), 16));
        for (long j11 : jArr) {
            linkedHashMap.put(Long.valueOf(j11), valueSelector.invoke(Long.valueOf(j11)));
        }
        return linkedHashMap;
    }

    @o00.f
    public static final byte d8(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr[3];
    }

    @o00.f
    public static final int d9(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr.length;
    }

    public static final Iterator dA(short[] sArr) {
        return kotlin.jvm.internal.i.h(sArr);
    }

    @m80.k
    public static final <V> List<V> dB(@m80.k short[] sArr, @m80.k short[] other, @m80.k x00.p<? super Short, ? super Short, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i11]), Short.valueOf(other[i11])));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Long> da(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (long j11 : jArr) {
            if (z11) {
                arrayList.add(Long.valueOf(j11));
            } else if (!predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                arrayList.add(Long.valueOf(j11));
                z11 = true;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final List<Character> db(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c11 : cArr) {
            if (!predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                arrayList.add(Character.valueOf(c11));
            }
        }
        return arrayList;
    }

    public static final float dc(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C dd(double[] dArr, C destination, x00.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), Double.valueOf(dArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    public static final <R> R de(@m80.k long[] jArr, R r11, @m80.k x00.q<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Ne = Ne(jArr); Ne >= 0; Ne--) {
            r11 = operation.invoke(Integer.valueOf(Ne), Long.valueOf(jArr[Ne]), r11);
        }
        return r11;
    }

    @m80.l
    public static final Double df(@m80.k double[] dArr, int i11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (i11 < 0 || i11 >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i11]);
    }

    public static final int dg(@m80.k boolean[] zArr, boolean z11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (z11 == zArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <T, A extends Appendable> A dh(@m80.k T[] tArr, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (T t11 : tArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            u30.u.b(buffer, t11, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int di(@m80.k int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (i11 == iArr[length]) {
                    return length;
                }
                if (i12 < 0) {
                    break;
                }
                length = i12;
            }
        }
        return -1;
    }

    @m80.k
    public static final <T, R> List<R> dj(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t11 : tArr) {
            R invoke = transform.invoke(t11);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R dk(long[] jArr, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                R invoke2 = selector.invoke(Long.valueOf(jArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double dl(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                d11 = Math.max(d11, dArr[i11]);
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean dm(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        if (Qe != 0) {
            R invoke = selector.invoke(Boolean.valueOf(z11));
            int i11 = 1;
            if (1 <= Qe) {
                while (true) {
                    boolean z12 = zArr[i11];
                    R invoke2 = selector.invoke(Boolean.valueOf(z12));
                    if (invoke.compareTo(invoke2) > 0) {
                        z11 = z12;
                        invoke = invoke2;
                    }
                    if (i11 == Qe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return z11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Float dn(T[] tArr, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(tArr[i11]).floatValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.k
    public static final Pair<List<Boolean>, List<Boolean>> dp(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z11));
            } else {
                arrayList2.add(Boolean.valueOf(z11));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <S, T extends S> S dq(@m80.k T[] tArr, @m80.k x00.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s11 = (Object) tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                s11 = operation.invoke(Integer.valueOf(i11), s11, (Object) tArr[i11]);
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Float dr(@m80.k float[] fArr, @m80.k x00.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Le = Le(fArr);
        if (Le < 0) {
            return null;
        }
        float f11 = fArr[Le];
        for (int i11 = Le - 1; i11 >= 0; i11--) {
            f11 = operation.invoke(Float.valueOf(fArr[i11]), Float.valueOf(f11)).floatValue();
        }
        return Float.valueOf(f11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> ds(char[] cArr, R r11, x00.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r11);
        int length = cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Character.valueOf(cArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void dt(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        et(iArr, Random.Default);
    }

    @m80.k
    public static final List<Double> du(@m80.k double[] dArr, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Float> dv(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        Float[] Q4 = a00.q.Q4(fArr);
        a00.q.U3(Q4);
        return a00.q.t(Q4);
    }

    @m80.k
    public static final List<Integer> dw(@m80.k int[] iArr, @m80.k Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Integer[] R4 = a00.q.R4(iArr);
        a00.q.h4(R4, comparator);
        return a00.q.t(R4);
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final int dx(double[] dArr, x00.l<? super Double, Integer> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (double d11 : dArr) {
            i11 += selector.invoke(Double.valueOf(d11)).intValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Long> dy(@m80.k long[] jArr, int i11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int length = jArr.length;
        if (i11 >= length) {
            return cz(jArr);
        }
        if (i11 == 1) {
            return g0.l(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(Long.valueOf(jArr[i12]));
        }
        return arrayList;
    }

    @m80.k
    public static <T> List<T> dz(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? nz(tArr) : g0.l(tArr[0]) : h0.J();
    }

    public static final boolean e5(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (char c11 : cArr) {
            if (!predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <K, V> Map<K, V> e6(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(zArr.length), 16));
        for (boolean z11 : zArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Boolean.valueOf(z11));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <K, V> Map<K, V> e7(@m80.k K[] kArr, @m80.k x00.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(kArr, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(kArr.length), 16));
        for (K k11 : kArr) {
            linkedHashMap.put(k11, valueSelector.invoke(k11));
        }
        return linkedHashMap;
    }

    @o00.f
    public static final char e8(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr[3];
    }

    public static final int e9(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public static final Iterator eA(int[] iArr) {
        return kotlin.jvm.internal.i.f(iArr);
    }

    @m80.k
    public static final <R> List<Pair<Boolean, R>> eB(@m80.k boolean[] zArr, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(Boolean.valueOf(zArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final <T> List<T> ea(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (T t11 : tArr) {
            if (z11) {
                arrayList.add(t11);
            } else if (!predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
                z11 = true;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final List<Double> eb(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d11 : dArr) {
            if (!predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                arrayList.add(Double.valueOf(d11));
            }
        }
        return arrayList;
    }

    public static final float ec(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (float f11 : fArr) {
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                return f11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C ed(float[] fArr, C destination, x00.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = fArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), Float.valueOf(fArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R ee(@m80.k T[] tArr, R r11, @m80.k x00.q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Oe = Oe(tArr); Oe >= 0; Oe--) {
            r11 = operation.invoke(Integer.valueOf(Oe), tArr[Oe], r11);
        }
        return r11;
    }

    @m80.l
    public static final Float ef(@m80.k float[] fArr, int i11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (i11 < 0 || i11 >= fArr.length) {
            return null;
        }
        return Float.valueOf(fArr[i11]);
    }

    public static final int eg(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(Byte.valueOf(bArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <A extends Appendable> A eh(@m80.k short[] sArr, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (short s11 : sArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Short.valueOf(s11)));
            } else {
                buffer.append(String.valueOf((int) s11));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int ei(@m80.k long[] jArr, long j11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (j11 == jArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C ej(@m80.k T[] tArr, @m80.k C destination, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (T t11 : tArr) {
            R invoke = transform.invoke(t11);
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R ek(T[] tArr, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(tArr[0]);
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                R invoke2 = selector.invoke(tArr[i11]);
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double el(@m80.k Double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        int Oe = Oe(dArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                doubleValue = Math.max(doubleValue, dArr[i11].doubleValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double em(byte[] bArr, x00.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Byte.valueOf(bArr[i11])).doubleValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float en(short[] sArr, x00.l<? super Short, Float> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Short.valueOf(sArr[i11])).floatValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final double eo(@m80.k double[] dArr, @m80.k Comparator<? super Double> comparator) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                double d12 = dArr[i11];
                if (comparator.compare(Double.valueOf(d11), Double.valueOf(d12)) > 0) {
                    d11 = d12;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return d11;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final byte ep(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return fp(bArr, Random.Default);
    }

    public static final short eq(@m80.k short[] sArr, @m80.k x00.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                s11 = operation.invoke(Integer.valueOf(i11), Short.valueOf(s11), Short.valueOf(sArr[i11])).shortValue();
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Integer er(@m80.k int[] iArr, @m80.k x00.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Me = Me(iArr);
        if (Me < 0) {
            return null;
        }
        int i11 = iArr[Me];
        for (int i12 = Me - 1; i12 >= 0; i12--) {
            i11 = operation.invoke(Integer.valueOf(iArr[i12]), Integer.valueOf(i11)).intValue();
        }
        return Integer.valueOf(i11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> es(double[] dArr, R r11, x00.q<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r11);
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Double.valueOf(dArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void et(@m80.k int[] iArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int Me = Me(iArr); Me > 0; Me--) {
            int nextInt = random.nextInt(Me + 1);
            int i11 = iArr[Me];
            iArr[Me] = iArr[nextInt];
            iArr[nextInt] = i11;
        }
    }

    @m80.k
    public static final List<Float> eu(@m80.k float[] fArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a00.q.q(a00.q.i1(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @m80.k
    public static final List<Integer> ev(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        Integer[] R4 = a00.q.R4(iArr);
        a00.q.U3(R4);
        return a00.q.t(R4);
    }

    @m80.k
    public static final List<Long> ew(@m80.k long[] jArr, @m80.k Comparator<? super Long> comparator) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Long[] S4 = a00.q.S4(jArr);
        a00.q.h4(S4, comparator);
        return a00.q.t(S4);
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final int ex(float[] fArr, x00.l<? super Float, Integer> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (float f11 : fArr) {
            i11 += selector.invoke(Float.valueOf(f11)).intValue();
        }
        return i11;
    }

    @m80.k
    public static final <T> List<T> ey(@m80.k T[] tArr, int i11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int length = tArr.length;
        if (i11 >= length) {
            return dz(tArr);
        }
        if (i11 == 1) {
            return g0.l(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(tArr[i12]);
        }
        return arrayList;
    }

    @m80.k
    public static List<Short> ez(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? oz(sArr) : g0.l(Short.valueOf(sArr[0])) : h0.J();
    }

    public static final boolean f5(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (double d11 : dArr) {
            if (!predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <K> Map<K, Byte> f6(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(bArr.length), 16));
        for (byte b11 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b11)), Byte.valueOf(b11));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V> Map<Short, V> f7(short[] sArr, x00.l<? super Short, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(sArr.length), 16));
        for (short s11 : sArr) {
            linkedHashMap.put(Short.valueOf(s11), valueSelector.invoke(Short.valueOf(s11)));
        }
        return linkedHashMap;
    }

    @o00.f
    public static final double f8(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr[3];
    }

    @m80.k
    public static final List<Byte> f9(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return r0.a6(qz(bArr));
    }

    public static final Iterator fA(long[] jArr) {
        return kotlin.jvm.internal.i.g(jArr);
    }

    @m80.k
    public static final <R, V> List<V> fB(@m80.k boolean[] zArr, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super Boolean, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final List<Short> fa(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (short s11 : sArr) {
            if (z11) {
                arrayList.add(Short.valueOf(s11));
            } else if (!predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                arrayList.add(Short.valueOf(s11));
                z11 = true;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final List<Float> fb(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f11 : fArr) {
            if (!predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                arrayList.add(Float.valueOf(f11));
            }
        }
        return arrayList;
    }

    public static int fc(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C fd(int[] iArr, C destination, x00.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    public static final <R> R fe(@m80.k short[] sArr, R r11, @m80.k x00.q<? super Integer, ? super Short, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Pe = Pe(sArr); Pe >= 0; Pe--) {
            r11 = operation.invoke(Integer.valueOf(Pe), Short.valueOf(sArr[Pe]), r11);
        }
        return r11;
    }

    @m80.l
    public static Integer ff(@m80.k int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (i11 < 0 || i11 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i11]);
    }

    public static final int fg(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(Character.valueOf(cArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <A extends Appendable> A fh(@m80.k boolean[] zArr, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Boolean, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (boolean z11 : zArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Boolean.valueOf(z11)));
            } else {
                buffer.append(String.valueOf(z11));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static <T> int fi(@m80.k T[] tArr, T t11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (t11 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i12 = length2 - 1;
                    if (kotlin.jvm.internal.g0.g(t11, tArr[length2])) {
                        return length2;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    length2 = i12;
                }
            }
        }
        return -1;
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C fj(@m80.k byte[] bArr, @m80.k C destination, @m80.k x00.l<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (byte b11 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b11)));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R fk(short[] sArr, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                R invoke2 = selector.invoke(Short.valueOf(sArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static Float fl(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                f11 = Math.max(f11, fArr[i11]);
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double fm(char[] cArr, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(cArr[i11])).doubleValue());
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float fn(boolean[] zArr, x00.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Boolean.valueOf(zArr[i11])).floatValue());
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final float fo(@m80.k float[] fArr, @m80.k Comparator<? super Float> comparator) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                float f12 = fArr[i11];
                if (comparator.compare(Float.valueOf(f11), Float.valueOf(f12)) > 0) {
                    f11 = f12;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return f11;
    }

    @yz.y0(version = "1.3")
    public static final byte fp(@m80.k byte[] bArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (bArr.length != 0) {
            return bArr[random.nextInt(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final boolean fq(@m80.k boolean[] zArr, @m80.k x00.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                z11 = operation.invoke(Integer.valueOf(i11), Boolean.valueOf(z11), Boolean.valueOf(zArr[i11])).booleanValue();
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return z11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Long fr(@m80.k long[] jArr, @m80.k x00.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ne = Ne(jArr);
        if (Ne < 0) {
            return null;
        }
        long j11 = jArr[Ne];
        for (int i11 = Ne - 1; i11 >= 0; i11--) {
            j11 = operation.invoke(Long.valueOf(jArr[i11]), Long.valueOf(j11)).longValue();
        }
        return Long.valueOf(j11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> fs(float[] fArr, R r11, x00.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r11);
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Float.valueOf(fArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void ft(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        gt(jArr, Random.Default);
    }

    @m80.k
    public static final List<Float> fu(@m80.k float[] fArr, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Long> fv(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        Long[] S4 = a00.q.S4(jArr);
        a00.q.U3(S4);
        return a00.q.t(S4);
    }

    @m80.k
    public static <T> List<T> fw(@m80.k T[] tArr, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return a00.q.t(yv(tArr, comparator));
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final int fx(int[] iArr, x00.l<? super Integer, Integer> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += selector.invoke(Integer.valueOf(i12)).intValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Short> fy(@m80.k short[] sArr, int i11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int length = sArr.length;
        if (i11 >= length) {
            return ez(sArr);
        }
        if (i11 == 1) {
            return g0.l(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(Short.valueOf(sArr[i12]));
        }
        return arrayList;
    }

    @m80.k
    public static List<Boolean> fz(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? pz(zArr) : g0.l(Boolean.valueOf(zArr[0])) : h0.J();
    }

    public static final boolean g5(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (float f11 : fArr) {
            if (!predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <K, V> Map<K, V> g6(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends K> keySelector, @m80.k x00.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(bArr.length), 16));
        for (byte b11 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b11)), valueTransform.invoke(Byte.valueOf(b11)));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V> Map<Boolean, V> g7(boolean[] zArr, x00.l<? super Boolean, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(zArr.length), 16));
        for (boolean z11 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z11), valueSelector.invoke(Boolean.valueOf(z11)));
        }
        return linkedHashMap;
    }

    @o00.f
    public static final float g8(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr[3];
    }

    @m80.k
    public static final List<Character> g9(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return r0.a6(rz(cArr));
    }

    public static final Iterator gA(float[] fArr) {
        return kotlin.jvm.internal.i.e(fArr);
    }

    @m80.k
    public static final <R> List<Pair<Boolean, R>> gB(@m80.k boolean[] zArr, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            boolean z11 = zArr[i11];
            arrayList.add(yz.h1.a(Boolean.valueOf(z11), other[i11]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Boolean> ga(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (boolean z12 : zArr) {
            if (z11) {
                arrayList.add(Boolean.valueOf(z12));
            } else if (!predicate.invoke(Boolean.valueOf(z12)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z12));
                z11 = true;
            }
        }
        return arrayList;
    }

    @m80.k
    public static final List<Integer> gb(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return arrayList;
    }

    public static final int gc(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return i11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C gd(long[] jArr, C destination, x00.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = jArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), Long.valueOf(jArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    public static final <R> R ge(@m80.k boolean[] zArr, R r11, @m80.k x00.q<? super Integer, ? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int Qe = Qe(zArr); Qe >= 0; Qe--) {
            r11 = operation.invoke(Integer.valueOf(Qe), Boolean.valueOf(zArr[Qe]), r11);
        }
        return r11;
    }

    @m80.l
    public static final Long gf(@m80.k long[] jArr, int i11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (i11 < 0 || i11 >= jArr.length) {
            return null;
        }
        return Long.valueOf(jArr[i11]);
    }

    public static final int gg(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(Double.valueOf(dArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public static int gi(@m80.k short[] sArr, short s11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (s11 == sArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C gj(@m80.k char[] cArr, @m80.k C destination, @m80.k x00.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (char c11 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c11)));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R gk(boolean[] zArr, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                R invoke2 = selector.invoke(Boolean.valueOf(zArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Float gl(@m80.k Float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        int Oe = Oe(fArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                floatValue = Math.max(floatValue, fArr[i11].floatValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double gm(double[] dArr, x00.l<? super Double, Double> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Double.valueOf(dArr[i11])).doubleValue());
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R gn(byte[] bArr, Comparator<? super R> comparator, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                Object obj2 = (R) selector.invoke(Byte.valueOf(bArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final int go(@m80.k int[] iArr, @m80.k Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                if (comparator.compare(Integer.valueOf(i11), Integer.valueOf(i13)) > 0) {
                    i11 = i13;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final char gp(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return hp(cArr, Random.Default);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Boolean gq(@m80.k boolean[] zArr, @m80.k x00.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                z11 = operation.invoke(Integer.valueOf(i11), Boolean.valueOf(z11), Boolean.valueOf(zArr[i11])).booleanValue();
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z11);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <S, T extends S> S gr(@m80.k T[] tArr, @m80.k x00.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Oe = Oe(tArr);
        if (Oe < 0) {
            return null;
        }
        S s11 = (S) tArr[Oe];
        for (int i11 = Oe - 1; i11 >= 0; i11--) {
            s11 = operation.invoke((Object) tArr[i11], s11);
        }
        return s11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> gs(int[] iArr, R r11, x00.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r11);
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Integer.valueOf(iArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void gt(@m80.k long[] jArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int Ne = Ne(jArr); Ne > 0; Ne--) {
            int nextInt = random.nextInt(Ne + 1);
            long j11 = jArr[Ne];
            jArr[Ne] = jArr[nextInt];
            jArr[nextInt] = j11;
        }
    }

    @m80.k
    public static final List<Integer> gu(@m80.k int[] iArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a00.q.r(a00.q.j1(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @m80.k
    public static final <T extends Comparable<? super T>> List<T> gv(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return a00.q.t(ov(tArr));
    }

    @m80.k
    public static final List<Short> gw(@m80.k short[] sArr, @m80.k Comparator<? super Short> comparator) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Short[] T4 = a00.q.T4(sArr);
        a00.q.h4(T4, comparator);
        return a00.q.t(T4);
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final int gx(long[] jArr, x00.l<? super Long, Integer> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (long j11 : jArr) {
            i11 += selector.invoke(Long.valueOf(j11)).intValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Boolean> gy(@m80.k boolean[] zArr, int i11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int length = zArr.length;
        if (i11 >= length) {
            return fz(zArr);
        }
        if (i11 == 1) {
            return g0.l(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(Boolean.valueOf(zArr[i12]));
        }
        return arrayList;
    }

    @m80.k
    public static final long[] gz(@m80.k Long[] lArr) {
        kotlin.jvm.internal.g0.p(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i11 = 0; i11 < length; i11++) {
            jArr[i11] = lArr[i11].longValue();
        }
        return jArr;
    }

    public static final boolean h5(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <K> Map<K, Character> h6(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(cArr.length), 16));
        for (char c11 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c11)), Character.valueOf(c11));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V, M extends Map<? super Byte, ? super V>> M h7(byte[] bArr, M destination, x00.l<? super Byte, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (byte b11 : bArr) {
            destination.put(Byte.valueOf(b11), valueSelector.invoke(Byte.valueOf(b11)));
        }
        return destination;
    }

    @o00.f
    public static final int h8(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr[3];
    }

    @m80.k
    public static final List<Double> h9(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return r0.a6(sz(dArr));
    }

    public static final Iterator hA(double[] dArr) {
        return kotlin.jvm.internal.i.d(dArr);
    }

    @m80.k
    public static final <R, V> List<V> hB(@m80.k boolean[] zArr, @m80.k R[] other, @m80.k x00.p<? super Boolean, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i11]), other[i11]));
        }
        return arrayList;
    }

    @o00.f
    public static final byte ha(byte[] bArr, int i11, x00.l<? super Integer, Byte> defaultValue) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= bArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).byteValue() : bArr[i11];
    }

    @m80.k
    public static final List<Long> hb(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j11 : jArr) {
            if (!predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                arrayList.add(Long.valueOf(j11));
            }
        }
        return arrayList;
    }

    public static long hc(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R, C extends Collection<? super R>> C hd(T[] tArr, C destination, x00.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), tArr[i11]));
            i11++;
            i12++;
        }
        return destination;
    }

    public static final void he(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, g2> action) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (byte b11 : bArr) {
            action.invoke(Byte.valueOf(b11));
        }
    }

    @m80.l
    public static <T> T hf(@m80.k T[] tArr, int i11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (i11 < 0 || i11 >= tArr.length) {
            return null;
        }
        return tArr[i11];
    }

    public static final int hg(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(Float.valueOf(fArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public static final int hi(@m80.k boolean[] zArr, boolean z11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (z11 == zArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C hj(@m80.k double[] dArr, @m80.k C destination, @m80.k x00.l<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (double d11 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d11)));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R hk(byte[] bArr, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                R invoke2 = selector.invoke(Byte.valueOf(bArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static Integer hl(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                if (i11 < i13) {
                    i11 = i13;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double hm(float[] fArr, x00.l<? super Float, Double> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Float.valueOf(fArr[i11])).doubleValue());
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R hn(char[] cArr, Comparator<? super R> comparator, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                Object obj2 = (R) selector.invoke(Character.valueOf(cArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final long ho(@m80.k long[] jArr, @m80.k Comparator<? super Long> comparator) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                if (comparator.compare(Long.valueOf(j11), Long.valueOf(j12)) > 0) {
                    j11 = j12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return j11;
    }

    @yz.y0(version = "1.3")
    public static final char hp(@m80.k char[] cArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (cArr.length != 0) {
            return cArr[random.nextInt(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Byte hq(@m80.k byte[] bArr, @m80.k x00.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                b11 = operation.invoke(Integer.valueOf(i11), Byte.valueOf(b11), Byte.valueOf(bArr[i11])).byteValue();
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Short hr(@m80.k short[] sArr, @m80.k x00.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Pe = Pe(sArr);
        if (Pe < 0) {
            return null;
        }
        short s11 = sArr[Pe];
        for (int i11 = Pe - 1; i11 >= 0; i11--) {
            s11 = operation.invoke(Short.valueOf(sArr[i11]), Short.valueOf(s11)).shortValue();
        }
        return Short.valueOf(s11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> hs(long[] jArr, R r11, x00.q<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r11);
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Long.valueOf(jArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final <T> void ht(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        jt(tArr, Random.Default);
    }

    @m80.k
    public static final List<Integer> hu(@m80.k int[] iArr, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Short> hv(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        Short[] T4 = a00.q.T4(sArr);
        a00.q.U3(T4);
        return a00.q.t(T4);
    }

    @m80.k
    public static final List<Boolean> hw(@m80.k boolean[] zArr, @m80.k Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Boolean[] M4 = a00.q.M4(zArr);
        a00.q.h4(M4, comparator);
        return a00.q.t(M4);
    }

    @w00.j(name = "sumOfInt")
    public static final int hx(@m80.k Integer[] numArr) {
        kotlin.jvm.internal.g0.p(numArr, "<this>");
        int i11 = 0;
        for (Integer num : numArr) {
            i11 += num.intValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Byte> hy(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Ie = Ie(bArr); -1 < Ie; Ie--) {
            if (!predicate.invoke(Byte.valueOf(bArr[Ie])).booleanValue()) {
                return x9(bArr, Ie + 1);
            }
        }
        return Xy(bArr);
    }

    @m80.k
    public static final List<Byte> hz(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b11 : bArr) {
            arrayList.add(Byte.valueOf(b11));
        }
        return arrayList;
    }

    public static final boolean i5(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (long j11 : jArr) {
            if (!predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <K, V> Map<K, V> i6(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends K> keySelector, @m80.k x00.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(cArr.length), 16));
        for (char c11 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c11)), valueTransform.invoke(Character.valueOf(c11)));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V, M extends Map<? super Character, ? super V>> M i7(char[] cArr, M destination, x00.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (char c11 : cArr) {
            destination.put(Character.valueOf(c11), valueSelector.invoke(Character.valueOf(c11)));
        }
        return destination;
    }

    @o00.f
    public static final long i8(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr[3];
    }

    @m80.k
    public static final List<Float> i9(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return r0.a6(tz(fArr));
    }

    public static final Iterator iA(boolean[] zArr) {
        return kotlin.jvm.internal.i.a(zArr);
    }

    @m80.k
    public static final List<Pair<Boolean, Boolean>> iB(@m80.k boolean[] zArr, @m80.k boolean[] other) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(yz.h1.a(Boolean.valueOf(zArr[i11]), Boolean.valueOf(other[i11])));
        }
        return arrayList;
    }

    @o00.f
    public static final char ia(char[] cArr, int i11, x00.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= cArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).charValue() : cArr[i11];
    }

    @m80.k
    public static final <T> List<T> ib(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t11 : tArr) {
            if (!predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static final long ic(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                return j11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C id(short[] sArr, C destination, x00.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = sArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), Short.valueOf(sArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    public static final void ie(@m80.k char[] cArr, @m80.k x00.l<? super Character, g2> action) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (char c11 : cArr) {
            action.invoke(Character.valueOf(c11));
        }
    }

    public static final int ig(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @m80.l
    public static final Boolean ii(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C ij(@m80.k float[] fArr, @m80.k C destination, @m80.k x00.l<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (float f11 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f11)));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R ik(char[] cArr, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                R invoke2 = selector.invoke(Character.valueOf(cArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Long il(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                if (j11 < j12) {
                    j11 = j12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double im(int[] iArr, x00.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Integer.valueOf(iArr[i11])).doubleValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R in(double[] dArr, Comparator<? super R> comparator, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                Object obj2 = (R) selector.invoke(Double.valueOf(dArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final <T> T io(@m80.k T[] tArr, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                T t12 = tArr[i11];
                if (comparator.compare(t11, t12) > 0) {
                    t11 = t12;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return t11;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final double ip(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return jp(dArr, Random.Default);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Character iq(@m80.k char[] cArr, @m80.k x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                c11 = operation.invoke(Integer.valueOf(i11), Character.valueOf(c11), Character.valueOf(cArr[i11])).charValue();
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    @m80.k
    public static final <T> T[] ir(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        for (T t11 : tArr) {
            if (t11 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @m80.k
    public static final <T, R> List<R> is(@m80.k T[] tArr, R r11, @m80.k x00.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r11);
        int length = tArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, tArr[i11]);
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.k
    public static final List<Long> iu(@m80.k long[] jArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a00.q.s(a00.q.k1(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @m80.k
    public static final byte[] iv(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.G3(copyOf);
        return copyOf;
    }

    @m80.k
    public static final Set<Byte> iw(@m80.k byte[] bArr, @m80.k Iterable<Byte> other) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Byte> qz2 = qz(bArr);
        m0.J0(qz2, other);
        return qz2;
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> int ix(T[] tArr, x00.l<? super T, Integer> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (T t11 : tArr) {
            i11 += selector.invoke(t11).intValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Character> iy(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Je = Je(cArr); -1 < Je; Je--) {
            if (!predicate.invoke(Character.valueOf(cArr[Je])).booleanValue()) {
                return y9(cArr, Je + 1);
            }
        }
        return Yy(cArr);
    }

    @m80.k
    public static final List<Character> iz(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c11 : cArr) {
            arrayList.add(Character.valueOf(c11));
        }
        return arrayList;
    }

    public static final <T> boolean j5(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : tArr) {
            if (!predicate.invoke(t11).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <K> Map<K, Double> j6(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(dArr.length), 16));
        for (double d11 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d11)), Double.valueOf(d11));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V, M extends Map<? super Double, ? super V>> M j7(double[] dArr, M destination, x00.l<? super Double, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (double d11 : dArr) {
            destination.put(Double.valueOf(d11), valueSelector.invoke(Double.valueOf(d11)));
        }
        return destination;
    }

    @o00.f
    public static final <T> T j8(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr[3];
    }

    @m80.k
    public static final List<Integer> j9(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return r0.a6(uz(iArr));
    }

    public static final Iterator jA(char[] cArr) {
        return kotlin.jvm.internal.i.c(cArr);
    }

    @m80.k
    public static final <V> List<V> jB(@m80.k boolean[] zArr, @m80.k boolean[] other, @m80.k x00.p<? super Boolean, ? super Boolean, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i11]), Boolean.valueOf(other[i11])));
        }
        return arrayList;
    }

    @o00.f
    public static final double ja(double[] dArr, int i11, x00.l<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= dArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).doubleValue() : dArr[i11];
    }

    @m80.k
    public static final List<Short> jb(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s11 : sArr) {
            if (!predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                arrayList.add(Short.valueOf(s11));
            }
        }
        return arrayList;
    }

    public static <T> T jc(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C jd(boolean[] zArr, C destination, x00.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = zArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), Boolean.valueOf(zArr[i11])));
            i11++;
            i12++;
        }
        return destination;
    }

    public static final void je(@m80.k double[] dArr, @m80.k x00.l<? super Double, g2> action) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (double d11 : dArr) {
            action.invoke(Double.valueOf(d11));
        }
    }

    @m80.l
    public static final Short jf(@m80.k short[] sArr, int i11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (i11 < 0 || i11 >= sArr.length) {
            return null;
        }
        return Short.valueOf(sArr[i11]);
    }

    public static final int jg(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(Long.valueOf(jArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @m80.l
    public static final Boolean ji(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            boolean z11 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                return Boolean.valueOf(z11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C jj(@m80.k int[] iArr, @m80.k C destination, @m80.k x00.l<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (int i11 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i11)));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R jk(double[] dArr, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                R invoke2 = selector.invoke(Double.valueOf(dArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Short jl(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                if (s11 < s12) {
                    s11 = s12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double jm(long[] jArr, x00.l<? super Long, Double> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Long.valueOf(jArr[i11])).doubleValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R jn(float[] fArr, Comparator<? super R> comparator, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                Object obj2 = (R) selector.invoke(Float.valueOf(fArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final short jo(@m80.k short[] sArr, @m80.k Comparator<? super Short> comparator) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                if (comparator.compare(Short.valueOf(s11), Short.valueOf(s12)) > 0) {
                    s11 = s12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    @yz.y0(version = "1.3")
    public static final double jp(@m80.k double[] dArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (dArr.length != 0) {
            return dArr[random.nextInt(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double jq(@m80.k double[] dArr, @m80.k x00.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                d11 = operation.invoke(Integer.valueOf(i11), Double.valueOf(d11), Double.valueOf(dArr[i11])).doubleValue();
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    public static void jr(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Ie = Ie(bArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[Ie];
            bArr[Ie] = b11;
            Ie--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> js(short[] sArr, R r11, x00.q<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r11);
        int length = sArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Short.valueOf(sArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final <T> void jt(@m80.k T[] tArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int Oe = Oe(tArr); Oe > 0; Oe--) {
            int nextInt = random.nextInt(Oe + 1);
            T t11 = tArr[Oe];
            tArr[Oe] = tArr[nextInt];
            tArr[nextInt] = t11;
        }
    }

    @m80.k
    public static final List<Long> ju(@m80.k long[] jArr, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @m80.k
    public static final char[] jv(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.I3(copyOf);
        return copyOf;
    }

    @m80.k
    public static final Set<Character> jw(@m80.k char[] cArr, @m80.k Iterable<Character> other) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Character> rz2 = rz(cArr);
        m0.J0(rz2, other);
        return rz2;
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final int jx(short[] sArr, x00.l<? super Short, Integer> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (short s11 : sArr) {
            i11 += selector.invoke(Short.valueOf(s11)).intValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Double> jy(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Ke = Ke(dArr); -1 < Ke; Ke--) {
            if (!predicate.invoke(Double.valueOf(dArr[Ke])).booleanValue()) {
                return z9(dArr, Ke + 1);
            }
        }
        return Zy(dArr);
    }

    @m80.k
    public static final List<Double> jz(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d11 : dArr) {
            arrayList.add(Double.valueOf(d11));
        }
        return arrayList;
    }

    public static final boolean k5(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (short s11 : sArr) {
            if (!predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <K, V> Map<K, V> k6(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends K> keySelector, @m80.k x00.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(dArr.length), 16));
        for (double d11 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d11)), valueTransform.invoke(Double.valueOf(d11)));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V, M extends Map<? super Float, ? super V>> M k7(float[] fArr, M destination, x00.l<? super Float, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (float f11 : fArr) {
            destination.put(Float.valueOf(f11), valueSelector.invoke(Float.valueOf(f11)));
        }
        return destination;
    }

    @o00.f
    public static final short k8(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr[3];
    }

    @m80.k
    public static final List<Long> k9(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return r0.a6(vz(jArr));
    }

    @m80.k
    public static final <R> List<Pair<Byte, R>> kA(@m80.k byte[] bArr, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(Byte.valueOf(bArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @o00.f
    public static final float ka(float[] fArr, int i11, x00.l<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= fArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).floatValue() : fArr[i11];
    }

    @m80.k
    public static final List<Boolean> kb(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z11 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z11));
            }
        }
        return arrayList;
    }

    public static final <T> T kc(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @w00.j(name = "flatMapIndexedSequence")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R> List<R> kd(T[] tArr, x00.p<? super Integer, ? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.t0(arrayList, transform.invoke(Integer.valueOf(i12), tArr[i11]));
            i11++;
            i12++;
        }
        return arrayList;
    }

    public static final void ke(@m80.k float[] fArr, @m80.k x00.l<? super Float, g2> action) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (float f11 : fArr) {
            action.invoke(Float.valueOf(f11));
        }
    }

    @m80.k
    public static final <K> Map<K, List<Byte>> kf(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b11 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Byte.valueOf(b11));
        }
        return linkedHashMap;
    }

    public static final <T> int kg(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = tArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(tArr[i11]).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @m80.l
    public static final Byte ki(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C kj(@m80.k long[] jArr, @m80.k C destination, @m80.k x00.l<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (long j11 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j11)));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R kk(float[] fArr, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                R invoke2 = selector.invoke(Float.valueOf(fArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final byte kl(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                if (b11 < b12) {
                    b11 = b12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return b11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> double km(T[] tArr, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(tArr[i11]).doubleValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R kn(int[] iArr, Comparator<? super R> comparator, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                Object obj2 = (R) selector.invoke(Integer.valueOf(iArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final boolean ko(@m80.k boolean[] zArr, @m80.k Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                boolean z12 = zArr[i11];
                if (comparator.compare(Boolean.valueOf(z11), Boolean.valueOf(z12)) > 0) {
                    z11 = z12;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return z11;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final float kp(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return lp(fArr, Random.Default);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Float kq(@m80.k float[] fArr, @m80.k x00.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                f11 = operation.invoke(Integer.valueOf(i11), Float.valueOf(f11), Float.valueOf(fArr[i11])).floatValue();
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    @yz.y0(version = "1.4")
    public static void kr(@m80.k byte[] bArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        a00.d.Companion.d(i11, i12, bArr.length);
        int i13 = (i11 + i12) / 2;
        if (i11 == i13) {
            return;
        }
        int i14 = i12 - 1;
        while (i11 < i13) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[i14];
            bArr[i14] = b11;
            i14--;
            i11++;
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <R> List<R> ks(boolean[] zArr, R r11, x00.q<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r11);
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Boolean.valueOf(zArr[i11]));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void kt(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        lt(sArr, Random.Default);
    }

    @m80.k
    public static <T> List<T> ku(@m80.k T[] tArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a00.q.t(a00.q.l1(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @m80.k
    public static final double[] kv(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.K3(copyOf);
        return copyOf;
    }

    @m80.k
    public static final Set<Double> kw(@m80.k double[] dArr, @m80.k Iterable<Double> other) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Double> sz2 = sz(dArr);
        m0.J0(sz2, other);
        return sz2;
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final int kx(boolean[] zArr, x00.l<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (boolean z11 : zArr) {
            i11 += selector.invoke(Boolean.valueOf(z11)).intValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Float> ky(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Le = Le(fArr); -1 < Le; Le--) {
            if (!predicate.invoke(Float.valueOf(fArr[Le])).booleanValue()) {
                return A9(fArr, Le + 1);
            }
        }
        return az(fArr);
    }

    @m80.k
    public static final List<Float> kz(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f11 : fArr) {
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    public static final boolean l5(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (boolean z11 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <K> Map<K, Float> l6(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(fArr.length), 16));
        for (float f11 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f11)), Float.valueOf(f11));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V, M extends Map<? super Integer, ? super V>> M l7(int[] iArr, M destination, x00.l<? super Integer, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (int i11 : iArr) {
            destination.put(Integer.valueOf(i11), valueSelector.invoke(Integer.valueOf(i11)));
        }
        return destination;
    }

    @o00.f
    public static final boolean l8(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr[3];
    }

    @m80.k
    public static final <T> List<T> l9(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return r0.a6(wz(tArr));
    }

    @m80.k
    public static final <R, V> List<V> lA(@m80.k byte[] bArr, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super Byte, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @o00.f
    public static final int la(int[] iArr, int i11, x00.l<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= iArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).intValue() : iArr[i11];
    }

    @m80.k
    public static <T> List<T> lb(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return (List) mb(tArr, new ArrayList());
    }

    public static short lc(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @w00.j(name = "flatMapIndexedSequenceTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R, C extends Collection<? super R>> C ld(T[] tArr, C destination, x00.p<? super Integer, ? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m0.t0(destination, transform.invoke(Integer.valueOf(i12), tArr[i11]));
            i11++;
            i12++;
        }
        return destination;
    }

    public static final void le(@m80.k int[] iArr, @m80.k x00.l<? super Integer, g2> action) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (int i11 : iArr) {
            action.invoke(Integer.valueOf(i11));
        }
    }

    @m80.k
    public static final <K, V> Map<K, List<V>> lf(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends K> keySelector, @m80.k x00.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b11 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Byte.valueOf(b11)));
        }
        return linkedHashMap;
    }

    public static final int lg(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = sArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(Short.valueOf(sArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @m80.l
    public static final Byte li(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            byte b11 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                return Byte.valueOf(b11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C lj(@m80.k T[] tArr, @m80.k C destination, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (T t11 : tArr) {
            destination.add(transform.invoke(t11));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R lk(int[] iArr, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                R invoke2 = selector.invoke(Integer.valueOf(iArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final char ll(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                if (kotlin.jvm.internal.g0.t(c11, c12) < 0) {
                    c11 = c12;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return c11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double lm(short[] sArr, x00.l<? super Short, Double> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Short.valueOf(sArr[i11])).doubleValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R ln(long[] jArr, Comparator<? super R> comparator, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                Object obj2 = (R) selector.invoke(Long.valueOf(jArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean lo(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr.length == 0;
    }

    @yz.y0(version = "1.3")
    public static final float lp(@m80.k float[] fArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (fArr.length != 0) {
            return fArr[random.nextInt(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Integer lq(@m80.k int[] iArr, @m80.k x00.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                i11 = operation.invoke(Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(iArr[i12])).intValue();
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    public static final void lr(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Je = Je(cArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            char c11 = cArr[i11];
            cArr[i11] = cArr[Je];
            cArr[Je] = c11;
            Je--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Byte> ls(byte[] bArr, x00.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            return h0.J();
        }
        byte b11 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b11));
        int length = bArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            b11 = operation.invoke(Byte.valueOf(b11), Byte.valueOf(bArr[i11])).byteValue();
            arrayList.add(Byte.valueOf(b11));
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void lt(@m80.k short[] sArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int Pe = Pe(sArr); Pe > 0; Pe--) {
            int nextInt = random.nextInt(Pe + 1);
            short s11 = sArr[Pe];
            sArr[Pe] = sArr[nextInt];
            sArr[nextInt] = s11;
        }
    }

    @m80.k
    public static final <T> List<T> lu(@m80.k T[] tArr, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    @m80.k
    public static final float[] lv(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.M3(copyOf);
        return copyOf;
    }

    @m80.k
    public static final Set<Float> lw(@m80.k float[] fArr, @m80.k Iterable<Float> other) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Float> tz2 = tz(fArr);
        m0.J0(tz2, other);
        return tz2;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final long lx(byte[] bArr, x00.l<? super Byte, Long> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (byte b11 : bArr) {
            j11 += selector.invoke(Byte.valueOf(b11)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Integer> ly(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Me = Me(iArr); -1 < Me; Me--) {
            if (!predicate.invoke(Integer.valueOf(iArr[Me])).booleanValue()) {
                return B9(iArr, Me + 1);
            }
        }
        return bz(iArr);
    }

    @m80.k
    public static List<Integer> lz(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public static boolean m5(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @m80.k
    public static final <K, V> Map<K, V> m6(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends K> keySelector, @m80.k x00.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(fArr.length), 16));
        for (float f11 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f11)), valueTransform.invoke(Float.valueOf(f11)));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V, M extends Map<? super Long, ? super V>> M m7(long[] jArr, M destination, x00.l<? super Long, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (long j11 : jArr) {
            destination.put(Long.valueOf(j11), valueSelector.invoke(Long.valueOf(j11)));
        }
        return destination;
    }

    @o00.f
    public static final byte m8(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bArr[4];
    }

    @m80.k
    public static final List<Short> m9(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return r0.a6(xz(sArr));
    }

    @m80.k
    public static final List<Pair<Byte, Byte>> mA(@m80.k byte[] bArr, @m80.k byte[] other) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(yz.h1.a(Byte.valueOf(bArr[i11]), Byte.valueOf(other[i11])));
        }
        return arrayList;
    }

    @o00.f
    public static final long ma(long[] jArr, int i11, x00.l<? super Integer, Long> defaultValue) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= jArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).longValue() : jArr[i11];
    }

    @m80.k
    public static final <C extends Collection<? super T>, T> C mb(@m80.k T[] tArr, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (T t11 : tArr) {
            if (t11 != null) {
                destination.add(t11);
            }
        }
        return destination;
    }

    public static final short mc(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (short s11 : sArr) {
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                return s11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @w00.j(name = "flatMapSequence")
    @yz.y0(version = "1.4")
    @m80.k
    @yz.p0
    public static final <T, R> List<R> md(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t11 : tArr) {
            m0.t0(arrayList, transform.invoke(t11));
        }
        return arrayList;
    }

    public static final void me(@m80.k long[] jArr, @m80.k x00.l<? super Long, g2> action) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (long j11 : jArr) {
            action.invoke(Long.valueOf(j11));
        }
    }

    @m80.k
    public static final <K> Map<K, List<Character>> mf(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c11 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(c11));
        }
        return linkedHashMap;
    }

    public static final int mg(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(Boolean.valueOf(zArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @m80.l
    public static final Character mi(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C mj(@m80.k short[] sArr, @m80.k C destination, @m80.k x00.l<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (short s11 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s11)));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R mk(long[] jArr, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                R invoke2 = selector.invoke(Long.valueOf(jArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final double ml(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                d11 = Math.max(d11, dArr[i11]);
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return d11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double mm(boolean[] zArr, x00.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Boolean.valueOf(zArr[i11])).doubleValue());
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R mn(T[] tArr, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(tArr[0]);
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                Object obj2 = (R) selector.invoke(tArr[i11]);
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean mo(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (byte b11 : bArr) {
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final int mp(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return np(iArr, Random.Default);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Long mq(@m80.k long[] jArr, @m80.k x00.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                j11 = operation.invoke(Integer.valueOf(i11), Long.valueOf(j11), Long.valueOf(jArr[i11])).longValue();
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    @yz.y0(version = "1.4")
    public static final void mr(@m80.k char[] cArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        a00.d.Companion.d(i11, i12, cArr.length);
        int i13 = (i11 + i12) / 2;
        if (i11 == i13) {
            return;
        }
        int i14 = i12 - 1;
        while (i11 < i13) {
            char c11 = cArr[i11];
            cArr[i11] = cArr[i14];
            cArr[i14] = c11;
            i14--;
            i11++;
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Character> ms(char[] cArr, x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            return h0.J();
        }
        char c11 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c11));
        int length = cArr.length;
        int i11 = 1;
        while (i11 < length) {
            Character invoke = operation.invoke(Character.valueOf(c11), Character.valueOf(cArr[i11]));
            char charValue = invoke.charValue();
            arrayList.add(invoke);
            i11++;
            c11 = charValue;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void mt(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        nt(zArr, Random.Default);
    }

    @m80.k
    public static final List<Short> mu(@m80.k short[] sArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a00.q.u(a00.q.m1(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @m80.k
    public static final int[] mv(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.O3(copyOf);
        return copyOf;
    }

    @m80.k
    public static final Set<Integer> mw(@m80.k int[] iArr, @m80.k Iterable<Integer> other) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Integer> uz2 = uz(iArr);
        m0.J0(uz2, other);
        return uz2;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final long mx(char[] cArr, x00.l<? super Character, Long> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (char c11 : cArr) {
            j11 += selector.invoke(Character.valueOf(c11)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Long> my(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Ne = Ne(jArr); -1 < Ne; Ne--) {
            if (!predicate.invoke(Long.valueOf(jArr[Ne])).booleanValue()) {
                return C9(jArr, Ne + 1);
            }
        }
        return cz(jArr);
    }

    @m80.k
    public static final List<Long> mz(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j11 : jArr) {
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    public static final boolean n5(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (byte b11 : bArr) {
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final <K> Map<K, Integer> n6(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(iArr.length), 16));
        for (int i11 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i11)), Integer.valueOf(i11));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M n7(@m80.k K[] kArr, @m80.k M destination, @m80.k x00.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(kArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (K k11 : kArr) {
            destination.put(k11, valueSelector.invoke(k11));
        }
        return destination;
    }

    @o00.f
    public static final char n8(char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr[4];
    }

    @m80.k
    public static final List<Boolean> n9(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return r0.a6(yz(zArr));
    }

    @m80.k
    public static final <V> List<V> nA(@m80.k byte[] bArr, @m80.k byte[] other, @m80.k x00.p<? super Byte, ? super Byte, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i11]), Byte.valueOf(other[i11])));
        }
        return arrayList;
    }

    @o00.f
    public static final <T> T na(T[] tArr, int i11, x00.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= tArr.length) ? defaultValue.invoke(Integer.valueOf(i11)) : tArr[i11];
    }

    @m80.k
    public static final <C extends Collection<? super Byte>> C nb(@m80.k byte[] bArr, @m80.k C destination, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (byte b11 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                destination.add(Byte.valueOf(b11));
            }
        }
        return destination;
    }

    public static final boolean nc(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @w00.j(name = "flatMapSequenceTo")
    @yz.y0(version = "1.4")
    @m80.k
    @yz.p0
    public static final <T, R, C extends Collection<? super R>> C nd(@m80.k T[] tArr, @m80.k C destination, @m80.k x00.l<? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (T t11 : tArr) {
            m0.t0(destination, transform.invoke(t11));
        }
        return destination;
    }

    public static final <T> void ne(@m80.k T[] tArr, @m80.k x00.l<? super T, g2> action) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (T t11 : tArr) {
            action.invoke(t11);
        }
    }

    @m80.k
    public static final <K, V> Map<K, List<V>> nf(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends K> keySelector, @m80.k x00.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c11 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Character.valueOf(c11)));
        }
        return linkedHashMap;
    }

    public static final int ng(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.l
    public static final Character ni(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            char c11 = cArr[length];
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                return Character.valueOf(c11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C nj(@m80.k boolean[] zArr, @m80.k C destination, @m80.k x00.l<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (boolean z11 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z11)));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R nk(T[] tArr, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(tArr[0]);
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                R invoke2 = selector.invoke(tArr[i11]);
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final double nl(@m80.k Double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        int Oe = Oe(dArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                doubleValue = Math.max(doubleValue, dArr[i11].doubleValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float nm(byte[] bArr, x00.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Byte.valueOf(bArr[i11])).floatValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R nn(short[] sArr, Comparator<? super R> comparator, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                Object obj2 = (R) selector.invoke(Short.valueOf(sArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean no(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr.length == 0;
    }

    @yz.y0(version = "1.3")
    public static final int np(@m80.k int[] iArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (iArr.length != 0) {
            return iArr[random.nextInt(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <S, T extends S> S nq(@m80.k T[] tArr, @m80.k x00.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s11 = (Object) tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                s11 = operation.invoke(Integer.valueOf(i11), s11, (Object) tArr[i11]);
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    public static final void nr(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Ke = Ke(dArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            double d11 = dArr[i11];
            dArr[i11] = dArr[Ke];
            dArr[Ke] = d11;
            Ke--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Double> ns(double[] dArr, x00.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            return h0.J();
        }
        double d11 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d11));
        int length = dArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            d11 = operation.invoke(Double.valueOf(d11), Double.valueOf(dArr[i11])).doubleValue();
            arrayList.add(Double.valueOf(d11));
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    public static final void nt(@m80.k boolean[] zArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int Qe = Qe(zArr); Qe > 0; Qe--) {
            int nextInt = random.nextInt(Qe + 1);
            boolean z11 = zArr[Qe];
            zArr[Qe] = zArr[nextInt];
            zArr[nextInt] = z11;
        }
    }

    @m80.k
    public static final List<Short> nu(@m80.k short[] sArr, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @m80.k
    public static final long[] nv(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.Q3(copyOf);
        return copyOf;
    }

    @m80.k
    public static final Set<Long> nw(@m80.k long[] jArr, @m80.k Iterable<Long> other) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Long> vz2 = vz(jArr);
        m0.J0(vz2, other);
        return vz2;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final long nx(double[] dArr, x00.l<? super Double, Long> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (double d11 : dArr) {
            j11 += selector.invoke(Double.valueOf(d11)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final <T> List<T> ny(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Oe = Oe(tArr); -1 < Oe; Oe--) {
            if (!predicate.invoke(tArr[Oe]).booleanValue()) {
                return D9(tArr, Oe + 1);
            }
        }
        return dz(tArr);
    }

    @m80.k
    public static <T> List<T> nz(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return new ArrayList(h0.v(tArr, false, 1, null));
    }

    public static final boolean o5(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @m80.k
    public static final <K, V> Map<K, V> o6(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends K> keySelector, @m80.k x00.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(iArr.length), 16));
        for (int i11 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i11)), valueTransform.invoke(Integer.valueOf(i11)));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V, M extends Map<? super Short, ? super V>> M o7(short[] sArr, M destination, x00.l<? super Short, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (short s11 : sArr) {
            destination.put(Short.valueOf(s11), valueSelector.invoke(Short.valueOf(s11)));
        }
        return destination;
    }

    @o00.f
    public static final double o8(double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr[4];
    }

    @m80.k
    public static final <K> List<Byte> o9(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b11 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b11)))) {
                arrayList.add(Byte.valueOf(b11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <R> List<Pair<Byte, R>> oA(@m80.k byte[] bArr, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            byte b11 = bArr[i11];
            arrayList.add(yz.h1.a(Byte.valueOf(b11), other[i11]));
        }
        return arrayList;
    }

    @o00.f
    public static final short oa(short[] sArr, int i11, x00.l<? super Integer, Short> defaultValue) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= sArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).shortValue() : sArr[i11];
    }

    @m80.k
    public static final <C extends Collection<? super Character>> C ob(@m80.k char[] cArr, @m80.k C destination, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (char c11 : cArr) {
            if (!predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                destination.add(Character.valueOf(c11));
            }
        }
        return destination;
    }

    public static final boolean oc(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                return z11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C od(@m80.k byte[] bArr, @m80.k C destination, @m80.k x00.l<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (byte b11 : bArr) {
            m0.s0(destination, transform.invoke(Byte.valueOf(b11)));
        }
        return destination;
    }

    public static final void oe(@m80.k short[] sArr, @m80.k x00.l<? super Short, g2> action) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (short s11 : sArr) {
            action.invoke(Short.valueOf(s11));
        }
    }

    @m80.k
    public static final <K> Map<K, List<Double>> of(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d11 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Double.valueOf(d11));
        }
        return linkedHashMap;
    }

    public static final int og(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.l
    public static final Double oi(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean oj(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        if (Qe == 0) {
            return Boolean.valueOf(z11);
        }
        R invoke = selector.invoke(Boolean.valueOf(z11));
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                boolean z12 = zArr[i11];
                R invoke2 = selector.invoke(Boolean.valueOf(z12));
                if (invoke.compareTo(invoke2) < 0) {
                    z11 = z12;
                    invoke = invoke2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R ok(short[] sArr, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                R invoke2 = selector.invoke(Short.valueOf(sArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final float ol(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                f11 = Math.max(f11, fArr[i11]);
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return f11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float om(char[] cArr, x00.l<? super Character, Float> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(cArr[i11])).floatValue());
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R on(boolean[] zArr, Comparator<? super R> comparator, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                Object obj2 = (R) selector.invoke(Boolean.valueOf(zArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean oo(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final long op(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return pp(jArr, Random.Default);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Short oq(@m80.k short[] sArr, @m80.k x00.q<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                s11 = operation.invoke(Integer.valueOf(i11), Short.valueOf(s11), Short.valueOf(sArr[i11])).shortValue();
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    @yz.y0(version = "1.4")
    public static final void or(@m80.k double[] dArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        a00.d.Companion.d(i11, i12, dArr.length);
        int i13 = (i11 + i12) / 2;
        if (i11 == i13) {
            return;
        }
        int i14 = i12 - 1;
        while (i11 < i13) {
            double d11 = dArr[i11];
            dArr[i11] = dArr[i14];
            dArr[i14] = d11;
            i14--;
            i11++;
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Float> os(float[] fArr, x00.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            return h0.J();
        }
        float f11 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f11));
        int length = fArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            f11 = operation.invoke(Float.valueOf(f11), Float.valueOf(fArr[i11])).floatValue();
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    public static byte ot(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @m80.k
    public static final List<Boolean> ou(@m80.k boolean[] zArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a00.q.v(a00.q.n1(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @m80.k
    public static final <T extends Comparable<? super T>> T[] ov(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        a00.q.U3(tArr2);
        return tArr2;
    }

    @m80.k
    public static final <T> Set<T> ow(@m80.k T[] tArr, @m80.k Iterable<? extends T> other) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<T> wz2 = wz(tArr);
        m0.J0(wz2, other);
        return wz2;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final long ox(float[] fArr, x00.l<? super Float, Long> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (float f11 : fArr) {
            j11 += selector.invoke(Float.valueOf(f11)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Short> oy(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Pe = Pe(sArr); -1 < Pe; Pe--) {
            if (!predicate.invoke(Short.valueOf(sArr[Pe])).booleanValue()) {
                return E9(sArr, Pe + 1);
            }
        }
        return ez(sArr);
    }

    @m80.k
    public static final List<Short> oz(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s11 : sArr) {
            arrayList.add(Short.valueOf(s11));
        }
        return arrayList;
    }

    public static final boolean p5(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final <K> Map<K, Long> p6(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(jArr.length), 16));
        for (long j11 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j11)), Long.valueOf(j11));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <V, M extends Map<? super Boolean, ? super V>> M p7(boolean[] zArr, M destination, x00.l<? super Boolean, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (boolean z11 : zArr) {
            destination.put(Boolean.valueOf(z11), valueSelector.invoke(Boolean.valueOf(z11)));
        }
        return destination;
    }

    @o00.f
    public static final float p8(float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr[4];
    }

    @m80.k
    public static final <K> List<Character> p9(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c11 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c11)))) {
                arrayList.add(Character.valueOf(c11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <R, V> List<V> pA(@m80.k byte[] bArr, @m80.k R[] other, @m80.k x00.p<? super Byte, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i11]), other[i11]));
        }
        return arrayList;
    }

    @o00.f
    public static final boolean pa(boolean[] zArr, int i11, x00.l<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= zArr.length) ? defaultValue.invoke(Integer.valueOf(i11)).booleanValue() : zArr[i11];
    }

    @m80.k
    public static final <C extends Collection<? super Double>> C pb(@m80.k double[] dArr, @m80.k C destination, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (double d11 : dArr) {
            if (!predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                destination.add(Double.valueOf(d11));
            }
        }
        return destination;
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final <T, R> R pc(T[] tArr, x00.l<? super T, ? extends R> transform) {
        R r11;
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = tArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                r11 = transform.invoke(tArr[i11]);
                if (r11 != null) {
                    break;
                }
                i11++;
            } else {
                r11 = null;
                break;
            }
        }
        if (r11 != null) {
            return r11;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C pd(@m80.k char[] cArr, @m80.k C destination, @m80.k x00.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (char c11 : cArr) {
            m0.s0(destination, transform.invoke(Character.valueOf(c11)));
        }
        return destination;
    }

    public static final void pe(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, g2> action) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (boolean z11 : zArr) {
            action.invoke(Boolean.valueOf(z11));
        }
    }

    @m80.k
    public static final <K, V> Map<K, List<V>> pf(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends K> keySelector, @m80.k x00.l<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d11 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Double.valueOf(d11)));
        }
        return linkedHashMap;
    }

    public static final int pg(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final String ph(@m80.k byte[] bArr, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Byte, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) Xg(bArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.l
    public static final Double pi(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            double d11 = dArr[length];
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                return Double.valueOf(d11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte pj(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        if (Ie == 0) {
            return Byte.valueOf(b11);
        }
        R invoke = selector.invoke(Byte.valueOf(b11));
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                R invoke2 = selector.invoke(Byte.valueOf(b12));
                if (invoke.compareTo(invoke2) < 0) {
                    b11 = b12;
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R pk(boolean[] zArr, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                R invoke2 = selector.invoke(Boolean.valueOf(zArr[i11]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final float pl(@m80.k Float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = fArr[0].floatValue();
        int Oe = Oe(fArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                floatValue = Math.max(floatValue, fArr[i11].floatValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float pm(double[] dArr, x00.l<? super Double, Float> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Double.valueOf(dArr[i11])).floatValue());
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R pn(byte[] bArr, Comparator<? super R> comparator, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                Object obj2 = (R) selector.invoke(Byte.valueOf(bArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean po(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return dArr.length == 0;
    }

    @yz.y0(version = "1.3")
    public static final long pp(@m80.k long[] jArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (jArr.length != 0) {
            return jArr[random.nextInt(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Boolean pq(@m80.k boolean[] zArr, @m80.k x00.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                z11 = operation.invoke(Boolean.valueOf(z11), Boolean.valueOf(zArr[i11])).booleanValue();
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z11);
    }

    public static final void pr(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Le = Le(fArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            float f11 = fArr[i11];
            fArr[i11] = fArr[Le];
            fArr[Le] = f11;
            Le--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Integer> ps(int[] iArr, x00.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            return h0.J();
        }
        int i11 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i11));
        int length = iArr.length;
        for (int i12 = 1; i12 < length; i12++) {
            i11 = operation.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i12])).intValue();
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public static final byte pt(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Byte b11 = null;
        boolean z11 = false;
        for (byte b12 : bArr) {
            if (predicate.invoke(Byte.valueOf(b12)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                b11 = Byte.valueOf(b12);
                z11 = true;
            }
        }
        if (!z11) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type kotlin.Byte");
        return b11.byteValue();
    }

    @m80.k
    public static final List<Boolean> pu(@m80.k boolean[] zArr, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @m80.k
    public static final short[] pv(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        a00.q.W3(copyOf);
        return copyOf;
    }

    @m80.k
    public static final Set<Short> pw(@m80.k short[] sArr, @m80.k Iterable<Short> other) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Short> xz2 = xz(sArr);
        m0.J0(xz2, other);
        return xz2;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final long px(int[] iArr, x00.l<? super Integer, Long> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (int i11 : iArr) {
            j11 += selector.invoke(Integer.valueOf(i11)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Boolean> py(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int Qe = Qe(zArr); -1 < Qe; Qe--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[Qe])).booleanValue()) {
                return F9(zArr, Qe + 1);
            }
        }
        return fz(zArr);
    }

    @m80.k
    public static final List<Boolean> pz(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z11 : zArr) {
            arrayList.add(Boolean.valueOf(z11));
        }
        return arrayList;
    }

    public static final boolean q5(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @m80.k
    public static final <K, V> Map<K, V> q6(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends K> keySelector, @m80.k x00.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(jArr.length), 16));
        for (long j11 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j11)), valueTransform.invoke(Long.valueOf(j11)));
        }
        return linkedHashMap;
    }

    public static final double q7(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (byte b11 : bArr) {
            d11 += b11;
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @o00.f
    public static final int q8(int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr[4];
    }

    @m80.k
    public static final <K> List<Double> q9(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d11 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d11)))) {
                arrayList.add(Double.valueOf(d11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <R> List<Pair<Character, R>> qA(@m80.k char[] cArr, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(Character.valueOf(cArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @o00.f
    public static final Boolean qa(boolean[] zArr, int i11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return af(zArr, i11);
    }

    @m80.k
    public static final <C extends Collection<? super Float>> C qb(@m80.k float[] fArr, @m80.k C destination, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (float f11 : fArr) {
            if (!predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                destination.add(Float.valueOf(f11));
            }
        }
        return destination;
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final <T, R> R qc(T[] tArr, x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (T t11 : tArr) {
            R invoke = transform.invoke(t11);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C qd(@m80.k double[] dArr, @m80.k C destination, @m80.k x00.l<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (double d11 : dArr) {
            m0.s0(destination, transform.invoke(Double.valueOf(d11)));
        }
        return destination;
    }

    public static final void qe(@m80.k byte[] bArr, @m80.k x00.p<? super Integer, ? super Byte, g2> action) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Byte.valueOf(bArr[i11]));
            i11++;
            i12++;
        }
    }

    @m80.k
    public static final <K> Map<K, List<Float>> qf(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f11 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Float.valueOf(f11));
        }
        return linkedHashMap;
    }

    public static final int qg(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final String qh(@m80.k char[] cArr, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Character, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) Yg(cArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.l
    public static final Float qi(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Character qj(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        if (Je == 0) {
            return Character.valueOf(c11);
        }
        R invoke = selector.invoke(Character.valueOf(c11));
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                R invoke2 = selector.invoke(Character.valueOf(c12));
                if (invoke.compareTo(invoke2) < 0) {
                    c11 = c12;
                    invoke = invoke2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double qk(byte[] bArr, x00.l<? super Byte, Double> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Byte.valueOf(bArr[i11])).doubleValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static int ql(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                if (i11 < i13) {
                    i11 = i13;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float qm(float[] fArr, x00.l<? super Float, Float> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Float.valueOf(fArr[i11])).floatValue());
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R qn(char[] cArr, Comparator<? super R> comparator, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                Object obj2 = (R) selector.invoke(Character.valueOf(cArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean qo(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (double d11 : dArr) {
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final <T> T qp(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return (T) rp(tArr, Random.Default);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Byte qq(@m80.k byte[] bArr, @m80.k x00.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                b11 = operation.invoke(Byte.valueOf(b11), Byte.valueOf(bArr[i11])).byteValue();
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    @yz.y0(version = "1.4")
    public static final void qr(@m80.k float[] fArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        a00.d.Companion.d(i11, i12, fArr.length);
        int i13 = (i11 + i12) / 2;
        if (i11 == i13) {
            return;
        }
        int i14 = i12 - 1;
        while (i11 < i13) {
            float f11 = fArr[i11];
            fArr[i11] = fArr[i14];
            fArr[i14] = f11;
            i14--;
            i11++;
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Long> qs(long[] jArr, x00.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            return h0.J();
        }
        long j11 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j11));
        int length = jArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            j11 = operation.invoke(Long.valueOf(j11), Long.valueOf(jArr[i11])).longValue();
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    public static char qt(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @m80.k
    public static byte[] qu(@m80.k byte[] bArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? new byte[0] : a00.q.f1(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @m80.k
    public static final byte[] qv(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        Ku(copyOf);
        return copyOf;
    }

    @m80.k
    public static final Set<Boolean> qw(@m80.k boolean[] zArr, @m80.k Iterable<Boolean> other) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Boolean> yz2 = yz(zArr);
        m0.J0(yz2, other);
        return yz2;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final long qx(long[] jArr, x00.l<? super Long, Long> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += selector.invoke(Long.valueOf(j12)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Byte> qy(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b11 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b11));
        }
        return arrayList;
    }

    @m80.k
    public static final Set<Byte> qz(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return (Set) Cy(bArr, new LinkedHashSet(k1.j(bArr.length)));
    }

    public static final boolean r5(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (double d11 : dArr) {
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final <T, K> Map<K, T> r6(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(tArr.length), 16));
        for (T t11 : tArr) {
            linkedHashMap.put(keySelector.invoke(t11), t11);
        }
        return linkedHashMap;
    }

    public static final double r7(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (double d12 : dArr) {
            d11 += d12;
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @o00.f
    public static final long r8(long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr[4];
    }

    @m80.k
    public static final <K> List<Float> r9(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f11 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f11)))) {
                arrayList.add(Float.valueOf(f11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <R, V> List<V> rA(@m80.k char[] cArr, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super Character, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @o00.f
    public static final Byte ra(byte[] bArr, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return bf(bArr, i11);
    }

    @m80.k
    public static final <C extends Collection<? super Integer>> C rb(@m80.k int[] iArr, @m80.k C destination, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                destination.add(Integer.valueOf(i11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Boolean rc(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C rd(@m80.k float[] fArr, @m80.k C destination, @m80.k x00.l<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (float f11 : fArr) {
            m0.s0(destination, transform.invoke(Float.valueOf(f11)));
        }
        return destination;
    }

    public static final void re(@m80.k char[] cArr, @m80.k x00.p<? super Integer, ? super Character, g2> action) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = cArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Character.valueOf(cArr[i11]));
            i11++;
            i12++;
        }
    }

    @m80.k
    public static final <K, V> Map<K, List<V>> rf(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends K> keySelector, @m80.k x00.l<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f11 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Float.valueOf(f11)));
        }
        return linkedHashMap;
    }

    public static final int rg(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final String rh(@m80.k double[] dArr, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) Zg(dArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.l
    public static final Float ri(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            float f11 = fArr[length];
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                return Float.valueOf(f11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Double rj(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        if (Ke == 0) {
            return Double.valueOf(d11);
        }
        R invoke = selector.invoke(Double.valueOf(d11));
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                double d12 = dArr[i11];
                R invoke2 = selector.invoke(Double.valueOf(d12));
                if (invoke.compareTo(invoke2) < 0) {
                    d11 = d12;
                    invoke = invoke2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double rk(char[] cArr, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(cArr[i11])).doubleValue());
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final long rl(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                if (j11 < j12) {
                    j11 = j12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return j11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float rm(int[] iArr, x00.l<? super Integer, Float> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Integer.valueOf(iArr[i11])).floatValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R rn(double[] dArr, Comparator<? super R> comparator, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                Object obj2 = (R) selector.invoke(Double.valueOf(dArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean ro(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr.length == 0;
    }

    @yz.y0(version = "1.3")
    public static final <T> T rp(@m80.k T[] tArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (tArr.length != 0) {
            return tArr[random.nextInt(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Character rq(@m80.k char[] cArr, @m80.k x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                c11 = operation.invoke(Character.valueOf(c11), Character.valueOf(cArr[i11])).charValue();
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    public static void rr(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Me = Me(iArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            int i12 = iArr[i11];
            iArr[i11] = iArr[Me];
            iArr[Me] = i12;
            Me--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <S, T extends S> List<S> rs(@m80.k T[] tArr, @m80.k x00.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            return h0.J();
        }
        S s11 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s11);
        int length = tArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            s11 = operation.invoke(s11, (Object) tArr[i11]);
            arrayList.add(s11);
        }
        return arrayList;
    }

    public static final char rt(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Character ch2 = null;
        boolean z11 = false;
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                ch2 = Character.valueOf(c11);
                z11 = true;
            }
        }
        if (!z11) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.g0.n(ch2, "null cannot be cast to non-null type kotlin.Char");
        return ch2.charValue();
    }

    @m80.k
    public static byte[] ru(@m80.k byte[] bArr, @m80.k Collection<Integer> indices) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            bArr2[i11] = bArr[it.next().intValue()];
            i11++;
        }
        return bArr2;
    }

    @m80.k
    public static final char[] rv(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        Mu(copyOf);
        return copyOf;
    }

    public static final double rw(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        double d11 = 0.0d;
        for (double d12 : dArr) {
            d11 += d12;
        }
        return d11;
    }

    @w00.j(name = "sumOfLong")
    public static final long rx(@m80.k Long[] lArr) {
        kotlin.jvm.internal.g0.p(lArr, "<this>");
        long j11 = 0;
        for (Long l11 : lArr) {
            j11 += l11.longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Character> ry(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c11 : cArr) {
            if (!predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c11));
        }
        return arrayList;
    }

    @m80.k
    public static final Set<Character> rz(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return (Set) Dy(cArr, new LinkedHashSet(k1.j(g10.u.B(cArr.length, 128))));
    }

    public static final boolean s5(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @m80.k
    public static final <T, K, V> Map<K, V> s6(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(tArr.length), 16));
        for (T t11 : tArr) {
            linkedHashMap.put(keySelector.invoke(t11), valueTransform.invoke(t11));
        }
        return linkedHashMap;
    }

    public static final double s7(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (float f11 : fArr) {
            d11 += f11;
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @o00.f
    public static final <T> T s8(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr[4];
    }

    @m80.k
    public static final <K> List<Integer> s9(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i11)))) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final List<Pair<Character, Character>> sA(@m80.k char[] cArr, @m80.k char[] other) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(yz.h1.a(Character.valueOf(cArr[i11]), Character.valueOf(other[i11])));
        }
        return arrayList;
    }

    @o00.f
    public static final Character sa(char[] cArr, int i11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cf(cArr, i11);
    }

    @m80.k
    public static final <C extends Collection<? super Long>> C sb(@m80.k long[] jArr, @m80.k C destination, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (long j11 : jArr) {
            if (!predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                destination.add(Long.valueOf(j11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Boolean sc(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                return Boolean.valueOf(z11);
            }
        }
        return null;
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C sd(@m80.k int[] iArr, @m80.k C destination, @m80.k x00.l<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (int i11 : iArr) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i11)));
        }
        return destination;
    }

    public static final void se(@m80.k double[] dArr, @m80.k x00.p<? super Integer, ? super Double, g2> action) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Double.valueOf(dArr[i11]));
            i11++;
            i12++;
        }
    }

    @m80.k
    public static final <K> Map<K, List<Integer>> sf(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Integer.valueOf(i11));
        }
        return linkedHashMap;
    }

    public static final int sg(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final String sh(@m80.k float[] fArr, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) ah(fArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.l
    public static final Integer si(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Float sj(@m80.k float[] fArr, @m80.k x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        if (Le == 0) {
            return Float.valueOf(f11);
        }
        R invoke = selector.invoke(Float.valueOf(f11));
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                float f12 = fArr[i11];
                R invoke2 = selector.invoke(Float.valueOf(f12));
                if (invoke.compareTo(invoke2) < 0) {
                    f11 = f12;
                    invoke = invoke2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double sk(double[] dArr, x00.l<? super Double, Double> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Double.valueOf(dArr[i11])).doubleValue());
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    @m80.k
    public static final <T extends Comparable<? super T>> T sl(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                T t12 = tArr[i11];
                if (t11.compareTo(t12) < 0) {
                    t11 = t12;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return t11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float sm(long[] jArr, x00.l<? super Long, Float> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Long.valueOf(jArr[i11])).floatValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R sn(float[] fArr, Comparator<? super R> comparator, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                Object obj2 = (R) selector.invoke(Float.valueOf(fArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean so(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (float f11 : fArr) {
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final short sp(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return tp(sArr, Random.Default);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double sq(@m80.k double[] dArr, @m80.k x00.p<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                d11 = operation.invoke(Double.valueOf(d11), Double.valueOf(dArr[i11])).doubleValue();
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    @yz.y0(version = "1.4")
    public static void sr(@m80.k int[] iArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        a00.d.Companion.d(i11, i12, iArr.length);
        int i13 = (i11 + i12) / 2;
        if (i11 == i13) {
            return;
        }
        int i14 = i12 - 1;
        while (i11 < i13) {
            int i15 = iArr[i11];
            iArr[i11] = iArr[i14];
            iArr[i14] = i15;
            i14--;
            i11++;
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Short> ss(short[] sArr, x00.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            return h0.J();
        }
        short s11 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s11));
        int length = sArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            s11 = operation.invoke(Short.valueOf(s11), Short.valueOf(sArr[i11])).shortValue();
            arrayList.add(Short.valueOf(s11));
        }
        return arrayList;
    }

    public static final double st(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @m80.k
    public static final char[] su(@m80.k char[] cArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? new char[0] : a00.q.g1(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @m80.k
    public static final double[] sv(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        Ou(copyOf);
        return copyOf;
    }

    public static final float sw(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        float f11 = 0.0f;
        for (float f12 : fArr) {
            f11 += f12;
        }
        return f11;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> long sx(T[] tArr, x00.l<? super T, Long> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (T t11 : tArr) {
            j11 += selector.invoke(t11).longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Double> sy(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d11 : dArr) {
            if (!predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d11));
        }
        return arrayList;
    }

    @m80.k
    public static final Set<Double> sz(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return (Set) Ey(dArr, new LinkedHashSet(k1.j(dArr.length)));
    }

    public static final boolean t5(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (float f11 : fArr) {
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final <K> Map<K, Short> t6(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(sArr.length), 16));
        for (short s11 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s11)), Short.valueOf(s11));
        }
        return linkedHashMap;
    }

    public static final double t7(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (int i12 : iArr) {
            d11 += i12;
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @o00.f
    public static final short t8(short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr[4];
    }

    @m80.k
    public static final <K> List<Long> t9(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j11 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j11)))) {
                arrayList.add(Long.valueOf(j11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <V> List<V> tA(@m80.k char[] cArr, @m80.k char[] other, @m80.k x00.p<? super Character, ? super Character, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i11]), Character.valueOf(other[i11])));
        }
        return arrayList;
    }

    @o00.f
    public static final Double ta(double[] dArr, int i11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        return df(dArr, i11);
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C tb(@m80.k T[] tArr, @m80.k C destination, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : tArr) {
            if (!predicate.invoke(t11).booleanValue()) {
                destination.add(t11);
            }
        }
        return destination;
    }

    @m80.l
    public static final Byte tc(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C td(@m80.k long[] jArr, @m80.k C destination, @m80.k x00.l<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (long j11 : jArr) {
            m0.s0(destination, transform.invoke(Long.valueOf(j11)));
        }
        return destination;
    }

    public static final void te(@m80.k float[] fArr, @m80.k x00.p<? super Integer, ? super Float, g2> action) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = fArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Float.valueOf(fArr[i11]));
            i11++;
            i12++;
        }
    }

    @m80.k
    public static final <K, V> Map<K, List<V>> tf(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends K> keySelector, @m80.k x00.l<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Integer.valueOf(i11)));
        }
        return linkedHashMap;
    }

    public static final <T> int tg(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final String th(@m80.k int[] iArr, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) bh(iArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.l
    public static final Integer ti(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            int i12 = iArr[length];
            if (predicate.invoke(Integer.valueOf(i12)).booleanValue()) {
                return Integer.valueOf(i12);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Integer tj(@m80.k int[] iArr, @m80.k x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        if (Me == 0) {
            return Integer.valueOf(i11);
        }
        R invoke = selector.invoke(Integer.valueOf(i11));
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                R invoke2 = selector.invoke(Integer.valueOf(i13));
                if (invoke.compareTo(invoke2) < 0) {
                    i11 = i13;
                    invoke = invoke2;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double tk(float[] fArr, x00.l<? super Float, Double> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Float.valueOf(fArr[i11])).doubleValue());
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final short tl(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                if (s11 < s12) {
                    s11 = s12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> float tm(T[] tArr, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(tArr[i11]).floatValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R tn(int[] iArr, Comparator<? super R> comparator, x00.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                Object obj2 = (R) selector.invoke(Integer.valueOf(iArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean to(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return iArr.length == 0;
    }

    @yz.y0(version = "1.3")
    public static final short tp(@m80.k short[] sArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (sArr.length != 0) {
            return sArr[random.nextInt(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Float tq(@m80.k float[] fArr, @m80.k x00.p<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                f11 = operation.invoke(Float.valueOf(f11), Float.valueOf(fArr[i11])).floatValue();
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    public static void tr(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Ne = Ne(jArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            jArr[i11] = jArr[Ne];
            jArr[Ne] = j11;
            Ne--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Boolean> ts(boolean[] zArr, x00.p<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (zArr.length == 0) {
            return h0.J();
        }
        boolean z11 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z11));
        int length = zArr.length;
        int i11 = 1;
        while (i11 < length) {
            Boolean invoke = operation.invoke(Boolean.valueOf(z11), Boolean.valueOf(zArr[i11]));
            boolean booleanValue = invoke.booleanValue();
            arrayList.add(invoke);
            i11++;
            z11 = booleanValue;
        }
        return arrayList;
    }

    public static final double tt(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Double d11 = null;
        boolean z11 = false;
        for (double d12 : dArr) {
            if (predicate.invoke(Double.valueOf(d12)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                d11 = Double.valueOf(d12);
                z11 = true;
            }
        }
        if (!z11) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.g0.n(d11, "null cannot be cast to non-null type kotlin.Double");
        return d11.doubleValue();
    }

    @m80.k
    public static final char[] tu(@m80.k char[] cArr, @m80.k Collection<Integer> indices) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            cArr2[i11] = cArr[it.next().intValue()];
            i11++;
        }
        return cArr2;
    }

    @m80.k
    public static final float[] tv(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        Qu(copyOf);
        return copyOf;
    }

    public static final int tw(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int i11 = 0;
        for (byte b11 : bArr) {
            i11 += b11;
        }
        return i11;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final long tx(short[] sArr, x00.l<? super Short, Long> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (short s11 : sArr) {
            j11 += selector.invoke(Short.valueOf(s11)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Float> ty(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f11 : fArr) {
            if (!predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    @m80.k
    public static final Set<Float> tz(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return (Set) Fy(fArr, new LinkedHashSet(k1.j(fArr.length)));
    }

    public static boolean u5(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @m80.k
    public static final <K, V> Map<K, V> u6(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends K> keySelector, @m80.k x00.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(sArr.length), 16));
        for (short s11 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s11)), valueTransform.invoke(Short.valueOf(s11)));
        }
        return linkedHashMap;
    }

    public static final double u7(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (long j11 : jArr) {
            d11 += j11;
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @o00.f
    public static final boolean u8(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr[4];
    }

    @m80.k
    public static final <T, K> List<T> u9(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t11 : tArr) {
            if (hashSet.add(selector.invoke(t11))) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <R> List<Pair<Character, R>> uA(@m80.k char[] cArr, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            char c11 = cArr[i11];
            arrayList.add(yz.h1.a(Character.valueOf(c11), other[i11]));
        }
        return arrayList;
    }

    @o00.f
    public static final Float ua(float[] fArr, int i11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return ef(fArr, i11);
    }

    @m80.k
    public static final <C extends Collection<? super Short>> C ub(@m80.k short[] sArr, @m80.k C destination, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (short s11 : sArr) {
            if (!predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                destination.add(Short.valueOf(s11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Byte uc(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (byte b11 : bArr) {
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                return Byte.valueOf(b11);
            }
        }
        return null;
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C ud(@m80.k T[] tArr, @m80.k C destination, @m80.k x00.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (T t11 : tArr) {
            m0.s0(destination, transform.invoke(t11));
        }
        return destination;
    }

    public static final void ue(@m80.k int[] iArr, @m80.k x00.p<? super Integer, ? super Integer, g2> action) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i11]));
            i11++;
            i12++;
        }
    }

    @m80.k
    public static final <K> Map<K, List<Long>> uf(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j11 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Long.valueOf(j11));
        }
        return linkedHashMap;
    }

    public static final int ug(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final String uh(@m80.k long[] jArr, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) ch(jArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.l
    public static final Long ui(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Long uj(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        if (Ne == 0) {
            return Long.valueOf(j11);
        }
        R invoke = selector.invoke(Long.valueOf(j11));
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long j12 = jArr[i11];
                R invoke2 = selector.invoke(Long.valueOf(j12));
                if (invoke.compareTo(invoke2) < 0) {
                    j11 = j12;
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double uk(int[] iArr, x00.l<? super Integer, Double> selector) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int Me = Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Integer.valueOf(iArr[i11])).doubleValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Boolean ul(@m80.k boolean[] zArr, @m80.k Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z11 = zArr[0];
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                boolean z12 = zArr[i11];
                if (comparator.compare(Boolean.valueOf(z11), Boolean.valueOf(z12)) < 0) {
                    z11 = z12;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float um(short[] sArr, x00.l<? super Short, Float> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Short.valueOf(sArr[i11])).floatValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R un(long[] jArr, Comparator<? super R> comparator, x00.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                Object obj2 = (R) selector.invoke(Long.valueOf(jArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean uo(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final boolean up(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return vp(zArr, Random.Default);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Integer uq(@m80.k int[] iArr, @m80.k x00.p<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                i11 = operation.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i12])).intValue();
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    @yz.y0(version = "1.4")
    public static void ur(@m80.k long[] jArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        a00.d.Companion.d(i11, i12, jArr.length);
        int i13 = (i11 + i12) / 2;
        if (i11 == i13) {
            return;
        }
        int i14 = i12 - 1;
        while (i11 < i13) {
            long j11 = jArr[i11];
            jArr[i11] = jArr[i14];
            jArr[i14] = j11;
            i14--;
            i11++;
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Byte> us(byte[] bArr, x00.q<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (bArr.length == 0) {
            return h0.J();
        }
        byte b11 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b11));
        int length = bArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            b11 = operation.invoke(Integer.valueOf(i11), Byte.valueOf(b11), Byte.valueOf(bArr[i11])).byteValue();
            arrayList.add(Byte.valueOf(b11));
        }
        return arrayList;
    }

    public static final float ut(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @m80.k
    public static final double[] uu(@m80.k double[] dArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? new double[0] : a00.q.h1(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @m80.k
    public static final int[] uv(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        Su(copyOf);
        return copyOf;
    }

    public static int uw(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        return i11;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final long ux(boolean[] zArr, x00.l<? super Boolean, Long> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (boolean z11 : zArr) {
            j11 += selector.invoke(Boolean.valueOf(z11)).longValue();
        }
        return j11;
    }

    @m80.k
    public static final List<Integer> uy(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    @m80.k
    public static final Set<Integer> uz(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return (Set) Gy(iArr, new LinkedHashSet(k1.j(iArr.length)));
    }

    public static final boolean v5(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final <K> Map<K, Boolean> v6(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(zArr.length), 16));
        for (boolean z11 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z11)), Boolean.valueOf(z11));
        }
        return linkedHashMap;
    }

    public static final double v7(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (short s11 : sArr) {
            d11 += s11;
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    public static boolean v8(@m80.k byte[] bArr, byte b11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return Vf(bArr, b11) >= 0;
    }

    @m80.k
    public static final <K> List<Short> v9(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s11 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s11)))) {
                arrayList.add(Short.valueOf(s11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <R, V> List<V> vA(@m80.k char[] cArr, @m80.k R[] other, @m80.k x00.p<? super Character, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i11]), other[i11]));
        }
        return arrayList;
    }

    @o00.f
    public static final Integer va(int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return ff(iArr, i11);
    }

    @m80.k
    public static final <C extends Collection<? super Boolean>> C vb(@m80.k boolean[] zArr, @m80.k C destination, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (boolean z11 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                destination.add(Boolean.valueOf(z11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Character vc(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C vd(@m80.k short[] sArr, @m80.k C destination, @m80.k x00.l<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (short s11 : sArr) {
            m0.s0(destination, transform.invoke(Short.valueOf(s11)));
        }
        return destination;
    }

    public static final void ve(@m80.k long[] jArr, @m80.k x00.p<? super Integer, ? super Long, g2> action) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = jArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Long.valueOf(jArr[i11]));
            i11++;
            i12++;
        }
    }

    @m80.k
    public static final <K, V> Map<K, List<V>> vf(@m80.k long[] jArr, @m80.k x00.l<? super Long, ? extends K> keySelector, @m80.k x00.l<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j11 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Long.valueOf(j11)));
        }
        return linkedHashMap;
    }

    public static final int vg(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @m80.k
    public static final <T> String vh(@m80.k T[] tArr, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) dh(tArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.l
    public static final Long vi(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            long j11 = jArr[length];
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                return Long.valueOf(j11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T vj(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t11 = tArr[0];
        int Oe = Oe(tArr);
        if (Oe != 0) {
            R invoke = selector.invoke(t11);
            int i11 = 1;
            if (1 <= Oe) {
                while (true) {
                    T t12 = tArr[i11];
                    R invoke2 = selector.invoke(t12);
                    if (invoke.compareTo(invoke2) < 0) {
                        t11 = t12;
                        invoke = invoke2;
                    }
                    if (i11 == Oe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return t11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double vk(long[] jArr, x00.l<? super Long, Double> selector) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Long.valueOf(jArr[i11])).doubleValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Byte vl(@m80.k byte[] bArr, @m80.k Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                if (comparator.compare(Byte.valueOf(b11), Byte.valueOf(b12)) < 0) {
                    b11 = b12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float vm(boolean[] zArr, x00.l<? super Boolean, Float> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Boolean.valueOf(zArr[i11])).floatValue());
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R vn(T[] tArr, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(tArr[0]);
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                Object obj2 = (R) selector.invoke(tArr[i11]);
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean vo(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return jArr.length == 0;
    }

    @yz.y0(version = "1.3")
    public static final boolean vp(@m80.k boolean[] zArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (zArr.length != 0) {
            return zArr[random.nextInt(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Long vq(@m80.k long[] jArr, @m80.k x00.p<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j11 = jArr[0];
        int Ne = Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                j11 = operation.invoke(Long.valueOf(j11), Long.valueOf(jArr[i11])).longValue();
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j11);
    }

    public static final <T> void vr(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Oe = Oe(tArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            T t11 = tArr[i11];
            tArr[i11] = tArr[Oe];
            tArr[Oe] = t11;
            Oe--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Character> vs(char[] cArr, x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (cArr.length == 0) {
            return h0.J();
        }
        char c11 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c11));
        int length = cArr.length;
        int i11 = 1;
        while (i11 < length) {
            Character invoke = operation.invoke(Integer.valueOf(i11), Character.valueOf(c11), Character.valueOf(cArr[i11]));
            char charValue = invoke.charValue();
            arrayList.add(invoke);
            i11++;
            c11 = charValue;
        }
        return arrayList;
    }

    public static final float vt(@m80.k float[] fArr, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Float f11 = null;
        boolean z11 = false;
        for (float f12 : fArr) {
            if (predicate.invoke(Float.valueOf(f12)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                f11 = Float.valueOf(f12);
                z11 = true;
            }
        }
        if (!z11) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.g0.n(f11, "null cannot be cast to non-null type kotlin.Float");
        return f11.floatValue();
    }

    @m80.k
    public static final double[] vu(@m80.k double[] dArr, @m80.k Collection<Integer> indices) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            dArr2[i11] = dArr[it.next().intValue()];
            i11++;
        }
        return dArr2;
    }

    @m80.k
    public static final long[] vv(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        Uu(copyOf);
        return copyOf;
    }

    public static final int vw(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        int i11 = 0;
        for (short s11 : sArr) {
            i11 += s11;
        }
        return i11;
    }

    @w00.j(name = "sumOfShort")
    public static final int vx(@m80.k Short[] shArr) {
        kotlin.jvm.internal.g0.p(shArr, "<this>");
        int i11 = 0;
        for (Short sh2 : shArr) {
            i11 += sh2.shortValue();
        }
        return i11;
    }

    @m80.k
    public static final List<Long> vy(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j11 : jArr) {
            if (!predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    @m80.k
    public static final Set<Long> vz(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return (Set) Hy(jArr, new LinkedHashSet(k1.j(jArr.length)));
    }

    public static boolean w5(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @m80.k
    public static final <K, V> Map<K, V> w6(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends K> keySelector, @m80.k x00.l<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(zArr.length), 16));
        for (boolean z11 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z11)), valueTransform.invoke(Boolean.valueOf(z11)));
        }
        return linkedHashMap;
    }

    @w00.j(name = "averageOfByte")
    public static final double w7(@m80.k Byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (Byte b11 : bArr) {
            d11 += b11.byteValue();
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    public static boolean w8(@m80.k char[] cArr, char c11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return Wf(cArr, c11) >= 0;
    }

    @m80.k
    public static final <K> List<Boolean> w9(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z11 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z11)))) {
                arrayList.add(Boolean.valueOf(z11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <R> List<Pair<Double, R>> wA(@m80.k double[] dArr, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(Double.valueOf(dArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @o00.f
    public static final Long wa(long[] jArr, int i11) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        return gf(jArr, i11);
    }

    @m80.k
    public static final <C extends Collection<? super Byte>> C wb(@m80.k byte[] bArr, @m80.k C destination, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (byte b11 : bArr) {
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                destination.add(Byte.valueOf(b11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Character wc(@m80.k char[] cArr, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                return Character.valueOf(c11);
            }
        }
        return null;
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C wd(@m80.k boolean[] zArr, @m80.k C destination, @m80.k x00.l<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (boolean z11 : zArr) {
            m0.s0(destination, transform.invoke(Boolean.valueOf(z11)));
        }
        return destination;
    }

    public static final <T> void we(@m80.k T[] tArr, @m80.k x00.p<? super Integer, ? super T, g2> action) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = tArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), tArr[i11]);
            i11++;
            i12++;
        }
    }

    @m80.k
    public static final <T, K> Map<K, List<T>> wf(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t11 : tArr) {
            K invoke = keySelector.invoke(t11);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(t11);
        }
        return linkedHashMap;
    }

    @m80.k
    public static final Set<Byte> wg(@m80.k byte[] bArr, @m80.k Iterable<Byte> other) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Byte> qz2 = qz(bArr);
        m0.T0(qz2, other);
        return qz2;
    }

    @m80.k
    public static final String wh(@m80.k short[] sArr, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) eh(sArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.l
    public static <T> T wi(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Short wj(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        if (Pe == 0) {
            return Short.valueOf(s11);
        }
        R invoke = selector.invoke(Short.valueOf(s11));
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short s12 = sArr[i11];
                R invoke2 = selector.invoke(Short.valueOf(s12));
                if (invoke.compareTo(invoke2) < 0) {
                    s11 = s12;
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Double wk(T[] tArr, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(tArr[i11]).doubleValue());
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Character wl(@m80.k char[] cArr, @m80.k Comparator<? super Character> comparator) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                if (comparator.compare(Character.valueOf(c11), Character.valueOf(c12)) < 0) {
                    c11 = c12;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R wm(byte[] bArr, x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                R invoke2 = selector.invoke(Byte.valueOf(bArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R wn(short[] sArr, Comparator<? super R> comparator, x00.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                Object obj2 = (R) selector.invoke(Short.valueOf(sArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final boolean wo(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final Boolean wp(boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return xp(zArr, Random.Default);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <S, T extends S> S wq(@m80.k T[] tArr, @m80.k x00.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s11 = (Object) tArr[0];
        int Oe = Oe(tArr);
        int i11 = 1;
        if (1 <= Oe) {
            while (true) {
                s11 = operation.invoke(s11, (Object) tArr[i11]);
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    @yz.y0(version = "1.4")
    public static final <T> void wr(@m80.k T[] tArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        a00.d.Companion.d(i11, i12, tArr.length);
        int i13 = (i11 + i12) / 2;
        if (i11 == i13) {
            return;
        }
        int i14 = i12 - 1;
        while (i11 < i13) {
            T t11 = tArr[i11];
            tArr[i11] = tArr[i14];
            tArr[i14] = t11;
            i14--;
            i11++;
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Double> ws(double[] dArr, x00.q<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (dArr.length == 0) {
            return h0.J();
        }
        double d11 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d11));
        int length = dArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            d11 = operation.invoke(Integer.valueOf(i11), Double.valueOf(d11), Double.valueOf(dArr[i11])).doubleValue();
            arrayList.add(Double.valueOf(d11));
        }
        return arrayList;
    }

    public static int wt(@m80.k int[] iArr) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @m80.k
    public static final float[] wu(@m80.k float[] fArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? new float[0] : a00.q.i1(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @m80.k
    public static final <T extends Comparable<? super T>> T[] wv(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        a00.q.h4(tArr2, e00.g.x());
        return tArr2;
    }

    public static long ww(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        return j11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final int wx(byte[] bArr, x00.l<? super Byte, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        for (byte b11 : bArr) {
            i11 = yz.s1.i(i11 + selector.invoke(Byte.valueOf(b11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final <T> List<T> wy(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t11 : tArr) {
            if (!predicate.invoke(t11).booleanValue()) {
                break;
            }
            arrayList.add(t11);
        }
        return arrayList;
    }

    @m80.k
    public static final <T> Set<T> wz(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return (Set) Iy(tArr, new LinkedHashSet(k1.j(tArr.length)));
    }

    public static final boolean x5(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final <K, M extends Map<? super K, ? super Byte>> M x6(@m80.k byte[] bArr, @m80.k M destination, @m80.k x00.l<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (byte b11 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b11)), Byte.valueOf(b11));
        }
        return destination;
    }

    @w00.j(name = "averageOfDouble")
    public static final double x7(@m80.k Double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (Double d12 : dArr) {
            d11 += d12.doubleValue();
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @yz.n(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @yz.w0(expression = "any { it == element }", imports = {}))
    @yz.o(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean x8(double[] dArr, double d11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        for (double d12 : dArr) {
            if (d12 == d11) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final List<Byte> x9(@m80.k byte[] bArr, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (i11 >= 0) {
            return Xx(bArr, g10.u.u(bArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R, V> List<V> xA(@m80.k double[] dArr, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super Double, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i11]), r11));
            i11++;
        }
        return arrayList;
    }

    @o00.f
    public static final <T> T xa(T[] tArr, int i11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return (T) hf(tArr, i11);
    }

    @m80.k
    public static final <C extends Collection<? super Character>> C xb(@m80.k char[] cArr, @m80.k C destination, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (char c11 : cArr) {
            if (predicate.invoke(Character.valueOf(c11)).booleanValue()) {
                destination.add(Character.valueOf(c11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Double xc(@m80.k double[] dArr) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    public static final <R> R xd(@m80.k byte[] bArr, R r11, @m80.k x00.p<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (byte b11 : bArr) {
            r11 = operation.invoke(r11, Byte.valueOf(b11));
        }
        return r11;
    }

    public static final void xe(@m80.k short[] sArr, @m80.k x00.p<? super Integer, ? super Short, g2> action) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = sArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Short.valueOf(sArr[i11]));
            i11++;
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T, K, V> Map<K, List<V>> xf(@m80.k T[] tArr, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (d dVar : tArr) {
            K invoke = keySelector.invoke(dVar);
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(dVar));
        }
        return linkedHashMap;
    }

    @m80.k
    public static final Set<Character> xg(@m80.k char[] cArr, @m80.k Iterable<Character> other) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Character> rz2 = rz(cArr);
        m0.T0(rz2, other);
        return rz2;
    }

    @m80.k
    public static final String xh(@m80.k boolean[] zArr, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super Boolean, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) fh(zArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.l
    public static final <T> T xi(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            T t11 = tArr[length];
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> byte xj(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        if (Ie != 0) {
            R invoke = selector.invoke(Byte.valueOf(b11));
            int i11 = 1;
            if (1 <= Ie) {
                while (true) {
                    byte b12 = bArr[i11];
                    R invoke2 = selector.invoke(Byte.valueOf(b12));
                    if (invoke.compareTo(invoke2) < 0) {
                        b11 = b12;
                        invoke = invoke2;
                    }
                    if (i11 == Ie) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return b11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double xk(short[] sArr, x00.l<? super Short, Double> selector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Short.valueOf(sArr[i11])).doubleValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double xl(@m80.k double[] dArr, @m80.k Comparator<? super Double> comparator) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                double d12 = dArr[i11];
                if (comparator.compare(Double.valueOf(d11), Double.valueOf(d12)) < 0) {
                    d11 = d12;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(d11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R xm(char[] cArr, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                R invoke2 = selector.invoke(Character.valueOf(cArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R xn(boolean[] zArr, Comparator<? super R> comparator, x00.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                Object obj2 = (R) selector.invoke(Boolean.valueOf(zArr[i11]));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    public static final <T> boolean xo(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr.length == 0;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Boolean xp(@m80.k boolean[] zArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.nextInt(zArr.length)]);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Short xq(@m80.k short[] sArr, @m80.k x00.p<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s11 = sArr[0];
        int Pe = Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                s11 = operation.invoke(Short.valueOf(s11), Short.valueOf(sArr[i11])).shortValue();
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Short.valueOf(s11);
    }

    public static void xr(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Pe = Pe(sArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            short s11 = sArr[i11];
            sArr[i11] = sArr[Pe];
            sArr[Pe] = s11;
            Pe--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Float> xs(float[] fArr, x00.q<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (fArr.length == 0) {
            return h0.J();
        }
        float f11 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f11));
        int length = fArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            f11 = operation.invoke(Integer.valueOf(i11), Float.valueOf(f11), Float.valueOf(fArr[i11])).floatValue();
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    public static final int xt(@m80.k int[] iArr, @m80.k x00.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Integer num = null;
        boolean z11 = false;
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                num = Integer.valueOf(i11);
                z11 = true;
            }
        }
        if (!z11) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.g0.n(num, "null cannot be cast to non-null type kotlin.Int");
        return num.intValue();
    }

    @m80.k
    public static final float[] xu(@m80.k float[] fArr, @m80.k Collection<Integer> indices) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            fArr2[i11] = fArr[it.next().intValue()];
            i11++;
        }
        return fArr2;
    }

    @m80.k
    public static final short[] xv(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        Yu(copyOf);
        return copyOf;
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final int xw(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Integer> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (byte b11 : bArr) {
            i11 += selector.invoke(Byte.valueOf(b11)).intValue();
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final int xx(char[] cArr, x00.l<? super Character, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        for (char c11 : cArr) {
            i11 = yz.s1.i(i11 + selector.invoke(Character.valueOf(c11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final List<Short> xy(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s11 : sArr) {
            if (!predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s11));
        }
        return arrayList;
    }

    @m80.k
    public static final Set<Short> xz(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return (Set) Jy(sArr, new LinkedHashSet(k1.j(sArr.length)));
    }

    public static final <T> boolean y5(@m80.k T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M y6(@m80.k byte[] bArr, @m80.k M destination, @m80.k x00.l<? super Byte, ? extends K> keySelector, @m80.k x00.l<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (byte b11 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b11)), valueTransform.invoke(Byte.valueOf(b11)));
        }
        return destination;
    }

    @w00.j(name = "averageOfFloat")
    public static final double y7(@m80.k Float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (Float f11 : fArr) {
            d11 += f11.floatValue();
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @yz.n(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @yz.w0(expression = "any { it == element }", imports = {}))
    @yz.o(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean y8(float[] fArr, float f11) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        for (float f12 : fArr) {
            if (f12 == f11) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final List<Character> y9(@m80.k char[] cArr, int i11) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (i11 >= 0) {
            return Yx(cArr, g10.u.u(cArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final List<Pair<Double, Double>> yA(@m80.k double[] dArr, @m80.k double[] other) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(yz.h1.a(Double.valueOf(dArr[i11]), Double.valueOf(other[i11])));
        }
        return arrayList;
    }

    @o00.f
    public static final Short ya(short[] sArr, int i11) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return jf(sArr, i11);
    }

    @m80.k
    public static final <C extends Collection<? super Double>> C yb(@m80.k double[] dArr, @m80.k C destination, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (double d11 : dArr) {
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                destination.add(Double.valueOf(d11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Double yc(@m80.k double[] dArr, @m80.k x00.l<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (double d11 : dArr) {
            if (predicate.invoke(Double.valueOf(d11)).booleanValue()) {
                return Double.valueOf(d11);
            }
        }
        return null;
    }

    public static final <R> R yd(@m80.k char[] cArr, R r11, @m80.k x00.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (char c11 : cArr) {
            r11 = operation.invoke(r11, Character.valueOf(c11));
        }
        return r11;
    }

    public static final void ye(@m80.k boolean[] zArr, @m80.k x00.p<? super Integer, ? super Boolean, g2> action) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int length = zArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            action.invoke(Integer.valueOf(i12), Boolean.valueOf(zArr[i11]));
            i11++;
            i12++;
        }
    }

    @m80.k
    public static final <K> Map<K, List<Short>> yf(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s11 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Short.valueOf(s11));
        }
        return linkedHashMap;
    }

    @m80.k
    public static final Set<Double> yg(@m80.k double[] dArr, @m80.k Iterable<Double> other) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Double> sz2 = sz(dArr);
        m0.T0(sz2, other);
        return sz2;
    }

    public static /* synthetic */ String yh(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return ph(bArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.l
    public static final Short yi(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> char yj(@m80.k char[] cArr, @m80.k x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        if (Je != 0) {
            R invoke = selector.invoke(Character.valueOf(c11));
            int i11 = 1;
            if (1 <= Je) {
                while (true) {
                    char c12 = cArr[i11];
                    R invoke2 = selector.invoke(Character.valueOf(c12));
                    if (invoke.compareTo(invoke2) < 0) {
                        c11 = c12;
                        invoke = invoke2;
                    }
                    if (i11 == Je) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return c11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double yk(boolean[] zArr, x00.l<? super Boolean, Double> selector) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int Qe = Qe(zArr);
        int i11 = 1;
        if (1 <= Qe) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Boolean.valueOf(zArr[i11])).doubleValue());
                if (i11 == Qe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Float yl(@m80.k float[] fArr, @m80.k Comparator<? super Float> comparator) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f11 = fArr[0];
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                float f12 = fArr[i11];
                if (comparator.compare(Float.valueOf(f11), Float.valueOf(f12)) < 0) {
                    f11 = f12;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R ym(double[] dArr, x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        int Ke = Ke(dArr);
        int i11 = 1;
        if (1 <= Ke) {
            while (true) {
                R invoke2 = selector.invoke(Double.valueOf(dArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ke) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Byte yn(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b11 = bArr[0];
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte b12 = bArr[i11];
                if (b11 > b12) {
                    b11 = b12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Byte.valueOf(b11);
    }

    public static final <T> boolean yo(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final Byte yp(byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return zp(bArr, Random.Default);
    }

    public static final byte yq(@m80.k byte[] bArr, @m80.k x00.p<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Ie = Ie(bArr);
        if (Ie < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b11 = bArr[Ie];
        for (int i11 = Ie - 1; i11 >= 0; i11--) {
            b11 = operation.invoke(Byte.valueOf(bArr[i11]), Byte.valueOf(b11)).byteValue();
        }
        return b11;
    }

    @yz.y0(version = "1.4")
    public static void yr(@m80.k short[] sArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        a00.d.Companion.d(i11, i12, sArr.length);
        int i13 = (i11 + i12) / 2;
        if (i11 == i13) {
            return;
        }
        int i14 = i12 - 1;
        while (i11 < i13) {
            short s11 = sArr[i11];
            sArr[i11] = sArr[i14];
            sArr[i14] = s11;
            i14--;
            i11++;
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Integer> ys(int[] iArr, x00.q<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (iArr.length == 0) {
            return h0.J();
        }
        int i11 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i11));
        int length = iArr.length;
        for (int i12 = 1; i12 < length; i12++) {
            i11 = operation.invoke(Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(iArr[i12])).intValue();
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public static long yt(@m80.k long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @m80.k
    public static int[] yu(@m80.k int[] iArr, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? new int[0] : a00.q.j1(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @m80.k
    public static final <T> T[] yv(@m80.k T[] tArr, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.g0.o(tArr2, "copyOf(...)");
        a00.q.h4(tArr2, comparator);
        return tArr2;
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final int yw(@m80.k char[] cArr, @m80.k x00.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (char c11 : cArr) {
            i11 += selector.invoke(Character.valueOf(c11)).intValue();
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final int yx(double[] dArr, x00.l<? super Double, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        for (double d11 : dArr) {
            i11 = yz.s1.i(i11 + selector.invoke(Double.valueOf(d11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final List<Boolean> yy(@m80.k boolean[] zArr, @m80.k x00.l<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z11 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z11));
        }
        return arrayList;
    }

    @m80.k
    public static final Set<Boolean> yz(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return (Set) Ky(zArr, new LinkedHashSet(k1.j(zArr.length)));
    }

    public static final <T> boolean z5(@m80.k T[] tArr, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final <K, M extends Map<? super K, ? super Character>> M z6(@m80.k char[] cArr, @m80.k M destination, @m80.k x00.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (char c11 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c11)), Character.valueOf(c11));
        }
        return destination;
    }

    @w00.j(name = "averageOfInt")
    public static final double z7(@m80.k Integer[] numArr) {
        kotlin.jvm.internal.g0.p(numArr, "<this>");
        double d11 = 0.0d;
        int i11 = 0;
        for (Integer num : numArr) {
            d11 += num.intValue();
            i11++;
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    public static boolean z8(@m80.k int[] iArr, int i11) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        return Zf(iArr, i11) >= 0;
    }

    @m80.k
    public static final List<Double> z9(@m80.k double[] dArr, int i11) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        if (i11 >= 0) {
            return Zx(dArr, g10.u.u(dArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <V> List<V> zA(@m80.k double[] dArr, @m80.k double[] other, @m80.k x00.p<? super Double, ? super Double, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i11]), Double.valueOf(other[i11])));
        }
        return arrayList;
    }

    @m80.k
    public static final List<Byte> za(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b11 : bArr) {
            if (predicate.invoke(Byte.valueOf(b11)).booleanValue()) {
                arrayList.add(Byte.valueOf(b11));
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <C extends Collection<? super Float>> C zb(@m80.k float[] fArr, @m80.k C destination, @m80.k x00.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (float f11 : fArr) {
            if (predicate.invoke(Float.valueOf(f11)).booleanValue()) {
                destination.add(Float.valueOf(f11));
            }
        }
        return destination;
    }

    @m80.l
    public static final Float zc(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final <R> R zd(@m80.k double[] dArr, R r11, @m80.k x00.p<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (double d11 : dArr) {
            r11 = operation.invoke(r11, Double.valueOf(d11));
        }
        return r11;
    }

    @m80.k
    public static g10.l ze(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return new g10.l(0, Ie(bArr));
    }

    @m80.k
    public static final <K, V> Map<K, List<V>> zf(@m80.k short[] sArr, @m80.k x00.l<? super Short, ? extends K> keySelector, @m80.k x00.l<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s11 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Short.valueOf(s11)));
        }
        return linkedHashMap;
    }

    @m80.k
    public static final Set<Float> zg(@m80.k float[] fArr, @m80.k Iterable<Float> other) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<Float> tz2 = tz(fArr);
        m0.T0(tz2, other);
        return tz2;
    }

    public static /* synthetic */ String zh(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return qh(cArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.l
    public static final Short zi(@m80.k short[] sArr, @m80.k x00.l<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            short s11 = sArr[length];
            if (predicate.invoke(Short.valueOf(s11)).booleanValue()) {
                return Short.valueOf(s11);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <R extends Comparable<? super R>> double zj(@m80.k double[] dArr, @m80.k x00.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d11 = dArr[0];
        int Ke = Ke(dArr);
        if (Ke != 0) {
            R invoke = selector.invoke(Double.valueOf(d11));
            int i11 = 1;
            if (1 <= Ke) {
                while (true) {
                    double d12 = dArr[i11];
                    R invoke2 = selector.invoke(Double.valueOf(d12));
                    if (invoke.compareTo(invoke2) < 0) {
                        d11 = d12;
                        invoke = invoke2;
                    }
                    if (i11 == Ke) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return d11;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float zk(byte[] bArr, x00.l<? super Byte, Float> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int Ie = Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Byte.valueOf(bArr[i11])).floatValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Integer zl(@m80.k int[] iArr, @m80.k Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int Me = Me(iArr);
        int i12 = 1;
        if (1 <= Me) {
            while (true) {
                int i13 = iArr[i12];
                if (comparator.compare(Integer.valueOf(i11), Integer.valueOf(i13)) < 0) {
                    i11 = i13;
                }
                if (i12 == Me) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R zm(float[] fArr, x00.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        int Le = Le(fArr);
        int i11 = 1;
        if (1 <= Le) {
            while (true) {
                R invoke2 = selector.invoke(Float.valueOf(fArr[i11]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Le) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Character zn(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c11 = cArr[0];
        int Je = Je(cArr);
        int i11 = 1;
        if (1 <= Je) {
            while (true) {
                char c12 = cArr[i11];
                if (kotlin.jvm.internal.g0.t(c11, c12) > 0) {
                    c11 = c12;
                }
                if (i11 == Je) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(c11);
    }

    public static final boolean zo(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr.length == 0;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Byte zp(@m80.k byte[] bArr, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.nextInt(bArr.length)]);
    }

    public static final char zq(@m80.k char[] cArr, @m80.k x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int Je = Je(cArr);
        if (Je < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c11 = cArr[Je];
        for (int i11 = Je - 1; i11 >= 0; i11--) {
            c11 = operation.invoke(Character.valueOf(cArr[i11]), Character.valueOf(c11)).charValue();
        }
        return c11;
    }

    public static final void zr(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Qe = Qe(zArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            boolean z11 = zArr[i11];
            zArr[i11] = zArr[Qe];
            zArr[Qe] = z11;
            Qe--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final List<Long> zs(long[] jArr, x00.q<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (jArr.length == 0) {
            return h0.J();
        }
        long j11 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j11));
        int length = jArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            j11 = operation.invoke(Integer.valueOf(i11), Long.valueOf(j11), Long.valueOf(jArr[i11])).longValue();
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    public static final long zt(@m80.k long[] jArr, @m80.k x00.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(jArr, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Long l11 = null;
        boolean z11 = false;
        for (long j11 : jArr) {
            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                l11 = Long.valueOf(j11);
                z11 = true;
            }
        }
        if (!z11) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.g0.n(l11, "null cannot be cast to non-null type kotlin.Long");
        return l11.longValue();
    }

    @m80.k
    public static int[] zu(@m80.k int[] iArr, @m80.k Collection<Integer> indices) {
        kotlin.jvm.internal.g0.p(iArr, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr2[i11] = iArr[it.next().intValue()];
            i11++;
        }
        return iArr2;
    }

    @m80.k
    public static final <R extends Comparable<? super R>> List<Byte> zv(@m80.k byte[] bArr, @m80.k x00.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return Zv(bArr, new g.a(selector));
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final int zw(@m80.k double[] dArr, @m80.k x00.l<? super Double, Integer> selector) {
        kotlin.jvm.internal.g0.p(dArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (double d11 : dArr) {
            i11 += selector.invoke(Double.valueOf(d11)).intValue();
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final int zx(float[] fArr, x00.l<? super Float, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        for (float f11 : fArr) {
            i11 = yz.s1.i(i11 + selector.invoke(Float.valueOf(f11)).m0());
        }
        return i11;
    }

    @m80.k
    public static final boolean[] zy(@m80.k Boolean[] boolArr) {
        kotlin.jvm.internal.g0.p(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zArr[i11] = boolArr[i11].booleanValue();
        }
        return zArr;
    }

    @m80.k
    public static final Set<Byte> zz(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? (Set) Cy(bArr, new LinkedHashSet(k1.j(bArr.length))) : v1.f(Byte.valueOf(bArr[0])) : w1.k();
    }
}
