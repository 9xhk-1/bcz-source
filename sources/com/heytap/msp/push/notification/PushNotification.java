package com.heytap.msp.push.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PushNotification {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder extends Notification.Builder {
        private int autoDelete;
        private Icon icon;
        private int iconLevel;
        private int iconRes;
        private int importantLevel;
        private String messageId;
        private String statisticData;

        @RequiresApi(api = 26)
        public Builder(Context context, String str) {
            super(context, str);
        }

        public Builder addExtraAutoDelete(int i11) {
            this.autoDelete = i11;
            return this;
        }

        public Builder addExtraImportanceLevel(int i11) {
            this.importantLevel = i11;
            return this;
        }

        public Builder addExtraMessageId(String str) {
            this.messageId = str;
            return this;
        }

        public Builder addExtraStatisticData(String str) {
            this.statisticData = str;
            return this;
        }

        public int getAutoDelete() {
            return this.autoDelete;
        }

        public Icon getIcon() {
            return this.icon;
        }

        public int getIconLevel() {
            return this.iconLevel;
        }

        public int getIconRes() {
            return this.iconRes;
        }

        public int getImportantLevel() {
            return this.importantLevel;
        }

        public String getMessageId() {
            return this.messageId;
        }

        public String getStatisticData() {
            return this.statisticData;
        }

        public Builder(Context context) {
            super(context);
        }

        @Override // android.app.Notification.Builder
        public Builder addExtras(Bundle bundle) {
            super.addExtras(bundle);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder extend(Notification.Extender extender) {
            super.extend(extender);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setActions(Notification.Action... actionArr) {
            super.setActions(actionArr);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setAllowSystemGeneratedContextualActions(boolean z11) {
            super.setAllowSystemGeneratedContextualActions(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setAutoCancel(boolean z11) {
            super.setAutoCancel(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setBadgeIconType(int i11) {
            super.setBadgeIconType(i11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setBubbleMetadata(Notification.BubbleMetadata bubbleMetadata) {
            super.setBubbleMetadata(bubbleMetadata);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCategory(String str) {
            super.setCategory(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setChannelId(String str) {
            super.setChannelId(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setChronometerCountDown(boolean z11) {
            super.setChronometerCountDown(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setColor(int i11) {
            super.setColor(i11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setColorized(boolean z11) {
            super.setColorized(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setContent(RemoteViews remoteViews) {
            super.setContent(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setContentInfo(CharSequence charSequence) {
            super.setContentInfo(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setContentIntent(PendingIntent pendingIntent) {
            super.setContentIntent(pendingIntent);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setContentText(CharSequence charSequence) {
            super.setContentText(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setContentTitle(CharSequence charSequence) {
            super.setContentTitle(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCustomBigContentView(RemoteViews remoteViews) {
            super.setCustomBigContentView(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCustomContentView(RemoteViews remoteViews) {
            super.setCustomContentView(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
            super.setCustomHeadsUpContentView(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setDefaults(int i11) {
            super.setDefaults(i11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            super.setDeleteIntent(pendingIntent);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setExtras(Bundle bundle) {
            super.setExtras(bundle);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z11) {
            super.setFullScreenIntent(pendingIntent, z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setGroup(String str) {
            super.setGroup(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setGroupAlertBehavior(int i11) {
            super.setGroupAlertBehavior(i11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setGroupSummary(boolean z11) {
            super.setGroupSummary(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setLights(@ColorInt int i11, int i12, int i13) {
            super.setLights(i11, i12, i13);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLocalOnly(boolean z11) {
            super.setLocalOnly(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLocusId(LocusId locusId) {
            super.setLocusId(locusId);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setNumber(int i11) {
            super.setNumber(i11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setOngoing(boolean z11) {
            super.setOngoing(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setOnlyAlertOnce(boolean z11) {
            super.setOnlyAlertOnce(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setPriority(int i11) {
            super.setPriority(i11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setProgress(int i11, int i12, boolean z11) {
            super.setProgress(i11, i12, z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setPublicVersion(Notification notification) {
            super.setPublicVersion(notification);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
            super.setRemoteInputHistory(charSequenceArr);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSettingsText(CharSequence charSequence) {
            super.setSettingsText(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setShortcutId(String str) {
            super.setShortcutId(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setShowWhen(boolean z11) {
            super.setShowWhen(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSortKey(String str) {
            super.setSortKey(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setStyle(Notification.Style style) {
            super.setStyle(style);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSubText(CharSequence charSequence) {
            super.setSubText(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setTimeoutAfter(long j11) {
            super.setTimeoutAfter(j11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setUsesChronometer(boolean z11) {
            super.setUsesChronometer(z11);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setVibrate(long[] jArr) {
            super.setVibrate(jArr);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setVisibility(int i11) {
            super.setVisibility(i11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setWhen(long j11) {
            super.setWhen(j11);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder addAction(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            super.addAction(i11, charSequence, pendingIntent);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addPerson(String str) {
            super.addPerson(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLargeIcon(Bitmap bitmap) {
            super.setLargeIcon(bitmap);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setTicker(CharSequence charSequence) {
            super.setTicker(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addAction(Notification.Action action) {
            super.addAction(action);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addPerson(Person person) {
            super.addPerson(person);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLargeIcon(Icon icon) {
            super.setLargeIcon(icon);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSmallIcon(@DrawableRes int i11) {
            super.setSmallIcon(i11);
            this.iconRes = i11;
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setSound(Uri uri) {
            super.setSound(uri);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            super.setTicker(charSequence, remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setSound(Uri uri, int i11) {
            super.setSound(uri, i11);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSmallIcon(@DrawableRes int i11, int i12) {
            super.setSmallIcon(i11, i12);
            this.iconRes = i11;
            this.iconLevel = i12;
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setSound(Uri uri, AudioAttributes audioAttributes) {
            super.setSound(uri, audioAttributes);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSmallIcon(Icon icon) {
            super.setSmallIcon(icon);
            this.icon = icon;
            return this;
        }
    }
}
