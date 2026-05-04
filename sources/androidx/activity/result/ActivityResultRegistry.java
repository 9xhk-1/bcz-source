package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import kotlin.random.Random;
import m80.k;
import m80.l;
import q30.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,422:1\n123#2,2:423\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n*L\n380#1:423,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    @k
    private static final Companion Companion = new Companion(null);
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;

    @k
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    @k
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    @k
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    @k
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    @k
    private static final String LOG_TAG = "ActivityResultRegistry";

    @k
    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    @k
    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    @k
    private final Map<String, LifecycleContainer> keyToLifecycleContainers = new LinkedHashMap();

    @k
    private final List<String> launchedKeys = new ArrayList();

    @k
    private final transient Map<String, CallbackAndContract<?>> keyToCallback = new LinkedHashMap();

    @k
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    @k
    private final Bundle pendingResults = new Bundle();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CallbackAndContract<O> {

        @k
        private final ActivityResultCallback<O> callback;

        @k
        private final ActivityResultContract<?, O> contract;

        public CallbackAndContract(@k ActivityResultCallback<O> callback, @k ActivityResultContract<?, O> contract) {
            g0.p(callback, "callback");
            g0.p(contract, "contract");
            this.callback = callback;
            this.contract = contract;
        }

        @k
        public final ActivityResultCallback<O> getCallback() {
            return this.callback;
        }

        @k
        public final ActivityResultContract<?, O> getContract() {
            return this.contract;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n1855#2,2:423\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n*L\n402#1:423,2\n*E\n"})
    public static final class LifecycleContainer {

        @k
        private final Lifecycle lifecycle;

        @k
        private final List<LifecycleEventObserver> observers;

        public LifecycleContainer(@k Lifecycle lifecycle) {
            g0.p(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void addObserver(@k LifecycleEventObserver observer) {
            g0.p(observer, "observer");
            this.lifecycle.addObserver(observer);
            this.observers.add(observer);
        }

        public final void clearObservers() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.removeObserver((LifecycleEventObserver) it.next());
            }
            this.observers.clear();
        }

        @k
        public final Lifecycle getLifecycle() {
            return this.lifecycle;
        }
    }

    private final void bindRcKey(int i11, String str) {
        this.rcToKey.put(Integer.valueOf(i11), str);
        this.keyToRc.put(str, Integer.valueOf(i11));
    }

    private final <O> void doDispatch(String str, int i11, Intent intent, CallbackAndContract<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null || !this.launchedKeys.contains(str)) {
            this.parsedPendingResults.remove(str);
            this.pendingResults.putParcelable(str, new ActivityResult(i11, intent));
        } else {
            callbackAndContract.getCallback().onActivityResult(callbackAndContract.getContract().parseResult(i11, intent));
            this.launchedKeys.remove(str);
        }
    }

    private final int generateRandomNumber() {
        for (Number number : x.u(new x00.a<Integer>() { // from class: androidx.activity.result.ActivityResultRegistry$generateRandomNumber$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Integer invoke() {
                return Integer.valueOf(Random.Default.nextInt(2147418112) + 65536);
            }
        })) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        g0.p(lifecycleOwner, "<anonymous parameter 0>");
        g0.p(event, "event");
        if (Lifecycle.Event.ON_START != event) {
            if (Lifecycle.Event.ON_STOP == event) {
                activityResultRegistry.keyToCallback.remove(str);
                return;
            } else {
                if (Lifecycle.Event.ON_DESTROY == event) {
                    activityResultRegistry.unregister$activity_release(str);
                    return;
                }
                return;
            }
        }
        activityResultRegistry.keyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (activityResultRegistry.parsedPendingResults.containsKey(str)) {
            Object obj = activityResultRegistry.parsedPendingResults.get(str);
            activityResultRegistry.parsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(activityResultRegistry.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            activityResultRegistry.pendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
    }

    private final void registerKey(String str) {
        if (this.keyToRc.get(str) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), str);
    }

    @MainThread
    public final boolean dispatchResult(int i11, int i12, @l Intent intent) {
        String str = this.rcToKey.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        doDispatch(str, i12, intent, this.keyToCallback.get(str));
        return true;
    }

    @MainThread
    public abstract <I, O> void onLaunch(int i11, @k ActivityResultContract<I, O> activityResultContract, I i12, @l ActivityOptionsCompat activityOptionsCompat);

    public final void onRestoreInstanceState(@l Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS);
        if (bundle2 != null) {
            this.pendingResults.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str = stringArrayList.get(i11);
            if (this.keyToRc.containsKey(str)) {
                Integer remove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    x0.k(this.rcToKey).remove(remove);
                }
            }
            Integer num = integerArrayList.get(i11);
            g0.o(num, "rcs[i]");
            int intValue = num.intValue();
            String str2 = stringArrayList.get(i11);
            g0.o(str2, "keys[i]");
            bindRcKey(intValue, str2);
        }
    }

    public final void onSaveInstanceState(@k Bundle outState) {
        g0.p(outState, "outState");
        outState.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.launchedKeys));
        outState.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, new Bundle(this.pendingResults));
    }

    @k
    public final <I, O> ActivityResultLauncher<I> register(@k final String key, @k LifecycleOwner lifecycleOwner, @k final ActivityResultContract<I, O> contract, @k final ActivityResultCallback<O> callback) {
        g0.p(key, "key");
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(contract, "contract");
        g0.p(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registerKey(key);
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.activity.result.c
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                ActivityResultRegistry.register$lambda$1(ActivityResultRegistry.this, key, callback, contract, lifecycleOwner2, event);
            }
        });
        this.keyToLifecycleContainers.put(key, lifecycleContainer);
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry$register$2
            @Override // androidx.activity.result.ActivityResultLauncher
            public ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) contract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i11, ActivityOptionsCompat activityOptionsCompat) {
                Map map;
                List list;
                List list2;
                map = ActivityResultRegistry.this.keyToRc;
                Object obj = map.get(key);
                Object obj2 = contract;
                if (obj == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i11 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj).intValue();
                list = ActivityResultRegistry.this.launchedKeys;
                list.add(key);
                try {
                    ActivityResultRegistry.this.onLaunch(intValue, contract, i11, activityOptionsCompat);
                } catch (Exception e11) {
                    list2 = ActivityResultRegistry.this.launchedKeys;
                    list2.remove(key);
                    throw e11;
                }
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister$activity_release(key);
            }
        };
    }

    @MainThread
    public final void unregister$activity_release(@k String key) {
        Integer remove;
        g0.p(key, "key");
        if (!this.launchedKeys.contains(key) && (remove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(remove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + ((ActivityResult) BundleCompat.getParcelable(this.pendingResults, key, ActivityResult.class)));
            this.pendingResults.remove(key);
        }
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.keyToLifecycleContainers.remove(key);
        }
    }

    @MainThread
    public final <O> boolean dispatchResult(int i11, O o11) {
        String str = this.rcToKey.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.keyToCallback.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, o11);
            return true;
        }
        ActivityResultCallback<?> callback = callbackAndContract.getCallback();
        g0.n(callback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        callback.onActivityResult(o11);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final <I, O> ActivityResultLauncher<I> register(@k final String key, @k final ActivityResultContract<I, O> contract, @k ActivityResultCallback<O> callback) {
        g0.p(key, "key");
        g0.p(contract, "contract");
        g0.p(callback, "callback");
        registerKey(key);
        this.keyToCallback.put(key, new CallbackAndContract<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(this.pendingResults, key, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(key);
            callback.onActivityResult(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry$register$3
            @Override // androidx.activity.result.ActivityResultLauncher
            public ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) contract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i11, ActivityOptionsCompat activityOptionsCompat) {
                Map map;
                List list;
                List list2;
                map = ActivityResultRegistry.this.keyToRc;
                Object obj2 = map.get(key);
                Object obj3 = contract;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj3 + " and input " + i11 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                list = ActivityResultRegistry.this.launchedKeys;
                list.add(key);
                try {
                    ActivityResultRegistry.this.onLaunch(intValue, contract, i11, activityOptionsCompat);
                } catch (Exception e11) {
                    list2 = ActivityResultRegistry.this.launchedKeys;
                    list2.remove(key);
                    throw e11;
                }
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister$activity_release(key);
            }
        };
    }
}
