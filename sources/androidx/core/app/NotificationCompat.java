package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.app.Person;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import com.bumptech.glide.load.engine.GlideException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";

    @ColorInt
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";

    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Action {
        static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;

        @Nullable
        public PendingIntent actionIntent;

        @Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final RemoteInput[] mDataOnlyRemoteInputs;
        final Bundle mExtras;

        @Nullable
        private IconCompat mIcon;
        private final boolean mIsContextual;
        private final RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public CharSequence title;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private final Bundle mExtras;
            private final IconCompat mIcon;
            private final PendingIntent mIntent;
            private boolean mIsContextual;
            private ArrayList<RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @RequiresApi(20)
            public static class Api20Impl {
                private Api20Impl() {
                }

                @DoNotInline
                public static Bundle getExtras(Notification.Action action) {
                    return action.getExtras();
                }

                @DoNotInline
                public static android.app.RemoteInput[] getRemoteInputs(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @RequiresApi(23)
            public static class Api23Impl {
                private Api23Impl() {
                }

                @DoNotInline
                public static Icon getIcon(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @RequiresApi(24)
            public static class Api24Impl {
                private Api24Impl() {
                }

                @DoNotInline
                public static boolean getAllowGeneratedReplies(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @RequiresApi(28)
            public static class Api28Impl {
                private Api28Impl() {
                }

                @DoNotInline
                public static int getSemanticAction(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @RequiresApi(29)
            public static class Api29Impl {
                private Api29Impl() {
                }

                @DoNotInline
                public static boolean isContextual(Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @RequiresApi(31)
            public static class Api31Impl {
                private Api31Impl() {
                }

                @DoNotInline
                public static boolean isAuthenticationRequired(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void checkContextualActionNullFields() {
                if (this.mIsContextual && this.mIntent == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @NonNull
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public static Builder fromAndroidAction(@NonNull Notification.Action action) {
                Builder builder = Api23Impl.getIcon(action) != null ? new Builder(IconCompat.createFromIconOrNullIfZeroResId(Api23Impl.getIcon(action)), action.title, action.actionIntent) : new Builder(action.icon, action.title, action.actionIntent);
                android.app.RemoteInput[] remoteInputs = Api20Impl.getRemoteInputs(action);
                if (remoteInputs != null && remoteInputs.length != 0) {
                    for (android.app.RemoteInput remoteInput : remoteInputs) {
                        builder.addRemoteInput(RemoteInput.fromPlatform(remoteInput));
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                builder.mAllowGeneratedReplies = Api24Impl.getAllowGeneratedReplies(action);
                if (i11 >= 28) {
                    builder.setSemanticAction(Api28Impl.getSemanticAction(action));
                }
                if (i11 >= 29) {
                    builder.setContextual(Api29Impl.isContextual(action));
                }
                if (i11 >= 31) {
                    builder.setAuthenticationRequired(Api31Impl.isAuthenticationRequired(action));
                }
                builder.addExtras(Api20Impl.getExtras(action));
                return builder;
            }

            @NonNull
            public Builder addExtras(@Nullable Bundle bundle) {
                if (bundle != null) {
                    this.mExtras.putAll(bundle);
                }
                return this;
            }

            @NonNull
            public Builder addRemoteInput(@Nullable RemoteInput remoteInput) {
                if (this.mRemoteInputs == null) {
                    this.mRemoteInputs = new ArrayList<>();
                }
                if (remoteInput != null) {
                    this.mRemoteInputs.add(remoteInput);
                }
                return this;
            }

            @NonNull
            public Action build() {
                checkContextualActionNullFields();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<RemoteInput> arrayList3 = this.mRemoteInputs;
                if (arrayList3 != null) {
                    Iterator<RemoteInput> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        RemoteInput next = it.next();
                        if (next.isDataOnly()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                return new Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, arrayList2.isEmpty() ? null : (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]), arrayList.isEmpty() ? null : (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]), this.mAllowGeneratedReplies, this.mSemanticAction, this.mShowsUserInterface, this.mIsContextual, this.mAuthenticationRequired);
            }

            @NonNull
            public Builder extend(@NonNull Extender extender) {
                extender.extend(this);
                return this;
            }

            @NonNull
            public Bundle getExtras() {
                return this.mExtras;
            }

            @NonNull
            public Builder setAllowGeneratedReplies(boolean z11) {
                this.mAllowGeneratedReplies = z11;
                return this;
            }

            @NonNull
            public Builder setAuthenticationRequired(boolean z11) {
                this.mAuthenticationRequired = z11;
                return this;
            }

            @NonNull
            public Builder setContextual(boolean z11) {
                this.mIsContextual = z11;
                return this;
            }

            @NonNull
            public Builder setSemanticAction(int i11) {
                this.mSemanticAction = i11;
                return this;
            }

            @NonNull
            public Builder setShowsUserInterface(boolean z11) {
                this.mShowsUserInterface = z11;
                return this;
            }

            public Builder(int i11, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(i11 != 0 ? IconCompat.createWithResource(null, "", i11) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(@NonNull Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface, action.isContextual(), action.isAuthenticationRequired());
            }

            private Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @NonNull Bundle bundle, @Nullable RemoteInput[] remoteInputArr, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = iconCompat;
                this.mTitle = Builder.limitCharSequenceLength(charSequence);
                this.mIntent = pendingIntent;
                this.mExtras = bundle;
                this.mRemoteInputs = remoteInputArr == null ? null : new ArrayList<>(Arrays.asList(remoteInputArr));
                this.mAllowGeneratedReplies = z11;
                this.mSemanticAction = i11;
                this.mShowsUserInterface = z12;
                this.mIsContextual = z13;
                this.mAuthenticationRequired = z14;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface Extender {
            @NonNull
            Builder extend(@NonNull Builder builder);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class WearableExtender implements Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final String KEY_CANCEL_LABEL = "cancelLabel";
            private static final String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final String KEY_FLAGS = "flags";
            private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags;
            private CharSequence mInProgressLabel;

            public WearableExtender() {
                this.mFlags = 1;
            }

            private void setFlag(int i11, boolean z11) {
                if (z11) {
                    this.mFlags = i11 | this.mFlags;
                } else {
                    this.mFlags = (~i11) & this.mFlags;
                }
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            @NonNull
            public Builder extend(@NonNull Builder builder) {
                Bundle bundle = new Bundle();
                int i11 = this.mFlags;
                if (i11 != 1) {
                    bundle.putInt(KEY_FLAGS, i11);
                }
                CharSequence charSequence = this.mInProgressLabel;
                if (charSequence != null) {
                    bundle.putCharSequence(KEY_IN_PROGRESS_LABEL, charSequence);
                }
                CharSequence charSequence2 = this.mConfirmLabel;
                if (charSequence2 != null) {
                    bundle.putCharSequence(KEY_CONFIRM_LABEL, charSequence2);
                }
                CharSequence charSequence3 = this.mCancelLabel;
                if (charSequence3 != null) {
                    bundle.putCharSequence(KEY_CANCEL_LABEL, charSequence3);
                }
                builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
                return builder;
            }

            @Nullable
            @Deprecated
            public CharSequence getCancelLabel() {
                return this.mCancelLabel;
            }

            @Nullable
            @Deprecated
            public CharSequence getConfirmLabel() {
                return this.mConfirmLabel;
            }

            public boolean getHintDisplayActionInline() {
                return (this.mFlags & 4) != 0;
            }

            public boolean getHintLaunchesActivity() {
                return (this.mFlags & 2) != 0;
            }

            @Nullable
            @Deprecated
            public CharSequence getInProgressLabel() {
                return this.mInProgressLabel;
            }

            public boolean isAvailableOffline() {
                return (this.mFlags & 1) != 0;
            }

            @NonNull
            public WearableExtender setAvailableOffline(boolean z11) {
                setFlag(1, z11);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setCancelLabel(@Nullable CharSequence charSequence) {
                this.mCancelLabel = charSequence;
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setConfirmLabel(@Nullable CharSequence charSequence) {
                this.mConfirmLabel = charSequence;
                return this;
            }

            @NonNull
            public WearableExtender setHintDisplayActionInline(boolean z11) {
                setFlag(4, z11);
                return this;
            }

            @NonNull
            public WearableExtender setHintLaunchesActivity(boolean z11) {
                setFlag(2, z11);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setInProgressLabel(@Nullable CharSequence charSequence) {
                this.mInProgressLabel = charSequence;
                return this;
            }

            @NonNull
            /* renamed from: clone, reason: merged with bridge method [inline-methods] */
            public WearableExtender m5601clone() {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.mFlags = this.mFlags;
                wearableExtender.mInProgressLabel = this.mInProgressLabel;
                wearableExtender.mConfirmLabel = this.mConfirmLabel;
                wearableExtender.mCancelLabel = this.mCancelLabel;
                return wearableExtender;
            }

            public WearableExtender(@NonNull Action action) {
                this.mFlags = 1;
                Bundle bundle = action.getExtras().getBundle(EXTRA_WEARABLE_EXTENSIONS);
                if (bundle != null) {
                    this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                    this.mInProgressLabel = bundle.getCharSequence(KEY_IN_PROGRESS_LABEL);
                    this.mConfirmLabel = bundle.getCharSequence(KEY_CONFIRM_LABEL);
                    this.mCancelLabel = bundle.getCharSequence(KEY_CANCEL_LABEL);
                }
            }
        }

        public Action(int i11, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(i11 != 0 ? IconCompat.createWithResource(null, "", i11) : null, charSequence, pendingIntent);
        }

        @Nullable
        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.mAllowGeneratedReplies;
        }

        @Nullable
        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.mDataOnlyRemoteInputs;
        }

        @NonNull
        public Bundle getExtras() {
            return this.mExtras;
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        @Nullable
        public IconCompat getIconCompat() {
            int i11;
            if (this.mIcon == null && (i11 = this.icon) != 0) {
                this.mIcon = IconCompat.createWithResource(null, "", i11);
            }
            return this.mIcon;
        }

        @Nullable
        public RemoteInput[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            return this.mSemanticAction;
        }

        public boolean getShowsUserInterface() {
            return this.mShowsUserInterface;
        }

        @Nullable
        public CharSequence getTitle() {
            return this.title;
        }

        public boolean isAuthenticationRequired() {
            return this.mAuthenticationRequired;
        }

        public boolean isContextual() {
            return this.mIsContextual;
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        public Action(int i11, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable RemoteInput[] remoteInputArr, @Nullable RemoteInput[] remoteInputArr2, boolean z11, int i12, boolean z12, boolean z13, boolean z14) {
            this(i11 != 0 ? IconCompat.createWithResource(null, "", i11) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z11, i12, z12, z13, z14);
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable RemoteInput[] remoteInputArr, @Nullable RemoteInput[] remoteInputArr2, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
            this.mShowsUserInterface = true;
            this.mIcon = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.icon = iconCompat.getResId();
            }
            this.title = Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.mExtras = bundle == null ? new Bundle() : bundle;
            this.mRemoteInputs = remoteInputArr;
            this.mDataOnlyRemoteInputs = remoteInputArr2;
            this.mAllowGeneratedReplies = z11;
            this.mSemanticAction = i11;
            this.mShowsUserInterface = z12;
            this.mIsContextual = z13;
            this.mAuthenticationRequired = z14;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(20)
    public static class Api20Impl {
        private Api20Impl() {
        }

        @DoNotInline
        public static boolean getAllowFreeFormInput(android.app.RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        @DoNotInline
        public static CharSequence[] getChoices(android.app.RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        @DoNotInline
        public static Bundle getExtras(Notification.Action action) {
            return action.getExtras();
        }

        @DoNotInline
        public static String getGroup(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        public static CharSequence getLabel(android.app.RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        @DoNotInline
        public static android.app.RemoteInput[] getRemoteInputs(Notification.Action action) {
            return action.getRemoteInputs();
        }

        @DoNotInline
        public static String getResultKey(android.app.RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        @DoNotInline
        public static String getSortKey(Notification notification) {
            return notification.getSortKey();
        }

        @DoNotInline
        public static Bundle getExtras(android.app.RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static Icon getIcon(Notification.Action action) {
            return action.getIcon();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static boolean getAllowGeneratedReplies(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static int getBadgeIconType(Notification notification) {
            return notification.getBadgeIconType();
        }

        @DoNotInline
        public static String getChannelId(Notification notification) {
            return notification.getChannelId();
        }

        @DoNotInline
        public static int getGroupAlertBehavior(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        @DoNotInline
        public static CharSequence getSettingsText(Notification notification) {
            return notification.getSettingsText();
        }

        @DoNotInline
        public static String getShortcutId(Notification notification) {
            return notification.getShortcutId();
        }

        @DoNotInline
        public static long getTimeoutAfter(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static int getSemanticAction(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        @DoNotInline
        public static Notification.BubbleMetadata getBubbleMetadata(Notification notification) {
            return notification.getBubbleMetadata();
        }

        @DoNotInline
        public static int getEditChoicesBeforeSending(android.app.RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        @DoNotInline
        public static LocusId getLocusId(Notification notification) {
            return notification.getLocusId();
        }

        @DoNotInline
        public static boolean isContextual(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        public static boolean isAuthenticationRequired(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface BadgeIconType {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BigPictureStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private CharSequence mPictureContentDescription;
        private IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(23)
        public static class Api23Impl {
            private Api23Impl() {
            }

            @RequiresApi(23)
            public static void setBigLargeIcon(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(31)
        public static class Api31Impl {
            private Api31Impl() {
            }

            @RequiresApi(31)
            public static void setBigPicture(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi(31)
            public static void setContentDescription(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi(31)
            public static void showBigPictureWhenCollapsed(Notification.BigPictureStyle bigPictureStyle, boolean z11) {
                bigPictureStyle.showBigPictureWhenCollapsed(z11);
            }
        }

        public BigPictureStyle() {
        }

        @Nullable
        private static IconCompat asIconCompat(@Nullable Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.createFromIcon((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.createWithBitmap((Bitmap) parcelable);
            }
            return null;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static IconCompat getPictureIcon(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
            return parcelable != null ? asIconCompat(parcelable) : asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            IconCompat iconCompat = this.mPictureIcon;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.setBigPicture(bigContentTitle, this.mPictureIcon.toIcon(notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder ? ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext() : null));
                } else if (iconCompat.getType() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.mPictureIcon.getBitmap());
                }
            }
            if (this.mBigLargeIconSet) {
                if (this.mBigLargeIcon == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    Api23Impl.setBigLargeIcon(bigContentTitle, this.mBigLargeIcon.toIcon(notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder ? ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext() : null));
                }
            }
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.showBigPictureWhenCollapsed(bigContentTitle, this.mShowBigPictureWhenCollapsed);
                Api31Impl.setContentDescription(bigContentTitle, this.mPictureContentDescription);
            }
        }

        @NonNull
        public BigPictureStyle bigLargeIcon(@Nullable Bitmap bitmap) {
            this.mBigLargeIcon = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            this.mBigLargeIconSet = true;
            return this;
        }

        @NonNull
        public BigPictureStyle bigPicture(@Nullable Bitmap bitmap) {
            this.mPictureIcon = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(NotificationCompat.EXTRA_PICTURE);
            bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.mBigLargeIcon = asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.mBigLargeIconSet = true;
            }
            this.mPictureIcon = getPictureIcon(bundle);
            this.mShowBigPictureWhenCollapsed = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @NonNull
        public BigPictureStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle setContentDescription(@Nullable CharSequence charSequence) {
            this.mPictureContentDescription = charSequence;
            return this;
        }

        @NonNull
        public BigPictureStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle showBigPictureWhenCollapsed(boolean z11) {
            this.mShowBigPictureWhenCollapsed = z11;
            return this;
        }

        public BigPictureStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle bigPicture(@Nullable Icon icon) {
            this.mPictureIcon = IconCompat.createFromIcon(icon);
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public BigPictureStyle bigLargeIcon(@Nullable Icon icon) {
            this.mBigLargeIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            this.mBigLargeIconSet = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BigTextStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence mBigText;

        public BigTextStyle() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
            if (this.mSummaryTextSet) {
                bigText.setSummaryText(this.mSummaryText);
            }
        }

        @NonNull
        public BigTextStyle bigText(@Nullable CharSequence charSequence) {
            this.mBigText = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mBigText = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @NonNull
        public BigTextStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public BigTextStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigTextStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private PendingIntent mDeleteIntent;
        private int mDesiredHeight;

        @DimenRes
        private int mDesiredHeightResId;
        private int mFlags;
        private IconCompat mIcon;
        private PendingIntent mPendingIntent;
        private String mShortcutId;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(29)
        public static class Api29Impl {
            private Api29Impl() {
            }

            @Nullable
            @RequiresApi(29)
            public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Builder suppressNotification = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            @Nullable
            @RequiresApi(29)
            public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.getIcon().toIcon()).setIntent(bubbleMetadata.getIntent()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(30)
        public static class Api30Impl {
            private Api30Impl() {
            }

            @Nullable
            @RequiresApi(30)
            public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Builder builder = bubbleMetadata.getShortcutId() != null ? new Builder(bubbleMetadata.getShortcutId()) : new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            @Nullable
            @RequiresApi(30)
            public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = bubbleMetadata.getShortcutId() != null ? new Notification.BubbleMetadata.Builder(bubbleMetadata.getShortcutId()) : new Notification.BubbleMetadata.Builder(bubbleMetadata.getIntent(), bubbleMetadata.getIcon().toIcon());
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {
            private PendingIntent mDeleteIntent;
            private int mDesiredHeight;

            @DimenRes
            private int mDesiredHeightResId;
            private int mFlags;
            private IconCompat mIcon;
            private PendingIntent mPendingIntent;
            private String mShortcutId;

            @Deprecated
            public Builder() {
            }

            @NonNull
            private Builder setFlag(int i11, boolean z11) {
                if (z11) {
                    this.mFlags = i11 | this.mFlags;
                    return this;
                }
                this.mFlags = (~i11) & this.mFlags;
                return this;
            }

            @NonNull
            public BubbleMetadata build() {
                String str = this.mShortcutId;
                if (str == null && this.mPendingIntent == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.mIcon == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                BubbleMetadata bubbleMetadata = new BubbleMetadata(this.mPendingIntent, this.mDeleteIntent, this.mIcon, this.mDesiredHeight, this.mDesiredHeightResId, this.mFlags, str);
                bubbleMetadata.setFlags(this.mFlags);
                return bubbleMetadata;
            }

            @NonNull
            public Builder setAutoExpandBubble(boolean z11) {
                setFlag(1, z11);
                return this;
            }

            @NonNull
            public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
                this.mDeleteIntent = pendingIntent;
                return this;
            }

            @NonNull
            public Builder setDesiredHeight(@Dimension(unit = 0) int i11) {
                this.mDesiredHeight = Math.max(i11, 0);
                this.mDesiredHeightResId = 0;
                return this;
            }

            @NonNull
            public Builder setDesiredHeightResId(@DimenRes int i11) {
                this.mDesiredHeightResId = i11;
                this.mDesiredHeight = 0;
                return this;
            }

            @NonNull
            public Builder setIcon(@NonNull IconCompat iconCompat) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.mIcon = iconCompat;
                return this;
            }

            @NonNull
            public Builder setIntent(@NonNull PendingIntent pendingIntent) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.mPendingIntent = pendingIntent;
                return this;
            }

            @NonNull
            public Builder setSuppressNotification(boolean z11) {
                setFlag(2, z11);
                return this;
            }

            @RequiresApi(30)
            public Builder(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.mShortcutId = str;
            }

            public Builder(@NonNull PendingIntent pendingIntent, @NonNull IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.mPendingIntent = pendingIntent;
                    this.mIcon = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        @Nullable
        public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                return Api30Impl.fromPlatform(bubbleMetadata);
            }
            if (i11 == 29) {
                return Api29Impl.fromPlatform(bubbleMetadata);
            }
            return null;
        }

        @Nullable
        public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                return Api30Impl.toPlatform(bubbleMetadata);
            }
            if (i11 == 29) {
                return Api29Impl.toPlatform(bubbleMetadata);
            }
            return null;
        }

        public boolean getAutoExpandBubble() {
            return (this.mFlags & 1) != 0;
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        @Dimension(unit = 0)
        public int getDesiredHeight() {
            return this.mDesiredHeight;
        }

        @DimenRes
        public int getDesiredHeightResId() {
            return this.mDesiredHeightResId;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat getIcon() {
            return this.mIcon;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent getIntent() {
            return this.mPendingIntent;
        }

        @Nullable
        public String getShortcutId() {
            return this.mShortcutId;
        }

        public boolean isNotificationSuppressed() {
            return (this.mFlags & 2) != 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void setFlags(int i11) {
            this.mFlags = i11;
        }

        private BubbleMetadata(@Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable IconCompat iconCompat, int i11, @DimenRes int i12, int i13, @Nullable String str) {
            this.mPendingIntent = pendingIntent;
            this.mIcon = iconCompat;
            this.mDesiredHeight = i11;
            this.mDesiredHeightResId = i12;
            this.mDeleteIntent = pendingIntent2;
            this.mFlags = i13;
            this.mShortcutId = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        BubbleMetadata mBubbleMetadata;
        String mCategory;
        String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context mContext;
        Bundle mExtras;
        int mFgsDeferBehavior;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList<Action> mInvisibleActions;
        IconCompat mLargeIcon;
        boolean mLocalOnly;
        LocusIdCompat mLocusId;
        Notification mNotification;
        int mNumber;

        @Deprecated
        public ArrayList<String> mPeople;

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        CharSequence mSettingsText;
        String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        Object mSmallIcon;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(21)
        public static class Api21Impl {
            private Api21Impl() {
            }

            @DoNotInline
            public static AudioAttributes build(AudioAttributes.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static AudioAttributes.Builder createBuilder() {
                return new AudioAttributes.Builder();
            }

            @DoNotInline
            public static AudioAttributes.Builder setContentType(AudioAttributes.Builder builder, int i11) {
                return builder.setContentType(i11);
            }

            @DoNotInline
            public static AudioAttributes.Builder setLegacyStreamType(AudioAttributes.Builder builder, int i11) {
                return builder.setLegacyStreamType(i11);
            }

            @DoNotInline
            public static AudioAttributes.Builder setUsage(AudioAttributes.Builder builder, int i11) {
                return builder.setUsage(i11);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(23)
        public static class Api23Impl {
            private Api23Impl() {
            }

            @DoNotInline
            public static Icon getLargeIcon(Notification notification) {
                return notification.getLargeIcon();
            }

            @DoNotInline
            public static Icon getSmallIcon(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static RemoteViews createBigContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            public static RemoteViews createContentView(Notification.Builder builder) {
                return builder.createContentView();
            }

            @DoNotInline
            public static RemoteViews createHeadsUpContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            public static Notification.Builder recoverBuilder(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public Builder(@NonNull Context context, @NonNull Notification notification) {
            this(context, NotificationCompat.getChannelId(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(extractStyleFromNotification).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), bundle.getInt(NotificationCompat.EXTRA_PROGRESS), bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getExtrasWithoutDuplicateData(notification, extractStyleFromNotification));
            this.mSmallIcon = Api23Impl.getSmallIcon(notification);
            Icon largeIcon = Api23Impl.getLargeIcon(notification);
            if (largeIcon != null) {
                this.mLargeIcon = IconCompat.createFromIcon(largeIcon);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    addAction(Action.Builder.fromAndroidAction(action).build());
                }
            }
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                Iterator<Action> it = invisibleActions.iterator();
                while (it.hasNext()) {
                    addInvisibleAction(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    addPerson(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    addPerson(Person.fromAndroidPerson(j.a(it2.next())));
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (bundle.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (i11 < 26 || !bundle.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                return;
            }
            setColorized(bundle.getBoolean(NotificationCompat.EXTRA_COLORIZED));
        }

        @Nullable
        private static Bundle getExtrasWithoutDuplicateData(@NonNull Notification notification, @Nullable Style style) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(NotificationCompat.EXTRA_TITLE);
            bundle.remove(NotificationCompat.EXTRA_TEXT);
            bundle.remove(NotificationCompat.EXTRA_INFO_TEXT);
            bundle.remove(NotificationCompat.EXTRA_SUB_TEXT);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE);
            bundle.remove(NotificationCompatExtras.EXTRA_SORT_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            bundle.remove(NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            bundle.remove(NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (style != null) {
                style.clearCompatExtraKeys(bundle);
            }
            return bundle;
        }

        @Nullable
        public static CharSequence limitCharSequenceLength(@Nullable CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void setFlag(int i11, boolean z11) {
            if (z11) {
                Notification notification = this.mNotification;
                notification.flags = i11 | notification.flags;
            } else {
                Notification notification2 = this.mNotification;
                notification2.flags = (~i11) & notification2.flags;
            }
        }

        private boolean useExistingRemoteView() {
            Style style = this.mStyle;
            return style == null || !style.displayCustomViewInline();
        }

        @NonNull
        public Builder addAction(int i11, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mActions.add(new Action(i11, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public Builder addExtras(@Nullable Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public Builder addInvisibleAction(int i11, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mInvisibleActions.add(new Action(i11, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        @Deprecated
        public Builder addPerson(@Nullable String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        @NonNull
        public Notification build() {
            return new NotificationCompatBuilder(this).build();
        }

        @NonNull
        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        public Builder clearInvisibleActions() {
            this.mInvisibleActions.clear();
            Bundle bundle = this.mExtras.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.mExtras.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @NonNull
        public Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createBigContentView() {
            RemoteViews makeBigContentView;
            if (this.mBigContentView != null && useExistingRemoteView()) {
                return this.mBigContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            return (style == null || (makeBigContentView = style.makeBigContentView(notificationCompatBuilder)) == null) ? Api24Impl.createBigContentView(Api24Impl.recoverBuilder(this.mContext, notificationCompatBuilder.build())) : makeBigContentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createContentView() {
            RemoteViews makeContentView;
            if (this.mContentView != null && useExistingRemoteView()) {
                return this.mContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            return (style == null || (makeContentView = style.makeContentView(notificationCompatBuilder)) == null) ? Api24Impl.createContentView(Api24Impl.recoverBuilder(this.mContext, notificationCompatBuilder.build())) : makeContentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createHeadsUpContentView() {
            RemoteViews makeHeadsUpContentView;
            if (this.mHeadsUpContentView != null && useExistingRemoteView()) {
                return this.mHeadsUpContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            return (style == null || (makeHeadsUpContentView = style.makeHeadsUpContentView(notificationCompatBuilder)) == null) ? Api24Impl.createHeadsUpContentView(Api24Impl.recoverBuilder(this.mContext, notificationCompatBuilder.build())) : makeHeadsUpContentView;
        }

        @NonNull
        public Builder extend(@NonNull Extender extender) {
            extender.extend(this);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public BubbleMetadata getBubbleMetadata() {
            return this.mBubbleMetadata;
        }

        @ColorInt
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getColor() {
            return this.mColor;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getContentView() {
            return this.mContentView;
        }

        @NonNull
        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getForegroundServiceBehavior() {
            return this.mFgsDeferBehavior;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        @NonNull
        @Deprecated
        public Notification getNotification() {
            return build();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getPriority() {
            return this.mPriority;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0L;
        }

        @NonNull
        public Builder setAllowSystemGeneratedContextualActions(boolean z11) {
            this.mAllowSystemGeneratedContextualActions = z11;
            return this;
        }

        @NonNull
        public Builder setAutoCancel(boolean z11) {
            setFlag(16, z11);
            return this;
        }

        @NonNull
        public Builder setBadgeIconType(int i11) {
            this.mBadgeIcon = i11;
            return this;
        }

        @NonNull
        public Builder setBubbleMetadata(@Nullable BubbleMetadata bubbleMetadata) {
            this.mBubbleMetadata = bubbleMetadata;
            return this;
        }

        @NonNull
        public Builder setCategory(@Nullable String str) {
            this.mCategory = str;
            return this;
        }

        @NonNull
        public Builder setChannelId(@NonNull String str) {
            this.mChannelId = str;
            return this;
        }

        @NonNull
        @RequiresApi(24)
        public Builder setChronometerCountDown(boolean z11) {
            this.mChronometerCountDown = z11;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z11);
            return this;
        }

        @NonNull
        public Builder setColor(@ColorInt int i11) {
            this.mColor = i11;
            return this;
        }

        @NonNull
        public Builder setColorized(boolean z11) {
            this.mColorized = z11;
            this.mColorizedSet = true;
            return this;
        }

        @NonNull
        public Builder setContent(@Nullable RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setContentInfo(@Nullable CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentIntent(@Nullable PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setContentText(@Nullable CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentTitle(@Nullable CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setCustomBigContentView(@Nullable RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomContentView(@Nullable RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomHeadsUpContentView(@Nullable RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setDefaults(int i11) {
            Notification notification = this.mNotification;
            notification.defaults = i11;
            if ((i11 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @NonNull
        public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        @NonNull
        public Builder setForegroundServiceBehavior(int i11) {
            this.mFgsDeferBehavior = i11;
            return this;
        }

        @NonNull
        public Builder setFullScreenIntent(@Nullable PendingIntent pendingIntent, boolean z11) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(128, z11);
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.mGroupKey = str;
            return this;
        }

        @NonNull
        public Builder setGroupAlertBehavior(int i11) {
            this.mGroupAlertBehavior = i11;
            return this;
        }

        @NonNull
        public Builder setGroupSummary(boolean z11) {
            this.mGroupSummary = z11;
            return this;
        }

        @NonNull
        public Builder setLargeIcon(@Nullable Bitmap bitmap) {
            this.mLargeIcon = bitmap == null ? null : IconCompat.createWithBitmap(NotificationCompat.reduceLargeIconSize(this.mContext, bitmap));
            return this;
        }

        @NonNull
        public Builder setLights(@ColorInt int i11, int i12, int i13) {
            Notification notification = this.mNotification;
            notification.ledARGB = i11;
            notification.ledOnMS = i12;
            notification.ledOffMS = i13;
            notification.flags = ((i12 == 0 || i13 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @NonNull
        public Builder setLocalOnly(boolean z11) {
            this.mLocalOnly = z11;
            return this;
        }

        @NonNull
        public Builder setLocusId(@Nullable LocusIdCompat locusIdCompat) {
            this.mLocusId = locusIdCompat;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        @NonNull
        public Builder setNumber(int i11) {
            this.mNumber = i11;
            return this;
        }

        @NonNull
        public Builder setOngoing(boolean z11) {
            setFlag(2, z11);
            return this;
        }

        @NonNull
        public Builder setOnlyAlertOnce(boolean z11) {
            setFlag(8, z11);
            return this;
        }

        @NonNull
        public Builder setPriority(int i11) {
            this.mPriority = i11;
            return this;
        }

        @NonNull
        public Builder setProgress(int i11, int i12, boolean z11) {
            this.mProgressMax = i11;
            this.mProgress = i12;
            this.mProgressIndeterminate = z11;
            return this;
        }

        @NonNull
        public Builder setPublicVersion(@Nullable Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        @NonNull
        public Builder setRemoteInputHistory(@Nullable CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        @NonNull
        public Builder setSettingsText(@Nullable CharSequence charSequence) {
            this.mSettingsText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setShortcutId(@Nullable String str) {
            this.mShortcutId = str;
            return this;
        }

        @NonNull
        public Builder setShortcutInfo(@Nullable ShortcutInfoCompat shortcutInfoCompat) {
            if (shortcutInfoCompat != null) {
                this.mShortcutId = shortcutInfoCompat.getId();
                if (this.mLocusId == null) {
                    if (shortcutInfoCompat.getLocusId() != null) {
                        this.mLocusId = shortcutInfoCompat.getLocusId();
                    } else if (shortcutInfoCompat.getId() != null) {
                        this.mLocusId = new LocusIdCompat(shortcutInfoCompat.getId());
                    }
                }
                if (this.mContentTitle == null) {
                    setContentTitle(shortcutInfoCompat.getShortLabel());
                }
            }
            return this;
        }

        @NonNull
        public Builder setShowWhen(boolean z11) {
            this.mShowWhen = z11;
            return this;
        }

        @NonNull
        public Builder setSilent(boolean z11) {
            this.mSilent = z11;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public Builder setSmallIcon(@NonNull IconCompat iconCompat) {
            this.mSmallIcon = iconCompat.toIcon(this.mContext);
            return this;
        }

        @NonNull
        public Builder setSortKey(@Nullable String str) {
            this.mSortKey = str;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder usage = Api21Impl.setUsage(Api21Impl.setContentType(Api21Impl.createBuilder(), 4), 5);
            this.mNotification.audioAttributes = Api21Impl.build(usage);
            return this;
        }

        @NonNull
        public Builder setStyle(@Nullable Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        @NonNull
        public Builder setSubText(@Nullable CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTicker(@Nullable CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTimeoutAfter(long j11) {
            this.mTimeout = j11;
            return this;
        }

        @NonNull
        public Builder setUsesChronometer(boolean z11) {
            this.mUseChronometer = z11;
            return this;
        }

        @NonNull
        public Builder setVibrate(@Nullable long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        @NonNull
        public Builder setVisibility(int i11) {
            this.mVisibility = i11;
            return this;
        }

        @NonNull
        public Builder setWhen(long j11) {
            this.mNotification.when = j11;
            return this;
        }

        @NonNull
        public Builder addAction(@Nullable Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public Builder addInvisibleAction(@Nullable Action action) {
            if (action != null) {
                this.mInvisibleActions.add(action);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i11) {
            this.mNotification.icon = i11;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTicker(@Nullable CharSequence charSequence, @Nullable RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        @NonNull
        public Builder addPerson(@Nullable Person person) {
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i11, int i12) {
            Notification notification = this.mNotification;
            notification.icon = i11;
            notification.iconLevel = i12;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public Builder setLargeIcon(@Nullable Icon icon) {
            this.mLargeIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, int i11) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = i11;
            AudioAttributes.Builder legacyStreamType = Api21Impl.setLegacyStreamType(Api21Impl.setContentType(Api21Impl.createBuilder(), 4), i11);
            this.mNotification.audioAttributes = Api21Impl.build(legacyStreamType);
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mFgsDeferBehavior = 0;
            Notification notification = new Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        @Deprecated
        public Builder(@NonNull Context context) {
            this(context, (String) null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CallStyle extends Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;
        private static final String KEY_ACTION_PRIORITY = "key_action_priority";
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$CallStyle";
        private Integer mAnswerButtonColor;
        private PendingIntent mAnswerIntent;
        private int mCallType;
        private Integer mDeclineButtonColor;
        private PendingIntent mDeclineIntent;
        private PendingIntent mHangUpIntent;
        private boolean mIsVideo;
        private Person mPerson;
        private IconCompat mVerificationIcon;
        private CharSequence mVerificationText;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(20)
        public static class Api20Impl {
            private Api20Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            public static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            public static Notification.Action build(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static Notification.Action.Builder createActionBuilder(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i11, charSequence, pendingIntent);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(21)
        public static class Api21Impl {
            private Api21Impl() {
            }

            @DoNotInline
            public static Notification.Builder addPerson(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            @DoNotInline
            public static Notification.Builder setCategory(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z11) {
                return builder.setAllowGeneratedReplies(z11);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(31)
        public static class Api31Impl {
            private Api31Impl() {
            }

            @DoNotInline
            public static Notification.CallStyle forIncomingCall(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            public static Notification.CallStyle forOngoingCall(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            @DoNotInline
            public static Notification.CallStyle forScreeningCall(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            public static Notification.CallStyle setAnswerButtonColorHint(Notification.CallStyle callStyle, @ColorInt int i11) {
                return callStyle.setAnswerButtonColorHint(i11);
            }

            @DoNotInline
            public static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z11) {
                return builder.setAuthenticationRequired(z11);
            }

            @DoNotInline
            public static Notification.CallStyle setDeclineButtonColorHint(Notification.CallStyle callStyle, @ColorInt int i11) {
                return callStyle.setDeclineButtonColorHint(i11);
            }

            @DoNotInline
            public static Notification.CallStyle setIsVideo(Notification.CallStyle callStyle, boolean z11) {
                return callStyle.setIsVideo(z11);
            }

            @DoNotInline
            public static Notification.CallStyle setVerificationIcon(Notification.CallStyle callStyle, @Nullable Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            @DoNotInline
            public static Notification.CallStyle setVerificationText(Notification.CallStyle callStyle, @Nullable CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface CallType {
        }

        public CallStyle() {
        }

        @NonNull
        public static CallStyle forIncomingCall(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(1, person, null, pendingIntent, pendingIntent2);
        }

        @NonNull
        public static CallStyle forOngoingCall(@NonNull Person person, @NonNull PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new CallStyle(2, person, pendingIntent, null, null);
        }

        @NonNull
        public static CallStyle forScreeningCall(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(3, person, pendingIntent, null, pendingIntent2);
        }

        @Nullable
        private String getDefaultText() {
            int i11 = this.mCallType;
            if (i11 == 1) {
                return this.mBuilder.mContext.getResources().getString(R.string.call_notification_incoming_text);
            }
            if (i11 == 2) {
                return this.mBuilder.mContext.getResources().getString(R.string.call_notification_ongoing_text);
            }
            if (i11 != 3) {
                return null;
            }
            return this.mBuilder.mContext.getResources().getString(R.string.call_notification_screening_text);
        }

        private boolean isActionAddedByCallStyle(Action action) {
            return action != null && action.getExtras().getBoolean(KEY_ACTION_PRIORITY);
        }

        @NonNull
        @RequiresApi(20)
        private Action makeAction(int i11, int i12, Integer num, int i13, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(ContextCompat.getColor(this.mBuilder.mContext, i13));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mBuilder.mContext.getResources().getString(i12));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action build = new Action.Builder(IconCompat.createWithResource(this.mBuilder.mContext, i11), spannableStringBuilder, pendingIntent).build();
            build.getExtras().putBoolean(KEY_ACTION_PRIORITY, true);
            return build;
        }

        @Nullable
        @RequiresApi(20)
        private Action makeAnswerAction() {
            int i11 = R.drawable.ic_call_answer_video;
            int i12 = R.drawable.ic_call_answer;
            PendingIntent pendingIntent = this.mAnswerIntent;
            if (pendingIntent == null) {
                return null;
            }
            boolean z11 = this.mIsVideo;
            return makeAction(z11 ? i11 : i12, z11 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, this.mAnswerButtonColor, R.color.call_notification_answer_color, pendingIntent);
        }

        @NonNull
        @RequiresApi(20)
        private Action makeNegativeAction() {
            int i11 = R.drawable.ic_call_decline;
            PendingIntent pendingIntent = this.mDeclineIntent;
            return pendingIntent == null ? makeAction(i11, R.string.call_notification_hang_up_action, this.mDeclineButtonColor, R.color.call_notification_decline_color, this.mHangUpIntent) : makeAction(i11, R.string.call_notification_decline_action, this.mDeclineButtonColor, R.color.call_notification_decline_color, pendingIntent);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.mCallType);
            bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.mIsVideo);
            Person person = this.mPerson;
            if (person != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, Api28Impl.castToParcelable(person.toAndroidPerson()));
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON_COMPAT, person.toBundle());
                }
            }
            IconCompat iconCompat = this.mVerificationIcon;
            if (iconCompat != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, Api23Impl.castToParcelable(iconCompat.toIcon(this.mBuilder.mContext)));
            }
            bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.mVerificationText);
            bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.mAnswerIntent);
            bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.mDeclineIntent);
            bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.mHangUpIntent);
            Integer num = this.mAnswerButtonColor;
            if (num != null) {
                bundle.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
            }
            Integer num2 = this.mDeclineButtonColor;
            if (num2 != null) {
                bundle.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r2 = null;
            Notification.CallStyle forIncomingCall = null;
            charSequence = null;
            if (i11 < 31) {
                Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
                Person person = this.mPerson;
                builder.setContentTitle(person != null ? person.getName() : null);
                Bundle bundle = this.mBuilder.mExtras;
                if (bundle != null && bundle.containsKey(NotificationCompat.EXTRA_TEXT)) {
                    charSequence = this.mBuilder.mExtras.getCharSequence(NotificationCompat.EXTRA_TEXT);
                }
                if (charSequence == null) {
                    charSequence = getDefaultText();
                }
                builder.setContentText(charSequence);
                Person person2 = this.mPerson;
                if (person2 != null) {
                    if (person2.getIcon() != null) {
                        Api23Impl.setLargeIcon(builder, this.mPerson.getIcon().toIcon(this.mBuilder.mContext));
                    }
                    if (i11 >= 28) {
                        Api28Impl.addPerson(builder, this.mPerson.toAndroidPerson());
                    } else {
                        Api21Impl.addPerson(builder, this.mPerson.getUri());
                    }
                }
                Api21Impl.setCategory(builder, NotificationCompat.CATEGORY_CALL);
                return;
            }
            int i12 = this.mCallType;
            if (i12 == 1) {
                forIncomingCall = Api31Impl.forIncomingCall(this.mPerson.toAndroidPerson(), this.mDeclineIntent, this.mAnswerIntent);
            } else if (i12 == 2) {
                forIncomingCall = Api31Impl.forOngoingCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent);
            } else if (i12 == 3) {
                forIncomingCall = Api31Impl.forScreeningCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent, this.mAnswerIntent);
            } else if (Log.isLoggable(NotificationCompat.TAG, 3)) {
                Log.d(NotificationCompat.TAG, "Unrecognized call type in CallStyle: " + String.valueOf(this.mCallType));
            }
            if (forIncomingCall != null) {
                forIncomingCall.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
                Integer num = this.mAnswerButtonColor;
                if (num != null) {
                    Api31Impl.setAnswerButtonColorHint(forIncomingCall, num.intValue());
                }
                Integer num2 = this.mDeclineButtonColor;
                if (num2 != null) {
                    Api31Impl.setDeclineButtonColorHint(forIncomingCall, num2.intValue());
                }
                Api31Impl.setVerificationText(forIncomingCall, this.mVerificationText);
                IconCompat iconCompat = this.mVerificationIcon;
                if (iconCompat != null) {
                    Api31Impl.setVerificationIcon(forIncomingCall, iconCompat.toIcon(this.mBuilder.mContext));
                }
                Api31Impl.setIsVideo(forIncomingCall, this.mIsVideo);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @NonNull
        @RequiresApi(20)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> getActionsListWithSystemActions() {
            Action makeNegativeAction = makeNegativeAction();
            Action makeAnswerAction = makeAnswerAction();
            ArrayList<Action> arrayList = new ArrayList<>(3);
            arrayList.add(makeNegativeAction);
            ArrayList<Action> arrayList2 = this.mBuilder.mActions;
            int i11 = 2;
            if (arrayList2 != null) {
                for (Action action : arrayList2) {
                    if (action.isContextual()) {
                        arrayList.add(action);
                    } else if (!isActionAddedByCallStyle(action) && i11 > 1) {
                        arrayList.add(action);
                        i11--;
                    }
                    if (makeAnswerAction != null && i11 == 1) {
                        arrayList.add(makeAnswerAction);
                        i11--;
                    }
                }
            }
            if (makeAnswerAction != null && i11 >= 1) {
                arrayList.add(makeAnswerAction);
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mCallType = bundle.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.mIsVideo = bundle.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
                this.mPerson = Person.fromAndroidPerson(j.a(bundle.getParcelable(NotificationCompat.EXTRA_CALL_PERSON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.mPerson = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.mVerificationIcon = IconCompat.createFromIcon((Icon) bundle.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.mVerificationIcon = IconCompat.createFromBundle(bundle.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.mVerificationText = bundle.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.mAnswerIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.mDeclineIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.mHangUpIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            this.mAnswerButtonColor = bundle.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_ANSWER_COLOR)) : null;
            this.mDeclineButtonColor = bundle.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_DECLINE_COLOR)) : null;
        }

        @NonNull
        public CallStyle setAnswerButtonColorHint(@ColorInt int i11) {
            this.mAnswerButtonColor = Integer.valueOf(i11);
            return this;
        }

        @NonNull
        public CallStyle setDeclineButtonColorHint(@ColorInt int i11) {
            this.mDeclineButtonColor = Integer.valueOf(i11);
            return this;
        }

        @NonNull
        public CallStyle setIsVideo(boolean z11) {
            this.mIsVideo = z11;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public CallStyle setVerificationIcon(@Nullable Icon icon) {
            this.mVerificationIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        @NonNull
        public CallStyle setVerificationText(@Nullable CharSequence charSequence) {
            this.mVerificationText = charSequence;
            return this;
        }

        public CallStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @NonNull
        public CallStyle setVerificationIcon(@Nullable Bitmap bitmap) {
            this.mVerificationIcon = IconCompat.createWithBitmap(bitmap);
            return this;
        }

        private CallStyle(int i11, @NonNull Person person, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3) {
            if (person != null && !TextUtils.isEmpty(person.getName())) {
                this.mCallType = i11;
                this.mPerson = person;
                this.mAnswerIntent = pendingIntent3;
                this.mDeclineIntent = pendingIntent2;
                this.mHangUpIntent = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(23)
        public static class Api23Impl {
            private Api23Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder createActionBuilder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            @DoNotInline
            public static void setLargeIcon(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }

            @DoNotInline
            public static Parcelable castToParcelable(Icon icon) {
                return icon;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(28)
        public static class Api28Impl {
            private Api28Impl() {
            }

            @DoNotInline
            public static Notification.Builder addPerson(Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }

            @DoNotInline
            public static Parcelable castToParcelable(android.app.Person person) {
                return person;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DecoratedCustomViewStyle extends Style {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static Notification.Style createDecoratedCustomViewStyle() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        private RemoteViews createRemoteViews(RemoteViews remoteViews, boolean z11) {
            int min;
            int i11 = 0;
            RemoteViews applyStandardTemplate = applyStandardTemplate(true, R.layout.notification_template_custom_big, false);
            applyStandardTemplate.removeAllViews(R.id.actions);
            List<Action> nonContextualActions = getNonContextualActions(this.mBuilder.mActions);
            if (!z11 || nonContextualActions == null || (min = Math.min(nonContextualActions.size(), 3)) <= 0) {
                i11 = 8;
            } else {
                for (int i12 = 0; i12 < min; i12++) {
                    applyStandardTemplate.addView(R.id.actions, generateActionButton(nonContextualActions.get(i12)));
                }
            }
            applyStandardTemplate.setViewVisibility(R.id.actions, i11);
            applyStandardTemplate.setViewVisibility(R.id.action_divider, i11);
            buildIntoRemoteViews(applyStandardTemplate, remoteViews);
            return applyStandardTemplate;
        }

        private RemoteViews generateActionButton(Action action) {
            boolean z11 = action.actionIntent == null;
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), z11 ? R.layout.notification_action_tombstone : R.layout.notification_action);
            IconCompat iconCompat = action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewBitmap(R.id.action_image, createColoredBitmap(iconCompat, R.color.notification_action_color_filter));
            }
            remoteViews.setTextViewText(R.id.action_text, action.title);
            if (!z11) {
                remoteViews.setOnClickPendingIntent(R.id.action_container, action.actionIntent);
            }
            remoteViews.setContentDescription(R.id.action_container, action.title);
            return remoteViews;
        }

        private static List<Action> getNonContextualActions(List<Action> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Action action : list) {
                if (!action.isContextual()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(Api24Impl.createDecoratedCustomViewStyle());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Extender {
        @NonNull
        Builder extend(@NonNull Builder builder);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface GroupAlertBehavior {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NotificationVisibility {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ServiceNotificationBehavior {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface StreamType {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Style {
        CharSequence mBigContentTitle;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static void setChronometerCountDown(RemoteViews remoteViews, int i11, boolean z11) {
                remoteViews.setChronometerCountDown(i11, z11);
            }
        }

        private int calculateTopPadding() {
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float constrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - constrain) * dimensionPixelSize) + (constrain * dimensionPixelSize2));
        }

        private static float constrain(float f11, float f12, float f13) {
            return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
        }

        @Nullable
        public static Style constructCompatStyleByName(@Nullable String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new DecoratedCustomViewStyle();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new BigPictureStyle();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new CallStyle();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new InboxStyle();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new BigTextStyle();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new MessagingStyle();
                default:
                    return null;
            }
        }

        @Nullable
        private static Style constructCompatStyleByPlatformName(@Nullable String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new BigPictureStyle();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new BigTextStyle();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new InboxStyle();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new MessagingStyle();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new DecoratedCustomViewStyle();
            }
            return null;
        }

        @Nullable
        public static Style constructCompatStyleForBundle(@NonNull Bundle bundle) {
            Style constructCompatStyleByName = constructCompatStyleByName(bundle.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            return constructCompatStyleByName != null ? constructCompatStyleByName : (bundle.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) ? new MessagingStyle() : (bundle.containsKey(NotificationCompat.EXTRA_PICTURE) || bundle.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) ? new BigPictureStyle() : bundle.containsKey(NotificationCompat.EXTRA_BIG_TEXT) ? new BigTextStyle() : bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES) ? new InboxStyle() : bundle.containsKey(NotificationCompat.EXTRA_CALL_TYPE) ? new CallStyle() : constructCompatStyleByPlatformName(bundle.getString(NotificationCompat.EXTRA_TEMPLATE));
        }

        @Nullable
        public static Style constructStyleForExtras(@NonNull Bundle bundle) {
            Style constructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (constructCompatStyleForBundle == null) {
                return null;
            }
            try {
                constructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return constructCompatStyleForBundle;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap createIconWithBackground(int i11, int i12, int i13, int i14) {
            int i15 = R.drawable.notification_icon_background;
            if (i14 == 0) {
                i14 = 0;
            }
            Bitmap createColoredBitmap = createColoredBitmap(i15, i14, i12);
            Canvas canvas = new Canvas(createColoredBitmap);
            Drawable mutate = this.mBuilder.mContext.getResources().getDrawable(i11).mutate();
            mutate.setFilterBitmap(true);
            int i16 = (i12 - i13) / 2;
            int i17 = i13 + i16;
            mutate.setBounds(i16, i16, i17, i17);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return createColoredBitmap;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static Style extractStyleFromNotification(@NonNull Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return constructStyleForExtras(extras);
        }

        private void hideNormalContent(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x017a  */
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews applyStandardTemplate(boolean r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        @Nullable
        public Notification build() {
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            hideNormalContent(remoteViews);
            int i11 = R.id.notification_main_column;
            remoteViews.removeAllViews(i11);
            remoteViews.addView(i11, remoteViews2.clone());
            remoteViews.setViewVisibility(i11, 0);
            remoteViews.setViewPadding(R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            bundle.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap createColoredBitmap(int i11, int i12) {
            return createColoredBitmap(i11, i12, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return false;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.mSummaryText = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        public void setBuilder(@Nullable Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }

        public Bitmap createColoredBitmap(@NonNull IconCompat iconCompat, int i11) {
            return createColoredBitmap(iconCompat, i11, 0);
        }

        private Bitmap createColoredBitmap(int i11, int i12, int i13) {
            return createColoredBitmap(IconCompat.createWithResource(this.mBuilder.mContext, i11), i12, i13);
        }

        private Bitmap createColoredBitmap(@NonNull IconCompat iconCompat, int i11, int i12) {
            Drawable loadDrawable = iconCompat.loadDrawable(this.mBuilder.mContext);
            int intrinsicWidth = i12 == 0 ? loadDrawable.getIntrinsicWidth() : i12;
            if (i12 == 0) {
                i12 = loadDrawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i12, Bitmap.Config.ARGB_8888);
            loadDrawable.setBounds(0, 0, intrinsicWidth, i12);
            if (i11 != 0) {
                loadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            }
            loadDrawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class WearableExtender implements Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";

        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;

        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;

        @Deprecated
        public static final int SIZE_DEFAULT = 0;

        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;

        @Deprecated
        public static final int SIZE_LARGE = 4;

        @Deprecated
        public static final int SIZE_MEDIUM = 3;

        @Deprecated
        public static final int SIZE_SMALL = 2;

        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList<Action> mActions;
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(20)
        public static class Api20Impl {
            private Api20Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            public static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            public static Notification.Action build(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static Notification.Action.Builder createBuilder(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i11, charSequence, pendingIntent);
            }

            @DoNotInline
            public static Action getActionCompatFromAction(ArrayList<Parcelable> arrayList, int i11) {
                return NotificationCompat.getActionCompatFromAction((Notification.Action) arrayList.get(i11));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(23)
        public static class Api23Impl {
            private Api23Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder createBuilder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z11) {
                return builder.setAllowGeneratedReplies(z11);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(31)
        public static class Api31Impl {
            private Api31Impl() {
            }

            @DoNotInline
            public static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z11) {
                return builder.setAuthenticationRequired(z11);
            }
        }

        public WearableExtender() {
            this.mActions = new ArrayList<>();
            this.mFlags = 1;
            this.mPages = new ArrayList<>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
        }

        @RequiresApi(20)
        private static Notification.Action getActionFromActionCompat(Action action) {
            int i11 = Build.VERSION.SDK_INT;
            IconCompat iconCompat = action.getIconCompat();
            Notification.Action.Builder createBuilder = Api23Impl.createBuilder(iconCompat == null ? null : iconCompat.toIcon(), action.getTitle(), action.getActionIntent());
            Bundle bundle = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            Api24Impl.setAllowGeneratedReplies(createBuilder, action.getAllowGeneratedReplies());
            if (i11 >= 31) {
                Api31Impl.setAuthenticationRequired(createBuilder, action.isAuthenticationRequired());
            }
            Api20Impl.addExtras(createBuilder, bundle);
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (android.app.RemoteInput remoteInput : RemoteInput.fromCompat(remoteInputs)) {
                    Api20Impl.addRemoteInput(createBuilder, remoteInput);
                }
            }
            return Api20Impl.build(createBuilder);
        }

        private void setFlag(int i11, boolean z11) {
            if (z11) {
                this.mFlags = i11 | this.mFlags;
            } else {
                this.mFlags = (~i11) & this.mFlags;
            }
        }

        @NonNull
        public WearableExtender addAction(@NonNull Action action) {
            this.mActions.add(action);
            return this;
        }

        @NonNull
        public WearableExtender addActions(@NonNull List<Action> list) {
            this.mActions.addAll(list);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPage(@NonNull Notification notification) {
            this.mPages.add(notification);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPages(@NonNull List<Notification> list) {
            this.mPages.addAll(list);
            return this;
        }

        @NonNull
        public WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            if (!this.mActions.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.mActions.size());
                Iterator<Action> it = this.mActions.iterator();
                while (it.hasNext()) {
                    arrayList.add(getActionFromActionCompat(it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i11 = this.mFlags;
            if (i11 != 1) {
                bundle.putInt(KEY_FLAGS, i11);
            }
            PendingIntent pendingIntent = this.mDisplayIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(KEY_DISPLAY_INTENT, pendingIntent);
            }
            if (!this.mPages.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.mPages;
                bundle.putParcelableArray(KEY_PAGES, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.mBackground;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i12 = this.mContentIcon;
            if (i12 != 0) {
                bundle.putInt(KEY_CONTENT_ICON, i12);
            }
            int i13 = this.mContentIconGravity;
            if (i13 != 8388613) {
                bundle.putInt(KEY_CONTENT_ICON_GRAVITY, i13);
            }
            int i14 = this.mContentActionIndex;
            if (i14 != -1) {
                bundle.putInt(KEY_CONTENT_ACTION_INDEX, i14);
            }
            int i15 = this.mCustomSizePreset;
            if (i15 != 0) {
                bundle.putInt(KEY_CUSTOM_SIZE_PRESET, i15);
            }
            int i16 = this.mCustomContentHeight;
            if (i16 != 0) {
                bundle.putInt(KEY_CUSTOM_CONTENT_HEIGHT, i16);
            }
            int i17 = this.mGravity;
            if (i17 != 80) {
                bundle.putInt(KEY_GRAVITY, i17);
            }
            int i18 = this.mHintScreenTimeout;
            if (i18 != 0) {
                bundle.putInt(KEY_HINT_SCREEN_TIMEOUT, i18);
            }
            String str = this.mDismissalId;
            if (str != null) {
                bundle.putString(KEY_DISMISSAL_ID, str);
            }
            String str2 = this.mBridgeTag;
            if (str2 != null) {
                bundle.putString(KEY_BRIDGE_TAG, str2);
            }
            builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
            return builder;
        }

        @NonNull
        public List<Action> getActions() {
            return this.mActions;
        }

        @Nullable
        @Deprecated
        public Bitmap getBackground() {
            return this.mBackground;
        }

        @Nullable
        public String getBridgeTag() {
            return this.mBridgeTag;
        }

        public int getContentAction() {
            return this.mContentActionIndex;
        }

        @Deprecated
        public int getContentIcon() {
            return this.mContentIcon;
        }

        @Deprecated
        public int getContentIconGravity() {
            return this.mContentIconGravity;
        }

        public boolean getContentIntentAvailableOffline() {
            return (this.mFlags & 1) != 0;
        }

        @Deprecated
        public int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }

        @Deprecated
        public int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }

        @Nullable
        public String getDismissalId() {
            return this.mDismissalId;
        }

        @Nullable
        @Deprecated
        public PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }

        @Deprecated
        public int getGravity() {
            return this.mGravity;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            return (this.mFlags & 32) != 0;
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            return (this.mFlags & 16) != 0;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            return (this.mFlags & 64) != 0;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            return (this.mFlags & 2) != 0;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            return (this.mFlags & 4) != 0;
        }

        @NonNull
        @Deprecated
        public List<Notification> getPages() {
            return this.mPages;
        }

        public boolean getStartScrollBottom() {
            return (this.mFlags & 8) != 0;
        }

        @NonNull
        @Deprecated
        public WearableExtender setBackground(@Nullable Bitmap bitmap) {
            this.mBackground = bitmap;
            return this;
        }

        @NonNull
        public WearableExtender setBridgeTag(@Nullable String str) {
            this.mBridgeTag = str;
            return this;
        }

        @NonNull
        public WearableExtender setContentAction(int i11) {
            this.mContentActionIndex = i11;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIcon(int i11) {
            this.mContentIcon = i11;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIconGravity(int i11) {
            this.mContentIconGravity = i11;
            return this;
        }

        @NonNull
        public WearableExtender setContentIntentAvailableOffline(boolean z11) {
            setFlag(1, z11);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomContentHeight(int i11) {
            this.mCustomContentHeight = i11;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomSizePreset(int i11) {
            this.mCustomSizePreset = i11;
            return this;
        }

        @NonNull
        public WearableExtender setDismissalId(@Nullable String str) {
            this.mDismissalId = str;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setDisplayIntent(@Nullable PendingIntent pendingIntent) {
            this.mDisplayIntent = pendingIntent;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setGravity(int i11) {
            this.mGravity = i11;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean z11) {
            setFlag(32, z11);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean z11) {
            setFlag(16, z11);
            return this;
        }

        @NonNull
        public WearableExtender setHintContentIntentLaunchesActivity(boolean z11) {
            setFlag(64, z11);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintHideIcon(boolean z11) {
            setFlag(2, z11);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintScreenTimeout(int i11) {
            this.mHintScreenTimeout = i11;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean z11) {
            setFlag(4, z11);
            return this;
        }

        @NonNull
        public WearableExtender setStartScrollBottom(boolean z11) {
            setFlag(8, z11);
            return this;
        }

        @NonNull
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public WearableExtender m5602clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.mActions = new ArrayList<>(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mDisplayIntent = this.mDisplayIntent;
            wearableExtender.mPages = new ArrayList<>(this.mPages);
            wearableExtender.mBackground = this.mBackground;
            wearableExtender.mContentIcon = this.mContentIcon;
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mCustomSizePreset = this.mCustomSizePreset;
            wearableExtender.mCustomContentHeight = this.mCustomContentHeight;
            wearableExtender.mGravity = this.mGravity;
            wearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
            wearableExtender.mDismissalId = this.mDismissalId;
            wearableExtender.mBridgeTag = this.mBridgeTag;
            return wearableExtender;
        }

        public WearableExtender(@NonNull Notification notification) {
            this.mActions = new ArrayList<>();
            this.mFlags = 1;
            this.mPages = new ArrayList<>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
            Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle = extras != null ? extras.getBundle(EXTRA_WEARABLE_EXTENSIONS) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    Action[] actionArr = new Action[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        actionArr[i11] = Api20Impl.getActionCompatFromAction(parcelableArrayList, i11);
                    }
                    Collections.addAll(this.mActions, actionArr);
                }
                this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                this.mDisplayIntent = (PendingIntent) bundle.getParcelable(KEY_DISPLAY_INTENT);
                Notification[] notificationArrayFromBundle = NotificationCompat.getNotificationArrayFromBundle(bundle, KEY_PAGES);
                if (notificationArrayFromBundle != null) {
                    Collections.addAll(this.mPages, notificationArrayFromBundle);
                }
                this.mBackground = (Bitmap) bundle.getParcelable("background");
                this.mContentIcon = bundle.getInt(KEY_CONTENT_ICON);
                this.mContentIconGravity = bundle.getInt(KEY_CONTENT_ICON_GRAVITY, 8388613);
                this.mContentActionIndex = bundle.getInt(KEY_CONTENT_ACTION_INDEX, -1);
                this.mCustomSizePreset = bundle.getInt(KEY_CUSTOM_SIZE_PRESET, 0);
                this.mCustomContentHeight = bundle.getInt(KEY_CUSTOM_CONTENT_HEIGHT);
                this.mGravity = bundle.getInt(KEY_GRAVITY, 80);
                this.mHintScreenTimeout = bundle.getInt(KEY_HINT_SCREEN_TIMEOUT);
                this.mDismissalId = bundle.getString(KEY_DISMISSAL_ID);
                this.mBridgeTag = bundle.getString(KEY_BRIDGE_TAG);
            }
        }
    }

    @Deprecated
    public NotificationCompat() {
    }

    @Nullable
    public static Action getAction(@NonNull Notification notification, int i11) {
        return getActionCompatFromAction(notification.actions[i11]);
    }

    @NonNull
    @RequiresApi(20)
    public static Action getActionCompatFromAction(@NonNull Notification.Action action) {
        RemoteInput[] remoteInputArr;
        int i11;
        android.app.RemoteInput[] remoteInputs = Api20Impl.getRemoteInputs(action);
        if (remoteInputs == null) {
            remoteInputArr = null;
        } else {
            RemoteInput[] remoteInputArr2 = new RemoteInput[remoteInputs.length];
            for (int i12 = 0; i12 < remoteInputs.length; i12++) {
                android.app.RemoteInput remoteInput = remoteInputs[i12];
                remoteInputArr2[i12] = new RemoteInput(Api20Impl.getResultKey(remoteInput), Api20Impl.getLabel(remoteInput), Api20Impl.getChoices(remoteInput), Api20Impl.getAllowFreeFormInput(remoteInput), Build.VERSION.SDK_INT >= 29 ? Api29Impl.getEditChoicesBeforeSending(remoteInput) : 0, Api20Impl.getExtras(remoteInput), null);
            }
            remoteInputArr = remoteInputArr2;
        }
        int i13 = Build.VERSION.SDK_INT;
        boolean z11 = Api20Impl.getExtras(action).getBoolean("android.support.allowGeneratedReplies") || Api24Impl.getAllowGeneratedReplies(action);
        boolean z12 = Api20Impl.getExtras(action).getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = i13 >= 28 ? Api28Impl.getSemanticAction(action) : Api20Impl.getExtras(action).getInt("android.support.action.semanticAction", 0);
        boolean isContextual = i13 >= 29 ? Api29Impl.isContextual(action) : false;
        boolean isAuthenticationRequired = i13 >= 31 ? Api31Impl.isAuthenticationRequired(action) : false;
        if (Api23Impl.getIcon(action) != null || (i11 = action.icon) == 0) {
            return new Action(Api23Impl.getIcon(action) != null ? IconCompat.createFromIconOrNullIfZeroResId(Api23Impl.getIcon(action)) : null, action.title, action.actionIntent, Api20Impl.getExtras(action), remoteInputArr, (RemoteInput[]) null, z11, semanticAction, z12, isContextual, isAuthenticationRequired);
        }
        return new Action(i11, action.title, action.actionIntent, Api20Impl.getExtras(action), remoteInputArr, (RemoteInput[]) null, z11, semanticAction, z12, isContextual, isAuthenticationRequired);
    }

    public static int getActionCount(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getAllowSystemGeneratedContextualActions(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getBadgeIconType(notification);
        }
        return 0;
    }

    @Nullable
    public static BubbleMetadata getBubbleMetadata(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BubbleMetadata.fromPlatform(Api29Impl.getBubbleMetadata(notification));
        }
        return null;
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getChannelId(notification);
        }
        return null;
    }

    public static int getColor(@NonNull Notification notification) {
        return notification.color;
    }

    @Nullable
    public static CharSequence getContentInfo(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    @Nullable
    public static CharSequence getContentText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    @Nullable
    public static CharSequence getContentTitle(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Nullable
    public static Bundle getExtras(@NonNull Notification notification) {
        return notification.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification) {
        return Api20Impl.getGroup(notification);
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getGroupAlertBehavior(notification);
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static boolean getHighPriority(@NonNull Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @NonNull
    @RequiresApi(21)
    public static List<Action> getInvisibleActions(@NonNull Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i11 = 0; i11 < bundle.size(); i11++) {
                arrayList.add(NotificationCompatJellybean.getActionFromBundle(bundle.getBundle(Integer.toString(i11))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @Nullable
    public static LocusIdCompat getLocusId(@NonNull Notification notification) {
        LocusId locusId;
        if (Build.VERSION.SDK_INT < 29 || (locusId = Api29Impl.getLocusId(notification)) == null) {
            return null;
        }
        return LocusIdCompat.toLocusIdCompat(locusId);
    }

    @NonNull
    public static Notification[] getNotificationArrayFromBundle(@NonNull Bundle bundle, @NonNull String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i11 = 0; i11 < parcelableArray.length; i11++) {
            notificationArr[i11] = (Notification) parcelableArray[i11];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @NonNull
    public static List<Person> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Person.fromAndroidPerson(j.a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new Person.Builder().setUri(str).build());
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getSettingsText(notification);
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getShortcutId(notification);
        }
        return null;
    }

    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return Api20Impl.getSortKey(notification);
    }

    @Nullable
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getTimeoutAfter(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @Nullable
    public static Bitmap reduceLargeIconSize(@NonNull Context context, @Nullable Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CarExtender implements Extender {

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(29)
        public static class Api29Impl {
            private Api29Impl() {
            }

            @DoNotInline
            public static int getEditChoicesBeforeSending(android.app.RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Deprecated
        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final RemoteInput mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class Builder {
                private long mLatestTimestamp;
                private final List<String> mMessages = new ArrayList();
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public Builder(@NonNull String str) {
                    this.mParticipant = str;
                }

                @NonNull
                public Builder addMessage(@Nullable String str) {
                    if (str != null) {
                        this.mMessages.add(str);
                    }
                    return this;
                }

                @NonNull
                public UnreadConversation build() {
                    List<String> list = this.mMessages;
                    return new UnreadConversation((String[]) list.toArray(new String[list.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, new String[]{this.mParticipant}, this.mLatestTimestamp);
                }

                @NonNull
                public Builder setLatestTimestamp(long j11) {
                    this.mLatestTimestamp = j11;
                    return this;
                }

                @NonNull
                public Builder setReadPendingIntent(@Nullable PendingIntent pendingIntent) {
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                @NonNull
                public Builder setReplyAction(@Nullable PendingIntent pendingIntent, @Nullable RemoteInput remoteInput) {
                    this.mRemoteInput = remoteInput;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }
            }

            public UnreadConversation(@Nullable String[] strArr, @Nullable RemoteInput remoteInput, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable String[] strArr2, long j11) {
                this.mMessages = strArr;
                this.mRemoteInput = remoteInput;
                this.mReadPendingIntent = pendingIntent2;
                this.mReplyPendingIntent = pendingIntent;
                this.mParticipants = strArr2;
                this.mLatestTimestamp = j11;
            }

            public long getLatestTimestamp() {
                return this.mLatestTimestamp;
            }

            @Nullable
            public String[] getMessages() {
                return this.mMessages;
            }

            @Nullable
            public String getParticipant() {
                String[] strArr = this.mParticipants;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @Nullable
            public String[] getParticipants() {
                return this.mParticipants;
            }

            @Nullable
            public PendingIntent getReadPendingIntent() {
                return this.mReadPendingIntent;
            }

            @Nullable
            public RemoteInput getRemoteInput() {
                return this.mRemoteInput;
            }

            @Nullable
            public PendingIntent getReplyPendingIntent() {
                return this.mReplyPendingIntent;
            }
        }

        public CarExtender() {
            this.mColor = 0;
        }

        @RequiresApi(21)
        private static Bundle getBundleForUnreadConversation(@NonNull UnreadConversation unreadConversation) {
            Bundle bundle = new Bundle();
            String str = (unreadConversation.getParticipants() == null || unreadConversation.getParticipants().length <= 1) ? null : unreadConversation.getParticipants()[0];
            int length = unreadConversation.getMessages().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i11 = 0; i11 < length; i11++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", unreadConversation.getMessages()[i11]);
                bundle2.putString(KEY_AUTHOR, str);
                parcelableArr[i11] = bundle2;
            }
            bundle.putParcelableArray(KEY_MESSAGES, parcelableArr);
            RemoteInput remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                RemoteInput.Builder createBuilder = Api20Impl.createBuilder(remoteInput.getResultKey());
                Api20Impl.setLabel(createBuilder, remoteInput.getLabel());
                Api20Impl.setChoices(createBuilder, remoteInput.getChoices());
                Api20Impl.setAllowFreeFormInput(createBuilder, remoteInput.getAllowFreeFormInput());
                Api20Impl.addExtras(createBuilder, remoteInput.getExtras());
                bundle.putParcelable(KEY_REMOTE_INPUT, Api20Impl.castToParcelable(Api20Impl.build(createBuilder)));
            }
            bundle.putParcelable(KEY_ON_REPLY, unreadConversation.getReplyPendingIntent());
            bundle.putParcelable(KEY_ON_READ, unreadConversation.getReadPendingIntent());
            bundle.putStringArray(KEY_PARTICIPANTS, unreadConversation.getParticipants());
            bundle.putLong("timestamp", unreadConversation.getLatestTimestamp());
            return bundle;
        }

        @RequiresApi(21)
        private static UnreadConversation getUnreadConversationFromBundle(@Nullable Bundle bundle) {
            String[] strArr;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_MESSAGES);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i11 = 0; i11 < length; i11++) {
                    Parcelable parcelable = parcelableArray[i11];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i11] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(KEY_ON_READ);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(KEY_ON_REPLY);
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) bundle.getParcelable(KEY_REMOTE_INPUT);
            String[] stringArray = bundle.getStringArray(KEY_PARTICIPANTS);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new UnreadConversation(strArr, remoteInput != null ? new RemoteInput(Api20Impl.getResultKey(remoteInput), Api20Impl.getLabel(remoteInput), Api20Impl.getChoices(remoteInput), Api20Impl.getAllowFreeFormInput(remoteInput), Build.VERSION.SDK_INT >= 29 ? Api29Impl.getEditChoicesBeforeSending(remoteInput) : 0, Api20Impl.getExtras(remoteInput), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.mLargeIcon;
            if (bitmap != null) {
                bundle.putParcelable(EXTRA_LARGE_ICON, bitmap);
            }
            int i11 = this.mColor;
            if (i11 != 0) {
                bundle.putInt(EXTRA_COLOR, i11);
            }
            UnreadConversation unreadConversation = this.mUnreadConversation;
            if (unreadConversation != null) {
                bundle.putBundle(EXTRA_CONVERSATION, getBundleForUnreadConversation(unreadConversation));
            }
            builder.getExtras().putBundle(EXTRA_CAR_EXTENDER, bundle);
            return builder;
        }

        @ColorInt
        public int getColor() {
            return this.mColor;
        }

        @Nullable
        public Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }

        @Nullable
        @Deprecated
        public UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }

        @NonNull
        public CarExtender setColor(@ColorInt int i11) {
            this.mColor = i11;
            return this;
        }

        @NonNull
        public CarExtender setLargeIcon(@Nullable Bitmap bitmap) {
            this.mLargeIcon = bitmap;
            return this;
        }

        @NonNull
        @Deprecated
        public CarExtender setUnreadConversation(@Nullable UnreadConversation unreadConversation) {
            this.mUnreadConversation = unreadConversation;
            return this;
        }

        public CarExtender(@NonNull Notification notification) {
            this.mColor = 0;
            Bundle bundle = NotificationCompat.getExtras(notification) == null ? null : NotificationCompat.getExtras(notification).getBundle(EXTRA_CAR_EXTENDER);
            if (bundle != null) {
                this.mLargeIcon = (Bitmap) bundle.getParcelable(EXTRA_LARGE_ICON);
                this.mColor = bundle.getInt(EXTRA_COLOR, 0);
                this.mUnreadConversation = getUnreadConversationFromBundle(bundle.getBundle(EXTRA_CONVERSATION));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(20)
        public static class Api20Impl {
            private Api20Impl() {
            }

            @DoNotInline
            public static RemoteInput.Builder addExtras(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            public static android.app.RemoteInput build(RemoteInput.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static RemoteInput.Builder createBuilder(String str) {
                return new RemoteInput.Builder(str);
            }

            @DoNotInline
            public static boolean getAllowFreeFormInput(android.app.RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            @DoNotInline
            public static CharSequence[] getChoices(android.app.RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            @DoNotInline
            public static Bundle getExtras(android.app.RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            @DoNotInline
            public static CharSequence getLabel(android.app.RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            @DoNotInline
            public static String getResultKey(android.app.RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            @DoNotInline
            public static RemoteInput.Builder setAllowFreeFormInput(RemoteInput.Builder builder, boolean z11) {
                return builder.setAllowFreeFormInput(z11);
            }

            @DoNotInline
            public static RemoteInput.Builder setChoices(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            @DoNotInline
            public static RemoteInput.Builder setLabel(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }

            @DoNotInline
            public static Parcelable castToParcelable(android.app.RemoteInput remoteInput) {
                return remoteInput;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class InboxStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> mTexts = new ArrayList<>();

        public InboxStyle() {
        }

        @NonNull
        public InboxStyle addLine(@Nullable CharSequence charSequence) {
            if (charSequence != null) {
                this.mTexts.add(Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            Iterator<CharSequence> it = this.mTexts.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mTexts.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.mTexts, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        @NonNull
        public InboxStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public InboxStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public InboxStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TvExtender implements Extender {
        static final String EXTRA_CHANNEL_ID = "channel_id";
        static final String EXTRA_CONTENT_INTENT = "content_intent";
        static final String EXTRA_DELETE_INTENT = "delete_intent";

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        private static final String EXTRA_FLAGS = "flags";
        static final String EXTRA_SUPPRESS_SHOW_OVER_APPS = "suppressShowOverApps";

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String EXTRA_TV_EXTENDER = "android.tv.EXTENSIONS";
        private static final int FLAG_AVAILABLE_ON_TV = 1;
        private static final String TAG = "TvExtender";
        private String mChannelId;
        private PendingIntent mContentIntent;
        private PendingIntent mDeleteIntent;
        private int mFlags;
        private boolean mSuppressShowOverApps;

        public TvExtender() {
            this.mFlags = 1;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            if (Build.VERSION.SDK_INT < 26) {
                return builder;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(EXTRA_FLAGS, this.mFlags);
            bundle.putString(EXTRA_CHANNEL_ID, this.mChannelId);
            bundle.putBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS, this.mSuppressShowOverApps);
            PendingIntent pendingIntent = this.mContentIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(EXTRA_CONTENT_INTENT, pendingIntent);
            }
            PendingIntent pendingIntent2 = this.mDeleteIntent;
            if (pendingIntent2 != null) {
                bundle.putParcelable(EXTRA_DELETE_INTENT, pendingIntent2);
            }
            builder.getExtras().putBundle(EXTRA_TV_EXTENDER, bundle);
            return builder;
        }

        @Nullable
        public String getChannelId() {
            return this.mChannelId;
        }

        @Nullable
        public PendingIntent getContentIntent() {
            return this.mContentIntent;
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        public boolean isAvailableOnTv() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isSuppressShowOverApps() {
            return this.mSuppressShowOverApps;
        }

        @NonNull
        public TvExtender setChannelId(@Nullable String str) {
            this.mChannelId = str;
            return this;
        }

        @NonNull
        public TvExtender setContentIntent(@Nullable PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        @NonNull
        public TvExtender setDeleteIntent(@Nullable PendingIntent pendingIntent) {
            this.mDeleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public TvExtender setSuppressShowOverApps(boolean z11) {
            this.mSuppressShowOverApps = z11;
            return this;
        }

        public TvExtender(@NonNull Notification notification) {
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle(EXTRA_TV_EXTENDER);
            if (bundle2 != null) {
                this.mFlags = bundle2.getInt(EXTRA_FLAGS);
                this.mChannelId = bundle2.getString(EXTRA_CHANNEL_ID);
                this.mSuppressShowOverApps = bundle2.getBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS);
                this.mContentIntent = (PendingIntent) bundle2.getParcelable(EXTRA_CONTENT_INTENT);
                this.mDeleteIntent = (PendingIntent) bundle2.getParcelable(EXTRA_DELETE_INTENT);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MessagingStyle extends Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";

        @Nullable
        private CharSequence mConversationTitle;

        @Nullable
        private Boolean mIsGroupConversation;
        private Person mUser;
        private final List<Message> mMessages = new ArrayList();
        private final List<Message> mHistoricMessages = new ArrayList();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(24)
        public static class Api24Impl {
            private Api24Impl() {
            }

            @DoNotInline
            public static Notification.MessagingStyle addMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            @DoNotInline
            public static Notification.MessagingStyle createMessagingStyle(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            @DoNotInline
            public static Notification.MessagingStyle setConversationTitle(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(26)
        public static class Api26Impl {
            private Api26Impl() {
            }

            @DoNotInline
            public static Notification.MessagingStyle addHistoricMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(28)
        public static class Api28Impl {
            private Api28Impl() {
            }

            @DoNotInline
            public static Notification.MessagingStyle createMessagingStyle(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            @DoNotInline
            public static Notification.MessagingStyle setGroupConversation(Notification.MessagingStyle messagingStyle, boolean z11) {
                return messagingStyle.setGroupConversation(z11);
            }
        }

        public MessagingStyle() {
        }

        @Nullable
        public static MessagingStyle extractMessagingStyleFromNotification(@NonNull Notification notification) {
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            if (extractStyleFromNotification instanceof MessagingStyle) {
                return (MessagingStyle) extractStyleFromNotification;
            }
            return null;
        }

        @Nullable
        private Message findLatestIncomingMessage() {
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message = this.mMessages.get(size);
                if (message.getPerson() != null && !TextUtils.isEmpty(message.getPerson().getName())) {
                    return message;
                }
            }
            if (this.mMessages.isEmpty()) {
                return null;
            }
            return this.mMessages.get(r0.size() - 1);
        }

        private boolean hasMessagesWithoutSender() {
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message = this.mMessages.get(size);
                if (message.getPerson() != null && message.getPerson().getName() == null) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        private TextAppearanceSpan makeFontColorSpan(int i11) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i11), null);
        }

        private CharSequence makeMessageLine(@NonNull Message message) {
            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence name = message.getPerson() == null ? "" : message.getPerson().getName();
            int i11 = -16777216;
            if (TextUtils.isEmpty(name)) {
                name = this.mUser.getName();
                if (this.mBuilder.getColor() != 0) {
                    i11 = this.mBuilder.getColor();
                }
            }
            CharSequence unicodeWrap = bidiFormatter.unicodeWrap(name);
            spannableStringBuilder.append(unicodeWrap);
            spannableStringBuilder.setSpan(makeFontColorSpan(i11), spannableStringBuilder.length() - unicodeWrap.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) GlideException.a.f28776d).append(bidiFormatter.unicodeWrap(message.getText() != null ? message.getText() : ""));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.mUser.getName());
            bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.mUser.toBundle());
            bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.mConversationTitle);
            if (this.mConversationTitle != null && this.mIsGroupConversation.booleanValue()) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.mConversationTitle);
            }
            if (!this.mMessages.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, Message.getBundleArrayForMessages(this.mMessages));
            }
            if (!this.mHistoricMessages.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, Message.getBundleArrayForMessages(this.mHistoricMessages));
            }
            Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @NonNull
        public MessagingStyle addHistoricMessage(@Nullable Message message) {
            if (message != null) {
                this.mHistoricMessages.add(message);
                if (this.mHistoricMessages.size() > 25) {
                    this.mHistoricMessages.remove(0);
                }
            }
            return this;
        }

        @NonNull
        @Deprecated
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j11, @Nullable CharSequence charSequence2) {
            this.mMessages.add(new Message(charSequence, j11, new Person.Builder().setName(charSequence2).build()));
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            setGroupConversation(isGroupConversation());
            Notification.MessagingStyle createMessagingStyle = Build.VERSION.SDK_INT >= 28 ? Api28Impl.createMessagingStyle(this.mUser.toAndroidPerson()) : Api24Impl.createMessagingStyle(this.mUser.getName());
            Iterator<Message> it = this.mMessages.iterator();
            while (it.hasNext()) {
                Api24Impl.addMessage(createMessagingStyle, it.next().toAndroidMessage());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<Message> it2 = this.mHistoricMessages.iterator();
                while (it2.hasNext()) {
                    Api26Impl.addHistoricMessage(createMessagingStyle, it2.next().toAndroidMessage());
                }
            }
            if (this.mIsGroupConversation.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                Api24Impl.setConversationTitle(createMessagingStyle, this.mConversationTitle);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Api28Impl.setGroupConversation(createMessagingStyle, this.mIsGroupConversation.booleanValue());
            }
            createMessagingStyle.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Nullable
        public CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }

        @NonNull
        public List<Message> getHistoricMessages() {
            return this.mHistoricMessages;
        }

        @NonNull
        public List<Message> getMessages() {
            return this.mMessages;
        }

        @NonNull
        public Person getUser() {
            return this.mUser;
        }

        @Nullable
        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.mUser.getName();
        }

        public boolean isGroupConversation() {
            Builder builder = this.mBuilder;
            if (builder != null && builder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.mIsGroupConversation == null) {
                return this.mConversationTitle != null;
            }
            Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mMessages.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.mUser = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.mUser = new Person.Builder().setName(bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.mConversationTitle = charSequence;
            if (charSequence == null) {
                this.mConversationTitle = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.mMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.mHistoricMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray2));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.mIsGroupConversation = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        @NonNull
        public MessagingStyle setConversationTitle(@Nullable CharSequence charSequence) {
            this.mConversationTitle = charSequence;
            return this;
        }

        @NonNull
        public MessagingStyle setGroupConversation(boolean z11) {
            this.mIsGroupConversation = Boolean.valueOf(z11);
            return this;
        }

        @Deprecated
        public MessagingStyle(@NonNull CharSequence charSequence) {
            this.mUser = new Person.Builder().setName(charSequence).build();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Message {
            static final String KEY_DATA_MIME_TYPE = "type";
            static final String KEY_DATA_URI = "uri";
            static final String KEY_EXTRAS_BUNDLE = "extras";
            static final String KEY_NOTIFICATION_PERSON = "sender_person";
            static final String KEY_PERSON = "person";
            static final String KEY_SENDER = "sender";
            static final String KEY_TEXT = "text";
            static final String KEY_TIMESTAMP = "time";

            @Nullable
            private String mDataMimeType;

            @Nullable
            private Uri mDataUri;
            private Bundle mExtras;

            @Nullable
            private final Person mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @RequiresApi(24)
            public static class Api24Impl {
                private Api24Impl() {
                }

                @DoNotInline
                public static Notification.MessagingStyle.Message createMessage(CharSequence charSequence, long j11, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j11, charSequence2);
                }

                @DoNotInline
                public static Notification.MessagingStyle.Message setData(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public Message(@Nullable CharSequence charSequence, long j11, @Nullable Person person) {
                this.mExtras = new Bundle();
                this.mText = charSequence;
                this.mTimestamp = j11;
                this.mPerson = person;
            }

            @NonNull
            public static Bundle[] getBundleArrayForMessages(@NonNull List<Message> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    bundleArr[i11] = list.get(i11).toBundle();
                }
                return bundleArr;
            }

            @Nullable
            public static Message getMessageFromBundle(@NonNull Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        Message message = new Message(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey(KEY_PERSON) ? Person.fromBundle(bundle.getBundle(KEY_PERSON)) : (!bundle.containsKey(KEY_NOTIFICATION_PERSON) || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new Person.Builder().setName(bundle.getCharSequence("sender")).build() : null : Person.fromAndroidPerson(j.a(bundle.getParcelable(KEY_NOTIFICATION_PERSON))));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            message.setData(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey(KEY_EXTRAS_BUNDLE)) {
                            message.getExtras().putAll(bundle.getBundle(KEY_EXTRAS_BUNDLE));
                        }
                        return message;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @NonNull
            public static List<Message> getMessagesFromBundleArray(@NonNull Parcelable[] parcelableArr) {
                Message messageFromBundle;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (messageFromBundle = getMessageFromBundle((Bundle) parcelable)) != null) {
                        arrayList.add(messageFromBundle);
                    }
                }
                return arrayList;
            }

            @NonNull
            private Bundle toBundle() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.mText;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.mTimestamp);
                Person person = this.mPerson;
                if (person != null) {
                    bundle.putCharSequence("sender", person.getName());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(KEY_NOTIFICATION_PERSON, Api28Impl.castToParcelable(this.mPerson.toAndroidPerson()));
                    } else {
                        bundle.putBundle(KEY_PERSON, this.mPerson.toBundle());
                    }
                }
                String str = this.mDataMimeType;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.mDataUri;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.mExtras;
                if (bundle2 != null) {
                    bundle.putBundle(KEY_EXTRAS_BUNDLE, bundle2);
                }
                return bundle;
            }

            @Nullable
            public String getDataMimeType() {
                return this.mDataMimeType;
            }

            @Nullable
            public Uri getDataUri() {
                return this.mDataUri;
            }

            @NonNull
            public Bundle getExtras() {
                return this.mExtras;
            }

            @Nullable
            public Person getPerson() {
                return this.mPerson;
            }

            @Nullable
            @Deprecated
            public CharSequence getSender() {
                Person person = this.mPerson;
                if (person == null) {
                    return null;
                }
                return person.getName();
            }

            @Nullable
            public CharSequence getText() {
                return this.mText;
            }

            public long getTimestamp() {
                return this.mTimestamp;
            }

            @NonNull
            public Message setData(@Nullable String str, @Nullable Uri uri) {
                this.mDataMimeType = str;
                this.mDataUri = uri;
                return this;
            }

            @NonNull
            @RequiresApi(24)
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public Notification.MessagingStyle.Message toAndroidMessage() {
                Notification.MessagingStyle.Message createMessage;
                Person person = getPerson();
                if (Build.VERSION.SDK_INT >= 28) {
                    createMessage = Api28Impl.createMessage(getText(), getTimestamp(), person != null ? person.toAndroidPerson() : null);
                } else {
                    createMessage = Api24Impl.createMessage(getText(), getTimestamp(), person != null ? person.getName() : null);
                }
                if (getDataMimeType() != null) {
                    Api24Impl.setData(createMessage, getDataMimeType(), getDataUri());
                }
                return createMessage;
            }

            @Deprecated
            public Message(@Nullable CharSequence charSequence, long j11, @Nullable CharSequence charSequence2) {
                this(charSequence, j11, new Person.Builder().setName(charSequence2).build());
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @RequiresApi(28)
            public static class Api28Impl {
                private Api28Impl() {
                }

                @DoNotInline
                public static Notification.MessagingStyle.Message createMessage(CharSequence charSequence, long j11, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j11, person);
                }

                @DoNotInline
                public static Parcelable castToParcelable(android.app.Person person) {
                    return person;
                }
            }
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j11, @Nullable Person person) {
            addMessage(new Message(charSequence, j11, person));
            return this;
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable Message message) {
            if (message != null) {
                this.mMessages.add(message);
                if (this.mMessages.size() > 25) {
                    this.mMessages.remove(0);
                }
            }
            return this;
        }

        public MessagingStyle(@NonNull Person person) {
            if (!TextUtils.isEmpty(person.getName())) {
                this.mUser = person;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }
}
