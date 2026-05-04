package com.baicizhan.main.home.experiment.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.game_api.EquipmentInfo;
import com.baicizhan.online.game_api.StudyHomeInfo;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21456d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final EquipmentInfo f21457a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final StudyHomeInfo f21458b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.client.business.managers.winningstreak.f f21459c;

    public a0(@m80.k EquipmentInfo homeAd, @m80.k StudyHomeInfo gameStudy, @m80.k com.baicizhan.client.business.managers.winningstreak.f winningStreak) {
        g0.p(homeAd, "homeAd");
        g0.p(gameStudy, "gameStudy");
        g0.p(winningStreak, "winningStreak");
        this.f21457a = homeAd;
        this.f21458b = gameStudy;
        this.f21459c = winningStreak;
    }

    public static /* synthetic */ a0 e(a0 a0Var, EquipmentInfo equipmentInfo, StudyHomeInfo studyHomeInfo, com.baicizhan.client.business.managers.winningstreak.f fVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            equipmentInfo = a0Var.f21457a;
        }
        if ((i11 & 2) != 0) {
            studyHomeInfo = a0Var.f21458b;
        }
        if ((i11 & 4) != 0) {
            fVar = a0Var.f21459c;
        }
        return a0Var.d(equipmentInfo, studyHomeInfo, fVar);
    }

    @m80.k
    public final EquipmentInfo a() {
        return this.f21457a;
    }

    @m80.k
    public final StudyHomeInfo b() {
        return this.f21458b;
    }

    @m80.k
    public final com.baicizhan.client.business.managers.winningstreak.f c() {
        return this.f21459c;
    }

    @m80.k
    public final a0 d(@m80.k EquipmentInfo homeAd, @m80.k StudyHomeInfo gameStudy, @m80.k com.baicizhan.client.business.managers.winningstreak.f winningStreak) {
        g0.p(homeAd, "homeAd");
        g0.p(gameStudy, "gameStudy");
        g0.p(winningStreak, "winningStreak");
        return new a0(homeAd, gameStudy, winningStreak);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return g0.g(this.f21457a, a0Var.f21457a) && g0.g(this.f21458b, a0Var.f21458b) && g0.g(this.f21459c, a0Var.f21459c);
    }

    @m80.k
    public final StudyHomeInfo f() {
        return this.f21458b;
    }

    @m80.k
    public final EquipmentInfo g() {
        return this.f21457a;
    }

    @m80.k
    public final com.baicizhan.client.business.managers.winningstreak.f h() {
        return this.f21459c;
    }

    public int hashCode() {
        return (((this.f21457a.hashCode() * 31) + this.f21458b.hashCode()) * 31) + this.f21459c.hashCode();
    }

    @m80.k
    public String toString() {
        return "RefreshAllWrap(homeAd=" + this.f21457a + ", gameStudy=" + this.f21458b + ", winningStreak=" + this.f21459c + pn.j.f81007d;
    }
}
