package j4;

import c4.n;
import com.baicizhan.app.api.service.BizException;
import com.baicizhan.app.biz.base.BizInternalException;
import com.baicizhan.app.net.exception.NetworkException;
import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import com.xiaomi.mipush.sdk.MiPushClient;
import k3.d1;
import k3.e1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import oa0.r;
import s3.c;
import w30.b;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {e1.class})
@u0({"SMAP\nPluginServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/PluginServiceImpl\n+ 2 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 3 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n1#1,23:1\n12#2,3:24\n15#2,10:39\n12#3,12:27\n*S KotlinDebug\n*F\n+ 1 PluginServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/PluginServiceImpl\n*L\n-1#1:24,3\n-1#1:39,10\n-1#1:27,12\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements e1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u5.b f63182b;

    public b(@k u5.b pluginRepo) {
        g0.p(pluginRepo, "pluginRepo");
        this.f63182b = pluginRepo;
    }

    @Override // k3.e1
    @s3.a
    public void A(@k d1 plugin) {
        g0.p(plugin, "plugin");
        b.C1273b c1273b = b.C1273b.f94770b;
        long epochMilliseconds = c1273b.a().toEpochMilliseconds();
        try {
            this.f63182b.A(plugin);
            g2 g2Var = g2.f100423a;
            if (n.h().k()) {
                z6.b.d(z6.b.f101032b, c.f87469a, '[' + MiPushClient.COMMAND_UNREGISTER + "] cost: " + (c1273b.a().toEpochMilliseconds() - epochMilliseconds), null, 4, null);
            }
        } catch (Throwable th2) {
            try {
                if (th2 instanceof BizException) {
                    throw new BizException(((BizException) th2).getMsg(), th2, ((BizException) th2).getCode() + 100000);
                }
                if (th2 instanceof BizInternalException) {
                    throw new BizException(((BizInternalException) th2).getMsg(), th2, ((BizInternalException) th2).getCode() + 100000);
                }
                if (th2 instanceof SystemException) {
                    throw new BizException(((SystemException) th2).message_, th2, ((SystemException) th2).code + 300000);
                }
                if (th2 instanceof LogicException) {
                    throw new BizException(((LogicException) th2).message_, th2, ((LogicException) th2).code + c.f87471c);
                }
                if (!(th2 instanceof NetworkException)) {
                }
            } finally {
            }
        }
    }

    @Override // k3.e1
    @s3.a
    public void x(@k d1 plugin) {
        g0.p(plugin, "plugin");
        b.C1273b c1273b = b.C1273b.f94770b;
        long epochMilliseconds = c1273b.a().toEpochMilliseconds();
        try {
            this.f63182b.x(plugin);
            g2 g2Var = g2.f100423a;
            if (n.h().k()) {
                z6.b.d(z6.b.f101032b, c.f87469a, '[' + MiPushClient.COMMAND_REGISTER + "] cost: " + (c1273b.a().toEpochMilliseconds() - epochMilliseconds), null, 4, null);
            }
        } catch (Throwable th2) {
            try {
                if (th2 instanceof BizException) {
                    throw new BizException(((BizException) th2).getMsg(), th2, ((BizException) th2).getCode() + 100000);
                }
                if (th2 instanceof BizInternalException) {
                    throw new BizException(((BizInternalException) th2).getMsg(), th2, ((BizInternalException) th2).getCode() + 100000);
                }
                if (th2 instanceof SystemException) {
                    throw new BizException(((SystemException) th2).message_, th2, ((SystemException) th2).code + 300000);
                }
                if (th2 instanceof LogicException) {
                    throw new BizException(((LogicException) th2).message_, th2, ((LogicException) th2).code + c.f87471c);
                }
                if (!(th2 instanceof NetworkException)) {
                }
            } finally {
            }
        }
    }
}
