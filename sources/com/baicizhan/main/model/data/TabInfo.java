package com.baicizhan.main.model.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.NoProguard;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import zg.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TabInfo implements NoProguard {
    public static final int $stable = 8;

    @k
    private final List<f> mall;
    private final int serverRecommend;

    @k
    private final List<f> taobao;

    public TabInfo(int i11, @k List<f> taobao, @k List<f> mall) {
        g0.p(taobao, "taobao");
        g0.p(mall, "mall");
        this.serverRecommend = i11;
        this.taobao = taobao;
        this.mall = mall;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabInfo copy$default(TabInfo tabInfo, int i11, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = tabInfo.serverRecommend;
        }
        if ((i12 & 2) != 0) {
            list = tabInfo.taobao;
        }
        if ((i12 & 4) != 0) {
            list2 = tabInfo.mall;
        }
        return tabInfo.copy(i11, list, list2);
    }

    public final int component1() {
        return this.serverRecommend;
    }

    @k
    public final List<f> component2() {
        return this.taobao;
    }

    @k
    public final List<f> component3() {
        return this.mall;
    }

    @k
    public final TabInfo copy(int i11, @k List<f> taobao, @k List<f> mall) {
        g0.p(taobao, "taobao");
        g0.p(mall, "mall");
        return new TabInfo(i11, taobao, mall);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabInfo)) {
            return false;
        }
        TabInfo tabInfo = (TabInfo) obj;
        return this.serverRecommend == tabInfo.serverRecommend && g0.g(this.taobao, tabInfo.taobao) && g0.g(this.mall, tabInfo.mall);
    }

    @k
    public final List<f> getMall() {
        return this.mall;
    }

    public final int getServerRecommend() {
        return this.serverRecommend;
    }

    @k
    public final List<f> getTaobao() {
        return this.taobao;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.serverRecommend) * 31) + this.taobao.hashCode()) * 31) + this.mall.hashCode();
    }

    @k
    public String toString() {
        return "TabInfo(serverRecommend=" + this.serverRecommend + ", taobao=" + this.taobao + ", mall=" + this.mall + j.f81007d;
    }
}
