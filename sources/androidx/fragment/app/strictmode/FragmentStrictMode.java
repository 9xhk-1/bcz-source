package androidx.fragment.app.strictmode;

import a00.l1;
import a00.r0;
import a00.w1;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FragmentStrictMode {

    @k
    private static final String TAG = "FragmentStrictMode";

    @k
    public static final FragmentStrictMode INSTANCE = new FragmentStrictMode();

    @k
    private static Policy defaultPolicy = Policy.LAX;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnViolationListener {
        void onViolation(@k Violation violation);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Policy {

        @k
        public static final Companion Companion = new Companion(null);

        @g
        @k
        public static final Policy LAX = new Policy(w1.k(), null, l1.z());

        @k
        private final Set<Flag> flags;

        @l
        private final OnViolationListener listener;

        @k
        private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Policy(@k Set<? extends Flag> flags, @l OnViolationListener onViolationListener, @k Map<String, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            g0.p(flags, "flags");
            g0.p(allowedViolations, "allowedViolations");
            this.flags = flags;
            this.listener = onViolationListener;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        @k
        public final Set<Flag> getFlags$fragment_release() {
            return this.flags;
        }

        @l
        public final OnViolationListener getListener$fragment_release() {
            return this.listener;
        }

        @k
        public final Map<String, Set<Class<? extends Violation>>> getMAllowedViolations$fragment_release() {
            return this.mAllowedViolations;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {

            @l
            private OnViolationListener listener;

            @k
            private final Set<Flag> flags = new LinkedHashSet();

            @k
            private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations = new LinkedHashMap();

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder allowViolation(@k Class<? extends Fragment> fragmentClass, @k Class<? extends Violation> violationClass) {
                g0.p(fragmentClass, "fragmentClass");
                g0.p(violationClass, "violationClass");
                String fragmentClassString = fragmentClass.getName();
                g0.o(fragmentClassString, "fragmentClassString");
                return allowViolation(fragmentClassString, violationClass);
            }

            @k
            public final Policy build() {
                if (this.listener == null && !this.flags.contains(Flag.PENALTY_DEATH)) {
                    penaltyLog();
                }
                return new Policy(this.flags, this.listener, this.mAllowedViolations);
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder detectFragmentReuse() {
                this.flags.add(Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder detectFragmentTagUsage() {
                this.flags.add(Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder detectRetainInstanceUsage() {
                this.flags.add(Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder detectSetUserVisibleHint() {
                this.flags.add(Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder detectTargetFragmentUsage() {
                this.flags.add(Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder detectWrongFragmentContainer() {
                this.flags.add(Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder detectWrongNestedHierarchy() {
                this.flags.add(Flag.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder penaltyDeath() {
                this.flags.add(Flag.PENALTY_DEATH);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder penaltyListener(@k OnViolationListener listener) {
                g0.p(listener, "listener");
                this.listener = listener;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder penaltyLog() {
                this.flags.add(Flag.PENALTY_LOG);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @k
            public final Builder allowViolation(@k String fragmentClass, @k Class<? extends Violation> violationClass) {
                g0.p(fragmentClass, "fragmentClass");
                g0.p(violationClass, "violationClass");
                Set<Class<? extends Violation>> set = this.mAllowedViolations.get(fragmentClass);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                set.add(violationClass);
                this.mAllowedViolations.put(fragmentClass, set);
                return this;
            }
        }
    }

    private FragmentStrictMode() {
    }

    private final Policy getNearestPolicy(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                g0.o(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    Policy strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    g0.m(strictModePolicy);
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    private final void handlePolicyViolation(final Policy policy, final Violation violation) {
        Fragment fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        if (policy.getFlags$fragment_release().contains(Flag.PENALTY_LOG)) {
            Log.d(TAG, "Policy violation in " + name, violation);
        }
        if (policy.getListener$fragment_release() != null) {
            runOnHostThread(fragment, new Runnable() { // from class: i.a
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.handlePolicyViolation$lambda$0(FragmentStrictMode.Policy.this, violation);
                }
            });
        }
        if (policy.getFlags$fragment_release().contains(Flag.PENALTY_DEATH)) {
            runOnHostThread(fragment, new Runnable() { // from class: i.b
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.handlePolicyViolation$lambda$1(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePolicyViolation$lambda$0(Policy policy, Violation violation) {
        g0.p(policy, "$policy");
        g0.p(violation, "$violation");
        policy.getListener$fragment_release().onViolation(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePolicyViolation$lambda$1(String str, Violation violation) {
        g0.p(violation, "$violation");
        Log.e(TAG, "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void logIfDebuggingEnabled(Violation violation) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onFragmentReuse(@k Fragment fragment, @k String previousFragmentId) {
        g0.p(fragment, "fragment");
        g0.p(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentReuseViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onFragmentTagUsage(@k Fragment fragment, @l ViewGroup viewGroup) {
        g0.p(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentTagUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onGetRetainInstanceUsage(@k Fragment fragment) {
        g0.p(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getRetainInstanceUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onGetTargetFragmentRequestCodeUsage(@k Fragment fragment) {
        g0.p(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentRequestCodeUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onGetTargetFragmentUsage(@k Fragment fragment) {
        g0.p(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onSetRetainInstanceUsage(@k Fragment fragment) {
        g0.p(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setRetainInstanceUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onSetTargetFragmentUsage(@k Fragment violatingFragment, @k Fragment targetFragment, int i11) {
        g0.p(violatingFragment, "violatingFragment");
        g0.p(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, i11);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setTargetFragmentUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(violatingFragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onSetUserVisibleHint(@k Fragment fragment, boolean z11) {
        g0.p(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z11);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setUserVisibleHintViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onWrongFragmentContainer(@k Fragment fragment, @k ViewGroup container) {
        g0.p(fragment, "fragment");
        g0.p(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(wrongFragmentContainerViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongFragmentContainerViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onWrongNestedHierarchy(@k Fragment fragment, @k Fragment expectedParentFragment, int i11) {
        g0.p(fragment, "fragment");
        g0.p(expectedParentFragment, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, i11);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(wrongNestedHierarchyViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_WRONG_NESTED_HIERARCHY) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongNestedHierarchyViolation);
        }
    }

    private final void runOnHostThread(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handler = fragment.getParentFragmentManager().getHost().getHandler();
        if (g0.g(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    private final boolean shouldHandlePolicyViolation(Policy policy, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        Set<Class<? extends Violation>> set = policy.getMAllowedViolations$fragment_release().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (g0.g(cls2.getSuperclass(), Violation.class) || !r0.a2(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    @k
    public final Policy getDefaultPolicy() {
        return defaultPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public final void onPolicyViolation(@k Violation violation) {
        g0.p(violation, "violation");
        logIfDebuggingEnabled(violation);
        Fragment fragment = violation.getFragment();
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), violation.getClass())) {
            handlePolicyViolation(nearestPolicy, violation);
        }
    }

    public final void setDefaultPolicy(@k Policy policy) {
        g0.p(policy, "<set-?>");
        defaultPolicy = policy;
    }
}
