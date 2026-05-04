package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalRoomApi
/* loaded from: classes3.dex */
public final class MultiInstanceInvalidationService extends Service {
    private int maxClientId;

    @m80.k
    private final Map<Integer, String> clientNames = new LinkedHashMap();

    @m80.k
    private final RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IMultiInstanceInvalidationCallback callback, Object cookie) {
            g0.p(callback, "callback");
            g0.p(cookie, "cookie");
            MultiInstanceInvalidationService.this.getClientNames$room_runtime_release().remove((Integer) cookie);
        }
    };

    @m80.k
    private final IMultiInstanceInvalidationService.Stub binder = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i11, String[] tables) {
            g0.p(tables, "tables");
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                String str = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(Integer.valueOf(i11));
                if (str == null) {
                    Log.w(Room.LOG_TAG, "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime_release().beginBroadcast();
                for (int i12 = 0; i12 < beginBroadcast; i12++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastCookie(i12);
                        g0.n(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(num);
                        if (i11 != intValue && g0.g(str, str2)) {
                            try {
                                multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastItem(i12).onInvalidation(tables);
                                g2 g2Var = g2.f100423a;
                            } catch (RemoteException e11) {
                                Log.w(Room.LOG_TAG, "Error invoking a remote callback", e11);
                            }
                        }
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                g2 g2Var2 = g2.f100423a;
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback callback, String str) {
            g0.p(callback, "callback");
            int i11 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                try {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId$room_runtime_release() + 1);
                    int maxClientId$room_runtime_release = multiInstanceInvalidationService.getMaxClientId$room_runtime_release();
                    if (multiInstanceInvalidationService.getCallbackList$room_runtime_release().register(callback, Integer.valueOf(maxClientId$room_runtime_release))) {
                        multiInstanceInvalidationService.getClientNames$room_runtime_release().put(Integer.valueOf(maxClientId$room_runtime_release), str);
                        i11 = maxClientId$room_runtime_release;
                    } else {
                        multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId$room_runtime_release() - 1);
                        multiInstanceInvalidationService.getMaxClientId$room_runtime_release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i11;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback callback, int i11) {
            g0.p(callback, "callback");
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().unregister(callback);
                multiInstanceInvalidationService.getClientNames$room_runtime_release().remove(Integer.valueOf(i11));
            }
        }
    };

    @m80.k
    public final RemoteCallbackList<IMultiInstanceInvalidationCallback> getCallbackList$room_runtime_release() {
        return this.callbackList;
    }

    @m80.k
    public final Map<Integer, String> getClientNames$room_runtime_release() {
        return this.clientNames;
    }

    public final int getMaxClientId$room_runtime_release() {
        return this.maxClientId;
    }

    @Override // android.app.Service
    @m80.k
    public IBinder onBind(@m80.k Intent intent) {
        g0.p(intent, "intent");
        return this.binder;
    }

    public final void setMaxClientId$room_runtime_release(int i11) {
        this.maxClientId = i11;
    }
}
