package d5;

import com.heytap.mcssdk.constant.IntentConstant;
import com.igexin.assist.sdk.AssistPushConsts;
import h50.d;
import j50.d3;
import j50.l1;
import j50.z0;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGameProtocolProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameProtocolProcess.kt\ncom/baicizhan/app/biz/game/impl/unity/proto/ReqMsgSerializer\n+ 2 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,112:1\n156#2:113\n156#2:114\n156#2:115\n156#2:116\n*S KotlinDebug\n*F\n+ 1 GameProtocolProcess.kt\ncom/baicizhan/app/biz/game/impl/unity/proto/ReqMsgSerializer\n*L\n56#1:113\n57#1:114\n58#1:115\n60#1:116\n*E\n"})
/* loaded from: classes3.dex */
public final class l implements f50.i<j> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final l f47259a = new l();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f47260b = h50.l.e("ReqMsg", new h50.f[0], new x00.l() { // from class: d5.k
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 h11;
            h11 = l.h((h50.a) obj);
            return h11;
        }
    });

    public static final g2 h(h50.a buildClassSerialDescriptor) {
        g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        d3 d3Var = d3.f63348a;
        h50.a.b(buildClassSerialDescriptor, "mid", d3Var.a(), null, false, 12, null);
        h50.a.b(buildClassSerialDescriptor, "type", z0.f63517a.a(), null, false, 12, null);
        h50.a.b(buildClassSerialDescriptor, IntentConstant.COMMAND, d3Var.a(), null, false, 12, null);
        h50.a.b(buildClassSerialDescriptor, AssistPushConsts.MSG_TYPE_PAYLOAD, h50.l.i(AssistPushConsts.MSG_TYPE_PAYLOAD, d.b.f58510a, new h50.f[0], null, 8, null), null, false, 12, null);
        h50.a.b(buildClassSerialDescriptor, com.alipay.sdk.m.t.a.f11034k, l1.f63406a.a(), null, false, 12, null);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f47260b;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    @Override // f50.e
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d5.j e(@m80.k i50.f r11) {
        /*
            r10 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.g0.p(r11, r0)
            boolean r0 = r11 instanceof k50.i
            r1 = 0
            if (r0 == 0) goto Ld
            k50.i r11 = (k50.i) r11
            goto Le
        Ld:
            r11 = r1
        Le:
            if (r11 == 0) goto Ld0
            k50.k r0 = r11.i()
            k50.i0 r0 = k50.o.x(r0)
            java.lang.String r2 = "mid"
            java.lang.Object r2 = r0.get(r2)
            k50.k r2 = (k50.k) r2
            if (r2 == 0) goto L2e
            k50.l0 r2 = k50.o.y(r2)
            if (r2 == 0) goto L2e
            java.lang.String r2 = r2.b()
            r4 = r2
            goto L2f
        L2e:
            r4 = r1
        L2f:
            kotlin.jvm.internal.g0.m(r4)
            java.lang.String r2 = "type"
            java.lang.Object r2 = r0.get(r2)
            k50.k r2 = (k50.k) r2
            if (r2 == 0) goto L4b
            k50.l0 r2 = k50.o.y(r2)
            if (r2 == 0) goto L4b
            int r2 = k50.o.t(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L4c
        L4b:
            r2 = r1
        L4c:
            kotlin.jvm.internal.g0.m(r2)
            int r5 = r2.intValue()
            java.lang.String r2 = "command"
            java.lang.Object r2 = r0.get(r2)
            k50.k r2 = (k50.k) r2
            if (r2 == 0) goto L69
            k50.l0 r2 = k50.o.y(r2)
            if (r2 == 0) goto L69
            java.lang.String r2 = r2.b()
            r6 = r2
            goto L6a
        L69:
            r6 = r1
        L6a:
            kotlin.jvm.internal.g0.m(r6)
            java.lang.String r2 = "timestamp"
            java.lang.Object r2 = r0.get(r2)
            k50.k r2 = (k50.k) r2
            if (r2 == 0) goto L85
            k50.l0 r2 = k50.o.y(r2)
            if (r2 == 0) goto L85
            long r1 = k50.o.A(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L85:
            kotlin.jvm.internal.g0.m(r1)
            long r8 = r1.longValue()
            java.lang.String r1 = "payload"
            java.lang.Object r0 = r0.get(r1)
            k50.k r0 = (k50.k) r0
            d5.h r1 = new d5.h
            r1.<init>(r6)
            kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto Lad
            k50.a r11 = r11.a()     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r11 = r11.e(r1, r0)     // Catch: java.lang.Throwable -> Laa
            b5.x0 r11 = (b5.x0) r11     // Catch: java.lang.Throwable -> Laa
            if (r11 != 0) goto Laf
            goto Lad
        Laa:
            r0 = move-exception
            r11 = r0
            goto Lb4
        Lad:
            b5.b1 r11 = b5.b1.INSTANCE     // Catch: java.lang.Throwable -> Laa
        Laf:
            java.lang.Object r11 = kotlin.Result.m6308constructorimpl(r11)     // Catch: java.lang.Throwable -> Laa
            goto Lbe
        Lb4:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r11 = kotlin.e.a(r11)
            java.lang.Object r11 = kotlin.Result.m6308constructorimpl(r11)
        Lbe:
            java.lang.Throwable r0 = kotlin.Result.m6311exceptionOrNullimpl(r11)
            if (r0 != 0) goto Lc5
            goto Lc7
        Lc5:
            b5.z0 r11 = b5.z0.INSTANCE
        Lc7:
            r7 = r11
            b5.x0 r7 = (b5.x0) r7
            d5.j r3 = new d5.j
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        Ld0:
            kotlinx.serialization.SerializationException r11 = new kotlinx.serialization.SerializationException
            java.lang.String r0 = "Expected JSON decoder"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.e(i50.f):d5.j");
    }

    @Override // f50.b0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k j value) {
        g0.p(encoder, "encoder");
        g0.p(value, "value");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public static /* synthetic */ void j() {
    }
}
