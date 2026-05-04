package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.a;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";

    @GuardedBy("sEnabledNotificationListenersLock")
    private static String sEnabledNotificationListeners;

    @GuardedBy("sLock")
    private static SideChannelManager sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();

    @GuardedBy("sEnabledNotificationListenersLock")
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static List<StatusBarNotification> getActiveNotifications(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        @DoNotInline
        public static int getCurrentInterruptionFilter(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static boolean areNotificationsEnabled(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        @DoNotInline
        public static int getImportance(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static void createNotificationChannel(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        @DoNotInline
        public static void createNotificationChannelGroup(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        @DoNotInline
        public static void createNotificationChannelGroups(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        @DoNotInline
        public static void createNotificationChannels(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        @DoNotInline
        public static void deleteNotificationChannel(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        @DoNotInline
        public static void deleteNotificationChannelGroup(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        @DoNotInline
        public static String getId(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @DoNotInline
        public static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        @DoNotInline
        public static List<NotificationChannelGroup> getNotificationChannelGroups(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        @DoNotInline
        public static List<NotificationChannel> getNotificationChannels(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }

        @DoNotInline
        public static String getId(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static NotificationChannelGroup getNotificationChannelGroup(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        public static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        @DoNotInline
        public static String getParentChannelId(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        public static boolean canUseFullScreenIntent(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface InterruptionFilter {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotifyTask implements Task {

        /* renamed from: id, reason: collision with root package name */
        final int f4259id;
        final Notification notif;
        final String packageName;
        final String tag;

        public NotifyTask(String str, int i11, String str2, Notification notification) {
            this.packageName = str;
            this.f4259id = i11;
            this.tag = str2;
            this.notif = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.a aVar) throws RemoteException {
            aVar.notify(this.packageName, this.f4259id, this.tag, this.notif);
        }

        @NonNull
        public String toString() {
            return "NotifyTask[packageName:" + this.packageName + ", id:" + this.f4259id + ", tag:" + this.tag + "]";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ServiceConnectedEvent {
        final ComponentName componentName;
        final IBinder iBinder;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.componentName = componentName;
            this.iBinder = iBinder;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SideChannelManager implements Handler.Callback, ServiceConnection {
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map<ComponentName, ListenerRecord> mRecordMap = new HashMap();
        private Set<String> mCachedEnabledPackages = new HashSet();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ListenerRecord {
            final ComponentName componentName;
            android.support.v4.app.a service;
            boolean bound = false;
            ArrayDeque<Task> taskQueue = new ArrayDeque<>();
            int retryCount = 0;

            public ListenerRecord(ComponentName componentName) {
                this.componentName = componentName;
            }
        }

        public SideChannelManager(Context context) {
            this.mContext = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper(), this);
        }

        private boolean ensureServiceBound(ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                return true;
            }
            boolean bindService = this.mContext.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(listenerRecord.componentName), this, 33);
            listenerRecord.bound = bindService;
            if (bindService) {
                listenerRecord.retryCount = 0;
            } else {
                Log.w(NotificationManagerCompat.TAG, "Unable to bind to listener " + listenerRecord.componentName);
                this.mContext.unbindService(this);
            }
            return listenerRecord.bound;
        }

        private void ensureServiceUnbound(ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                this.mContext.unbindService(this);
                listenerRecord.bound = false;
            }
            listenerRecord.service = null;
        }

        private void handleQueueTask(Task task) {
            updateListenerMap();
            for (ListenerRecord listenerRecord : this.mRecordMap.values()) {
                listenerRecord.taskQueue.add(task);
                processListenerQueue(listenerRecord);
            }
        }

        private void handleRetryListenerQueue(ComponentName componentName) {
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.service = a.b.asInterface(iBinder);
                listenerRecord.retryCount = 0;
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceDisconnected(ComponentName componentName) {
            ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                ensureServiceUnbound(listenerRecord);
            }
        }

        private void processListenerQueue(ListenerRecord listenerRecord) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Processing component " + listenerRecord.componentName + j2.O + listenerRecord.taskQueue.size() + " queued tasks");
            }
            if (listenerRecord.taskQueue.isEmpty()) {
                return;
            }
            if (!ensureServiceBound(listenerRecord) || listenerRecord.service == null) {
                scheduleListenerRetry(listenerRecord);
                return;
            }
            while (true) {
                Task peek = listenerRecord.taskQueue.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Sending task " + peek);
                    }
                    peek.send(listenerRecord.service);
                    listenerRecord.taskQueue.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Remote service has died: " + listenerRecord.componentName);
                    }
                } catch (RemoteException e11) {
                    Log.w(NotificationManagerCompat.TAG, "RemoteException communicating with " + listenerRecord.componentName, e11);
                }
            }
            if (listenerRecord.taskQueue.isEmpty()) {
                return;
            }
            scheduleListenerRetry(listenerRecord);
        }

        private void scheduleListenerRetry(ListenerRecord listenerRecord) {
            if (this.mHandler.hasMessages(3, listenerRecord.componentName)) {
                return;
            }
            int i11 = listenerRecord.retryCount;
            int i12 = i11 + 1;
            listenerRecord.retryCount = i12;
            if (i12 <= 6) {
                int i13 = (1 << i11) * 1000;
                if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                    Log.d(NotificationManagerCompat.TAG, "Scheduling retry for " + i13 + " ms");
                }
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3, listenerRecord.componentName), i13);
                return;
            }
            Log.w(NotificationManagerCompat.TAG, "Giving up on delivering " + listenerRecord.taskQueue.size() + " tasks to " + listenerRecord.componentName + " after " + listenerRecord.retryCount + " retries");
            listenerRecord.taskQueue.clear();
        }

        private void updateListenerMap() {
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
            if (enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
                return;
            }
            this.mCachedEnabledPackages = enabledListenerPackages;
            List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.mRecordMap.containsKey(componentName2)) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Adding listener record for " + componentName2);
                    }
                    this.mRecordMap.put(componentName2, new ListenerRecord(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, ListenerRecord>> it = this.mRecordMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, ListenerRecord> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Removing listener record for " + next.getKey());
                    }
                    ensureServiceUnbound(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                handleQueueTask((Task) message.obj);
                return true;
            }
            if (i11 == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                handleServiceConnected(serviceConnectedEvent.componentName, serviceConnectedEvent.iBinder);
                return true;
            }
            if (i11 == 2) {
                handleServiceDisconnected((ComponentName) message.obj);
                return true;
            }
            if (i11 != 3) {
                return false;
            }
            handleRetryListenerQueue((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Connected to service " + componentName);
            }
            this.mHandler.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Disconnected from service " + componentName);
            }
            this.mHandler.obtainMessage(2, componentName).sendToTarget();
        }

        public void queueTask(Task task) {
            this.mHandler.obtainMessage(0, task).sendToTarget();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Task {
        void send(android.support.v4.app.a aVar) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    @NonNull
    public static NotificationManagerCompat from(@NonNull Context context) {
        return new NotificationManagerCompat(context);
    }

    @NonNull
    public static Set<String> getEnabledListenerPackages(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                try {
                    if (!string.equals(sEnabledNotificationListeners)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(Task task) {
        synchronized (sLock) {
            try {
                if (sSideChannelManager == null) {
                    sSideChannelManager = new SideChannelManager(this.mContext.getApplicationContext());
                }
                sSideChannelManager.queueTask(task);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        return Api24Impl.areNotificationsEnabled(this.mNotificationManager);
    }

    public boolean canUseFullScreenIntent() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29) {
            return true;
        }
        return i11 < 34 ? this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : Api34Impl.canUseFullScreenIntent(this.mNotificationManager);
    }

    public void cancel(int i11) {
        cancel(null, i11);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(@NonNull NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.createNotificationChannel(this.mNotificationManager, notificationChannel);
        }
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.createNotificationChannelGroup(this.mNotificationManager, notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroups(@NonNull List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.createNotificationChannelGroups(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelGroupsCompat(@NonNull List<NotificationChannelGroupCompat> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<NotificationChannelGroupCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getNotificationChannelGroup());
        }
        Api26Impl.createNotificationChannelGroups(this.mNotificationManager, arrayList);
    }

    public void createNotificationChannels(@NonNull List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.createNotificationChannels(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelsCompat(@NonNull List<NotificationChannelCompat> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<NotificationChannelCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getNotificationChannel());
        }
        Api26Impl.createNotificationChannels(this.mNotificationManager, arrayList);
    }

    public void deleteNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.deleteNotificationChannel(this.mNotificationManager, str);
        }
    }

    public void deleteNotificationChannelGroup(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.deleteNotificationChannelGroup(this.mNotificationManager, str);
        }
    }

    public void deleteUnlistedNotificationChannels(@NonNull Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator<NotificationChannel> it = Api26Impl.getNotificationChannels(this.mNotificationManager).iterator();
            while (it.hasNext()) {
                NotificationChannel a11 = i.a(it.next());
                if (!collection.contains(Api26Impl.getId(a11)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(Api30Impl.getParentChannelId(a11)))) {
                    Api26Impl.deleteNotificationChannel(this.mNotificationManager, Api26Impl.getId(a11));
                }
            }
        }
    }

    @NonNull
    public List<StatusBarNotification> getActiveNotifications() {
        return Api23Impl.getActiveNotifications(this.mNotificationManager);
    }

    public int getCurrentInterruptionFilter() {
        return Api23Impl.getCurrentInterruptionFilter(this.mNotificationManager);
    }

    public int getImportance() {
        return Api24Impl.getImportance(this.mNotificationManager);
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getNotificationChannel(this.mNotificationManager, str);
        }
        return null;
    }

    @Nullable
    public NotificationChannelCompat getNotificationChannelCompat(@NonNull String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }

    @Nullable
    public NotificationChannelGroup getNotificationChannelGroup(@NonNull String str) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return Api28Impl.getNotificationChannelGroup(this.mNotificationManager, str);
        }
        if (i11 >= 26) {
            Iterator<NotificationChannelGroup> it = getNotificationChannelGroups().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup a11 = l.a(it.next());
                if (Api26Impl.getId(a11).equals(str)) {
                    return a11;
                }
            }
        }
        return null;
    }

    @Nullable
    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(@NonNull String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new NotificationChannelGroupCompat(notificationChannelGroup2);
            }
            return null;
        }
        if (i11 < 26 || (notificationChannelGroup = getNotificationChannelGroup(str)) == null) {
            return null;
        }
        return new NotificationChannelGroupCompat(notificationChannelGroup, getNotificationChannels());
    }

    @NonNull
    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.getNotificationChannelGroups(this.mNotificationManager) : Collections.EMPTY_LIST;
    }

    @NonNull
    public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                List<NotificationChannel> notificationChannels = i11 >= 28 ? Collections.EMPTY_LIST : getNotificationChannels();
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                Iterator<NotificationChannelGroup> it = notificationChannelGroups.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup a11 = l.a(it.next());
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new NotificationChannelGroupCompat(a11));
                    } else {
                        arrayList.add(new NotificationChannelGroupCompat(a11, notificationChannels));
                    }
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @NonNull
    public List<NotificationChannel> getNotificationChannels() {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.getNotificationChannels(this.mNotificationManager) : Collections.EMPTY_LIST;
    }

    @NonNull
    public List<NotificationChannelCompat> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                Iterator<NotificationChannel> it = notificationChannels.iterator();
                while (it.hasNext()) {
                    arrayList.add(new NotificationChannelCompat(i.a(it.next())));
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(int i11, @NonNull Notification notification) {
        notify(null, i11, notification);
    }

    public void cancel(@Nullable String str, int i11) {
        this.mNotificationManager.cancel(str, i11);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@Nullable String str, int i11, @NonNull Notification notification) {
        if (!useSideChannelForNotification(notification)) {
            this.mNotificationManager.notify(str, i11, notification);
        } else {
            pushSideChannelQueue(new NotifyTask(this.mContext.getPackageName(), i11, str, notification));
            this.mNotificationManager.cancel(str, i11);
        }
    }

    public void createNotificationChannel(@NonNull NotificationChannelCompat notificationChannelCompat) {
        createNotificationChannel(notificationChannelCompat.getNotificationChannel());
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroupCompat notificationChannelGroupCompat) {
        createNotificationChannelGroup(notificationChannelGroupCompat.getNotificationChannelGroup());
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getNotificationChannel(this.mNotificationManager, str, str2);
        }
        return getNotificationChannel(str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotificationWithIdAndTag {
        final int mId;
        Notification mNotification;
        final String mTag;

        public NotificationWithIdAndTag(@Nullable String str, int i11, @NonNull Notification notification) {
            this.mTag = str;
            this.mId = i11;
            this.mNotification = notification;
        }

        public NotificationWithIdAndTag(int i11, @NonNull Notification notification) {
            this(null, i11, notification);
        }
    }

    @VisibleForTesting
    public NotificationManagerCompat(@NonNull NotificationManager notificationManager, @NonNull Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    @Nullable
    public NotificationChannelCompat getNotificationChannelCompat(@NonNull String str, @NonNull String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CancelTask implements Task {
        final boolean all;

        /* renamed from: id, reason: collision with root package name */
        final int f4258id;
        final String packageName;
        final String tag;

        public CancelTask(String str) {
            this.packageName = str;
            this.f4258id = 0;
            this.tag = null;
            this.all = true;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.a aVar) throws RemoteException {
            if (this.all) {
                aVar.cancelAll(this.packageName);
            } else {
                aVar.cancel(this.packageName, this.f4258id, this.tag);
            }
        }

        @NonNull
        public String toString() {
            return "CancelTask[packageName:" + this.packageName + ", id:" + this.f4258id + ", tag:" + this.tag + ", all:" + this.all + "]";
        }

        public CancelTask(String str, int i11, String str2) {
            this.packageName = str;
            this.f4258id = i11;
            this.tag = str2;
            this.all = false;
        }
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@NonNull List<NotificationWithIdAndTag> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            NotificationWithIdAndTag notificationWithIdAndTag = list.get(i11);
            notify(notificationWithIdAndTag.mTag, notificationWithIdAndTag.mId, notificationWithIdAndTag.mNotification);
        }
    }
}
