package com.baicizhan.main.activity.mytab.task.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: i, reason: collision with root package name */
    public static final int f18788i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f18789a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f18790b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f18791c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f18792d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f18793e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TaskStatus f18794f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ActionType f18795g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f18796h;

    public i(int i11, @k String name, @k String desc, @k String reward, @k String buttonText, @k TaskStatus status, @k ActionType actionType, @l String str) {
        g0.p(name, "name");
        g0.p(desc, "desc");
        g0.p(reward, "reward");
        g0.p(buttonText, "buttonText");
        g0.p(status, "status");
        g0.p(actionType, "actionType");
        this.f18789a = i11;
        this.f18790b = name;
        this.f18791c = desc;
        this.f18792d = reward;
        this.f18793e = buttonText;
        this.f18794f = status;
        this.f18795g = actionType;
        this.f18796h = str;
    }

    public static /* synthetic */ i j(i iVar, int i11, String str, String str2, String str3, String str4, TaskStatus taskStatus, ActionType actionType, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iVar.f18789a;
        }
        if ((i12 & 2) != 0) {
            str = iVar.f18790b;
        }
        if ((i12 & 4) != 0) {
            str2 = iVar.f18791c;
        }
        if ((i12 & 8) != 0) {
            str3 = iVar.f18792d;
        }
        if ((i12 & 16) != 0) {
            str4 = iVar.f18793e;
        }
        if ((i12 & 32) != 0) {
            taskStatus = iVar.f18794f;
        }
        if ((i12 & 64) != 0) {
            actionType = iVar.f18795g;
        }
        if ((i12 & 128) != 0) {
            str5 = iVar.f18796h;
        }
        ActionType actionType2 = actionType;
        String str6 = str5;
        String str7 = str4;
        TaskStatus taskStatus2 = taskStatus;
        return iVar.i(i11, str, str2, str3, str7, taskStatus2, actionType2, str6);
    }

    public final int a() {
        return this.f18789a;
    }

    @k
    public final String b() {
        return this.f18790b;
    }

    @k
    public final String c() {
        return this.f18791c;
    }

    @k
    public final String d() {
        return this.f18792d;
    }

    @k
    public final String e() {
        return this.f18793e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f18789a == iVar.f18789a && g0.g(this.f18790b, iVar.f18790b) && g0.g(this.f18791c, iVar.f18791c) && g0.g(this.f18792d, iVar.f18792d) && g0.g(this.f18793e, iVar.f18793e) && this.f18794f == iVar.f18794f && this.f18795g == iVar.f18795g && g0.g(this.f18796h, iVar.f18796h);
    }

    @k
    public final TaskStatus f() {
        return this.f18794f;
    }

    @k
    public final ActionType g() {
        return this.f18795g;
    }

    @l
    public final String h() {
        return this.f18796h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f18789a) * 31) + this.f18790b.hashCode()) * 31) + this.f18791c.hashCode()) * 31) + this.f18792d.hashCode()) * 31) + this.f18793e.hashCode()) * 31) + this.f18794f.hashCode()) * 31) + this.f18795g.hashCode()) * 31;
        String str = this.f18796h;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final i i(int i11, @k String name, @k String desc, @k String reward, @k String buttonText, @k TaskStatus status, @k ActionType actionType, @l String str) {
        g0.p(name, "name");
        g0.p(desc, "desc");
        g0.p(reward, "reward");
        g0.p(buttonText, "buttonText");
        g0.p(status, "status");
        g0.p(actionType, "actionType");
        return new i(i11, name, desc, reward, buttonText, status, actionType, str);
    }

    @l
    public final String k() {
        return this.f18796h;
    }

    @k
    public final ActionType l() {
        return this.f18795g;
    }

    @k
    public final String m() {
        return this.f18793e;
    }

    @k
    public final String n() {
        return this.f18791c;
    }

    public final int o() {
        return this.f18789a;
    }

    @k
    public final String p() {
        return this.f18790b;
    }

    @k
    public final String q() {
        return this.f18792d;
    }

    @k
    public final TaskStatus r() {
        return this.f18794f;
    }

    @k
    public String toString() {
        return "Task(id=" + this.f18789a + ", name=" + this.f18790b + ", desc=" + this.f18791c + ", reward=" + this.f18792d + ", buttonText=" + this.f18793e + ", status=" + this.f18794f + ", actionType=" + this.f18795g + ", action=" + this.f18796h + j.f81007d;
    }
}
