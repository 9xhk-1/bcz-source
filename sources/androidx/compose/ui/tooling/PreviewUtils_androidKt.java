package androidx.compose.ui.tooling;

import a00.g0;
import a00.h0;
import a00.m0;
import a00.r0;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import q30.m;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPreviewUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewUtils.android.kt\nandroidx/compose/ui/tooling/PreviewUtils_androidKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,160:1\n3133#2,11:161\n12474#2,2:179\n1109#2,2:181\n1#3:172\n1549#4:173\n1620#4,3:174\n37#5,2:177\n*S KotlinDebug\n*F\n+ 1 PreviewUtils.android.kt\nandroidx/compose/ui/tooling/PreviewUtils_androidKt\n*L\n50#1:161,11\n86#1:179,2\n89#1:181,2\n60#1:173\n60#1:174,3\n61#1:177,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PreviewUtils_androidKt {
    @l
    public static final Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass(@k String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            PreviewLogger.Companion.logError$ui_tooling_release("Unable to find PreviewProvider '" + str + '\'', e11);
            return null;
        }
    }

    @k
    public static final List<Group> findAll(@k Group group, @k x00.l<? super Group, Boolean> lVar) {
        return findGroupsThatMatchPredicate$default(group, lVar, false, 4, null);
    }

    private static final List<Group> findGroupsThatMatchPredicate(Group group, x00.l<? super Group, Boolean> lVar, boolean z11) {
        ArrayList arrayList = new ArrayList();
        List U = h0.U(group);
        while (!U.isEmpty()) {
            Group group2 = (Group) m0.Q0(U);
            if (lVar.invoke(group2).booleanValue()) {
                if (z11) {
                    return g0.l(group2);
                }
                arrayList.add(group2);
            }
            U.addAll(group2.getChildren());
        }
        return arrayList;
    }

    public static /* synthetic */ List findGroupsThatMatchPredicate$default(Group group, x00.l lVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return findGroupsThatMatchPredicate(group, lVar, z11);
    }

    @l
    public static final Group firstOrNull(@k Group group, @k x00.l<? super Group, Boolean> lVar) {
        return (Group) r0.L2(findGroupsThatMatchPredicate(group, lVar, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001a, code lost:
    
        r5 = null;
     */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object[] getPreviewProviderParameters(@m80.l java.lang.Class<? extends androidx.compose.ui.tooling.preview.PreviewParameterProvider<?>> r9, int r10) {
        /*
            r0 = 0
            if (r9 == 0) goto L89
            java.lang.reflect.Constructor[] r9 = r9.getConstructors()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            int r1 = r9.length     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            r2 = 0
            r3 = r0
            r4 = r3
            r5 = r2
        Lc:
            r6 = 1
            if (r3 >= r1) goto L21
            r7 = r9[r3]     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            int r8 = r8.length     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            if (r8 != 0) goto L1e
            if (r4 == 0) goto L1c
        L1a:
            r5 = r2
            goto L24
        L1c:
            r4 = r6
            r5 = r7
        L1e:
            int r3 = r3 + 1
            goto Lc
        L21:
            if (r4 != 0) goto L24
            goto L1a
        L24:
            if (r5 == 0) goto L79
            r5.setAccessible(r6)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.lang.Object r9 = r5.newInstance(r2)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>"
            kotlin.jvm.internal.g0.n(r9, r1)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            androidx.compose.ui.tooling.preview.PreviewParameterProvider r9 = (androidx.compose.ui.tooling.preview.PreviewParameterProvider) r9     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            if (r10 >= 0) goto L43
            q30.m r10 = r9.getValues()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            int r9 = r9.getCount()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.lang.Object[] r9 = toArray(r10, r9)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            return r9
        L43:
            q30.m r9 = r9.getValues()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.lang.Object r9 = q30.k0.L0(r9, r10)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.util.List r9 = a00.g0.l(r9)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            r1 = 10
            int r1 = a00.i0.d0(r9, r1)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            r10.<init>(r1)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.util.Iterator r9 = r9.iterator()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
        L60:
            boolean r1 = r9.hasNext()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            if (r1 == 0) goto L72
            java.lang.Object r1 = r9.next()     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.lang.Object r1 = unwrapIfInline(r1)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            r10.add(r1)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            goto L60
        L72:
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.lang.Object[] r9 = r10.toArray(r9)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            return r9
        L79:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            java.lang.String r10 = "PreviewParameterProvider constructor can not have parameters"
            r9.<init>(r10)     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
            throw r9     // Catch: kotlin.jvm.KotlinReflectionNotSupportedError -> L81
        L81:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle."
            r9.<init>(r10)
            throw r9
        L89:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.PreviewUtils_androidKt.getPreviewProviderParameters(java.lang.Class, int):java.lang.Object[]");
    }

    private static final Object[] toArray(m<? extends Object> mVar, int i11) {
        Iterator<? extends Object> it = mVar.iterator();
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = it.next();
        }
        return objArr;
    }

    private static final Object unwrapIfInline(Object obj) {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof h) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }
}
