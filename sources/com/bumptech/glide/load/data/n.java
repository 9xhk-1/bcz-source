package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresExtension;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class n extends l<InputStream> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f28769f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f28770g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f28771h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final int f28772i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final int f28773j = 5;

    /* renamed from: k, reason: collision with root package name */
    public static final UriMatcher f28774k;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f28774k = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.l
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InputStream b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream f11 = f(uri, contentResolver);
        if (f11 != null) {
            return f11;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    public final InputStream f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f28774k.match(uri);
        if (match != 1) {
            if (match == 3) {
                return g(contentResolver, uri);
            }
            if (match != 5) {
                return (this.f28765a && jk.b.d(uri) && jk.b.c()) ? h(uri, contentResolver) : contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return g(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    public final InputStream g(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @RequiresExtension(extension = 30, version = 17)
    public final InputStream h(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor h11 = jk.b.h(uri, contentResolver);
        if (h11 != null) {
            try {
                return h11.createInputStream();
            } catch (IOException e11) {
                try {
                    h11.close();
                } catch (Exception unused) {
                }
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e11));
            }
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    public n(ContentResolver contentResolver, Uri uri, boolean z11) {
        super(contentResolver, uri, z11);
    }
}
