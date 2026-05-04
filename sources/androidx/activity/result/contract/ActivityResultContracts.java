package androidx.activity.result.contract;

import a00.a0;
import a00.h0;
import a00.k1;
import a00.l1;
import a00.r0;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import g10.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;
import yz.h1;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ActivityResultContracts {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@k Context context, @k Uri input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k Uri input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            g0.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public final Boolean parseResult(int i11, @l Intent intent) {
            return Boolean.valueOf(i11 == -1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class CreateDocument extends ActivityResultContract<String, Uri> {

        @k
        private final String mimeType;

        public CreateDocument(@k String mimeType) {
            g0.p(mimeType, "mimeType");
            this.mimeType = mimeType;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@k Context context, @k String input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k String input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", input);
            g0.o(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final Uri parseResult(int i11, @l Intent intent) {
            if (i11 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @n(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @w0(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public CreateDocument() {
            this("*/*");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@k Context context, @k String input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k String input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            g0.o(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final Uri parseResult(int i11, @l Intent intent) {
            if (i11 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {

        @k
        public static final Companion Companion = new Companion(null);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @k
            public final List<Uri> getClipDataUris$activity_release(@k Intent intent) {
                g0.p(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return h0.J();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i11 = 0; i11 < itemCount; i11++) {
                        Uri uri = clipData.getItemAt(i11).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            private Companion() {
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@k Context context, @k String input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k String input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            g0.o(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public final List<Uri> parseResult(int i11, @l Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i11 != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = Companion.getClipDataUris$activity_release(intent)) == null) ? h0.J() : clipDataUris$activity_release;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@k Context context, @k String[] input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k String[] input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            g0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final Uri parseResult(int i11, @l Intent intent) {
            if (i11 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    @RequiresApi(21)
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@k Context context, @l Uri uri) {
            g0.p(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @l Uri uri) {
            g0.p(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final Uri parseResult(int i11, @l Intent intent) {
            if (i11 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@k Context context, @k String[] input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k String[] input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            g0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public final List<Uri> parseResult(int i11, @l Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i11 != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? h0.J() : clipDataUris$activity_release;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public Intent createIntent(@k Context context, @l Void r22) {
            g0.p(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            g0.o(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public Uri parseResult(int i11, @l Intent intent) {
            if (i11 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {

        @k
        public static final Companion Companion = new Companion(null);
        private final int maxItems;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int getMaxItems$activity_release() {
                int pickImagesMaxLimit;
                if (!PickVisualMedia.Companion.isSystemPickerAvailable$activity_release()) {
                    return Integer.MAX_VALUE;
                }
                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                return pickImagesMaxLimit;
            }

            private Companion() {
            }
        }

        public PickMultipleVisualMedia() {
            this(0, 1, null);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@k Context context, @k PickVisualMediaRequest input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        public /* synthetic */ PickMultipleVisualMedia(int i11, int i12, v vVar) {
            this((i12 & 1) != 0 ? Companion.getMaxItems$activity_release() : i11);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k PickVisualMediaRequest input) {
            int pickImagesMaxLimit;
            g0.p(context, "context");
            g0.p(input, "input");
            PickVisualMedia.Companion companion = PickVisualMedia.Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                int min = Math.min(this.maxItems, input.getMaxItems());
                if (min > 1) {
                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                    if (min <= pickImagesMaxLimit) {
                        intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", min);
                        intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().getValue());
                        intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", input.isOrderedSelection());
                        if (input.isCustomAccentColorApplied()) {
                            intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
                        }
                        return intent;
                    }
                }
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            }
            if (!companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent2;
            }
            ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
            if (systemFallbackPicker$activity_release == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
            Intent intent3 = new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
            intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent3.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
            int min2 = Math.min(this.maxItems, input.getMaxItems());
            if (min2 <= 1) {
                throw new IllegalArgumentException("Max items must be greater than 1");
            }
            intent3.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX, min2);
            intent3.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB, input.getDefaultTab().getValue());
            intent3.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER, input.isOrderedSelection());
            if (input.isCustomAccentColorApplied()) {
                intent3.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR, input.getAccentColor());
            }
            return intent3;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public final List<Uri> parseResult(int i11, @l Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i11 != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? h0.J() : clipDataUris$activity_release;
        }

        public PickMultipleVisualMedia(int i11) {
            this.maxItems = i11;
            if (i11 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {

        @k
        public static final String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";

        @k
        public static final Companion Companion = new Companion(null);

        @k
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR";

        @k
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER = "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER";

        @k
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB";

        @k
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        @k
        public static final String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";

        @k
        public static final String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @l
            @o
            public final ResolveInfo getSystemFallbackPicker$activity_release(@k Context context) {
                g0.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES), 1114112);
            }

            @l
            public final String getVisualMimeType$activity_release(@k VisualMediaType input) {
                g0.p(input, "input");
                if (input instanceof ImageOnly) {
                    return "image/*";
                }
                if (input instanceof VideoOnly) {
                    return "video/*";
                }
                if (input instanceof SingleMimeType) {
                    return ((SingleMimeType) input).getMimeType();
                }
                if (input instanceof ImageAndVideo) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            @o
            @n(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @w0(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity_release();
            }

            @o
            public final boolean isSystemFallbackPickerAvailable$activity_release(@k Context context) {
                g0.p(context, "context");
                return getSystemFallbackPicker$activity_release(context) != null;
            }

            @o
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isSystemPickerAvailable$activity_release() {
                int extensionVersion;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    return true;
                }
                if (i11 >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion >= 2) {
                        return true;
                    }
                }
                return false;
            }

            private Companion() {
            }

            @o
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable(@k Context context) {
                g0.p(context, "context");
                return isSystemPickerAvailable$activity_release() || isSystemFallbackPickerAvailable$activity_release(context);
            }

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class DefaultTab {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class AlbumsTab extends DefaultTab {

                @k
                public static final AlbumsTab INSTANCE = new AlbumsTab();
                private static final int value = 0;

                private AlbumsTab() {
                    super(null);
                }

                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                public int getValue() {
                    return value;
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class PhotosTab extends DefaultTab {

                @k
                public static final PhotosTab INSTANCE = new PhotosTab();
                private static final int value = 1;

                private PhotosTab() {
                    super(null);
                }

                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                public int getValue() {
                    return value;
                }
            }

            public /* synthetic */ DefaultTab(v vVar) {
                this();
            }

            public abstract int getValue();

            private DefaultTab() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class ImageAndVideo implements VisualMediaType {

            @k
            public static final ImageAndVideo INSTANCE = new ImageAndVideo();

            private ImageAndVideo() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class ImageOnly implements VisualMediaType {

            @k
            public static final ImageOnly INSTANCE = new ImageOnly();

            private ImageOnly() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class SingleMimeType implements VisualMediaType {

            @k
            private final String mimeType;

            public SingleMimeType(@k String mimeType) {
                g0.p(mimeType, "mimeType");
                this.mimeType = mimeType;
            }

            @k
            public final String getMimeType() {
                return this.mimeType;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class VideoOnly implements VisualMediaType {

            @k
            public static final VideoOnly INSTANCE = new VideoOnly();

            private VideoOnly() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface VisualMediaType {
        }

        @o
        @n(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @w0(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable() {
            return Companion.isPhotoPickerAvailable();
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@k Context context, @k PickVisualMediaRequest input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        @o
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable(@k Context context) {
            return Companion.isPhotoPickerAvailable(context);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k PickVisualMediaRequest input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Companion companion = Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().getValue());
                if (input.isCustomAccentColorApplied()) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
                }
                return intent;
            }
            if (!companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent2;
            }
            ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
            if (systemFallbackPicker$activity_release == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
            Intent intent3 = new Intent(ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
            intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent3.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
            intent3.putExtra(EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB, input.getDefaultTab().getValue());
            if (input.isCustomAccentColorApplied()) {
                intent3.putExtra(EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR, input.getAccentColor());
            }
            return intent3;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final Uri parseResult(int i11, @l Intent intent) {
            if (i11 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            return data == null ? (Uri) r0.L2(GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) : data;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,962:1\n12541#2,2:963\n8676#2,2:965\n9358#2,4:967\n11365#2:971\n11700#2,3:972\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n180#1:963,2\n185#1:965,2\n185#1:967,4\n196#1:971\n196#1:972,3\n*E\n"})
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {

        @k
        public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        @k
        public static final Companion Companion = new Companion(null);

        @k
        public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";

        @k
        public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @k
            public final Intent createIntent$activity_release(@k String[] input) {
                g0.p(input, "input");
                Intent putExtra = new Intent(RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(RequestMultiplePermissions.EXTRA_PERMISSIONS, input);
                g0.o(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }

            private Companion() {
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public Intent createIntent(@k Context context, @k String[] input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return Companion.createIntent$activity_release(input);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(@k Context context, @k String[] input) {
            g0.p(context, "context");
            g0.p(input, "input");
            if (input.length == 0) {
                return new ActivityResultContract.SynchronousResult<>(l1.z());
            }
            for (String str : input) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(input.length), 16));
            for (String str2 : input) {
                Pair a11 = h1.a(str2, Boolean.TRUE);
                linkedHashMap.put(a11.getFirst(), a11.getSecond());
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public Map<String, Boolean> parseResult(int i11, @l Intent intent) {
            if (i11 != -1) {
                return l1.z();
            }
            if (intent == null) {
                return l1.z();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
            int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return l1.z();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i12 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i12 == 0));
            }
            return l1.B0(r0.o6(a0.lb(stringArrayExtra), arrayList));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,962:1\n12774#2,2:963\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n212#1:963,2\n*E\n"})
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public Intent createIntent(@k Context context, @k String input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return RequestMultiplePermissions.Companion.createIntent$activity_release(new String[]{input});
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@k Context context, @k String input) {
            g0.p(context, "context");
            g0.p(input, "input");
            if (ContextCompat.checkSelfPermission(context, input) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public Boolean parseResult(int i11, @l Intent intent) {
            if (intent == null || i11 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
            boolean z11 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    if (intArrayExtra[i12] == 0) {
                        z11 = true;
                        break;
                    }
                    i12++;
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {

        @k
        public static final Companion Companion = new Companion(null);

        @k
        public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            private Companion() {
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public Intent createIntent(@k Context context, @k Intent input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return input;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public ActivityResult parseResult(int i11, @l Intent intent) {
            return new ActivityResult(i11, intent);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {

        @k
        public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        @k
        public static final Companion Companion = new Companion(null);

        @k
        public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        @k
        public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            private Companion() {
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public Intent createIntent(@k Context context, @k IntentSenderRequest input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent putExtra = new Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, input);
            g0.o(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public ActivityResult parseResult(int i11, @l Intent intent) {
            return new ActivityResult(i11, intent);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@k Context context, @k Uri input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k Uri input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            g0.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @k
        public final Boolean parseResult(int i11, @l Intent intent) {
            return Boolean.valueOf(i11 == -1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(@k Context context, @l Void r22) {
            g0.p(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @l Void r22) {
            g0.p(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final Bitmap parseResult(int i11, @l Intent intent) {
            if (i11 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    @n(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(@k Context context, @k Uri input) {
            g0.p(context, "context");
            g0.p(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @k
        public Intent createIntent(@k Context context, @k Uri input) {
            g0.p(context, "context");
            g0.p(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            g0.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @l
        public final Bitmap parseResult(int i11, @l Intent intent) {
            if (i11 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    private ActivityResultContracts() {
    }
}
