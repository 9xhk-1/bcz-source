package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComponentActivity$activityResultRegistry$1 extends ActivityResultRegistry {
    final /* synthetic */ ComponentActivity this$0;

    public ComponentActivity$activityResultRegistry$1(ComponentActivity componentActivity) {
        this.this$0 = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch$lambda$0(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i11, ActivityResultContract.SynchronousResult synchronousResult) {
        componentActivity$activityResultRegistry$1.dispatchResult(i11, synchronousResult.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch$lambda$1(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i11, IntentSender.SendIntentException sendIntentException) {
        componentActivity$activityResultRegistry$1.dispatchResult(i11, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, sendIntentException));
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public <I, O> void onLaunch(final int i11, ActivityResultContract<I, O> contract, I i12, ActivityOptionsCompat activityOptionsCompat) {
        Bundle bundle;
        final int i13;
        g0.p(contract, "contract");
        ComponentActivity componentActivity = this.this$0;
        final ActivityResultContract.SynchronousResult<O> synchronousResult = contract.getSynchronousResult(componentActivity, i12);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.h
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0(ComponentActivity$activityResultRegistry$1.this, i11, synchronousResult);
                }
            });
            return;
        }
        Intent createIntent = contract.createIntent(componentActivity, i12);
        if (createIntent.getExtras() != null) {
            Bundle extras = createIntent.getExtras();
            g0.m(extras);
            if (extras.getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (createIntent.hasExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
            bundle = createIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
            createIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
        } else {
            bundle = activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null;
        }
        Bundle bundle2 = bundle;
        if (g0.g(ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS, createIntent.getAction())) {
            String[] stringArrayExtra = createIntent.getStringArrayExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i11);
            return;
        }
        if (!g0.g(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST, createIntent.getAction())) {
            ActivityCompat.startActivityForResult(componentActivity, createIntent, i11, bundle2);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) createIntent.getParcelableExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
        try {
            g0.m(intentSenderRequest);
            i13 = i11;
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            i13 = i11;
        }
        try {
            ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i13, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
        } catch (IntentSender.SendIntentException e12) {
            e = e12;
            final IntentSender.SendIntentException sendIntentException = e;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.i
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity$activityResultRegistry$1.onLaunch$lambda$1(ComponentActivity$activityResultRegistry$1.this, i13, sendIntentException);
                }
            });
        }
    }
}
