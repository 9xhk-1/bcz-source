package com.baicizhan.client.business.managers.experience.data.db;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Entity(tableName = "t_task_record")
@Keep
/* loaded from: classes4.dex */
public final class TaskRecord {
    public static final int $stable = 0;

    @ColumnInfo(name = "task_action")
    @k
    private final String action;

    @ColumnInfo(name = "create_at")
    private final long createAt;

    /* renamed from: id, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private final long f16450id;

    public TaskRecord(long j11, @k String action, long j12) {
        g0.p(action, "action");
        this.f16450id = j11;
        this.action = action;
        this.createAt = j12;
    }

    public static /* synthetic */ TaskRecord copy$default(TaskRecord taskRecord, long j11, String str, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = taskRecord.f16450id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            str = taskRecord.action;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            j12 = taskRecord.createAt;
        }
        return taskRecord.copy(j13, str2, j12);
    }

    public final long component1() {
        return this.f16450id;
    }

    @k
    public final String component2() {
        return this.action;
    }

    public final long component3() {
        return this.createAt;
    }

    @k
    public final TaskRecord copy(long j11, @k String action, long j12) {
        g0.p(action, "action");
        return new TaskRecord(j11, action, j12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskRecord)) {
            return false;
        }
        TaskRecord taskRecord = (TaskRecord) obj;
        return this.f16450id == taskRecord.f16450id && g0.g(this.action, taskRecord.action) && this.createAt == taskRecord.createAt;
    }

    @k
    public final String getAction() {
        return this.action;
    }

    public final long getCreateAt() {
        return this.createAt;
    }

    public final long getId() {
        return this.f16450id;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f16450id) * 31) + this.action.hashCode()) * 31) + Long.hashCode(this.createAt);
    }

    @k
    public String toString() {
        return "TaskRecord(id=" + this.f16450id + ", action=" + this.action + ", createAt=" + this.createAt + j.f81007d;
    }

    public /* synthetic */ TaskRecord(long j11, String str, long j12, int i11, v vVar) {
        this((i11 & 1) != 0 ? 0L : j11, str, (i11 & 4) != 0 ? System.currentTimeMillis() : j12);
    }
}
