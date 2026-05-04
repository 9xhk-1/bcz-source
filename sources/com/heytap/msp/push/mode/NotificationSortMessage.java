package com.heytap.msp.push.mode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class NotificationSortMessage implements Comparable<NotificationSortMessage> {
    private int autoDelete;
    private String group;
    private int importantLevel;
    private boolean isMcs;
    private String messageId;
    private int notifyId;
    private long postTime;
    private String statisticData;

    public NotificationSortMessage(String str, int i11, int i12, boolean z11, long j11, int i13, String str2) {
        this(str, i11, i12, z11, j11, str2);
        this.notifyId = i13;
    }

    public int getAutoDelete() {
        return this.autoDelete;
    }

    public String getGroup() {
        return this.group;
    }

    public int getImportantLevel() {
        return this.importantLevel;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getNotifyId() {
        return this.notifyId;
    }

    public long getPostTime() {
        return this.postTime;
    }

    public String getStatisticData() {
        return this.statisticData;
    }

    public boolean isMcs() {
        return this.isMcs;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getPostTime() < this.postTime) {
            return 1;
        }
        return notificationSortMessage.getPostTime() == this.postTime ? 0 : -1;
    }

    public NotificationSortMessage(String str, int i11, int i12, boolean z11, long j11, String str2) {
        this.messageId = str;
        this.importantLevel = i11;
        this.autoDelete = i12;
        this.isMcs = z11;
        this.postTime = j11;
        this.statisticData = str2;
    }
}
