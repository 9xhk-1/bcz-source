package androidx.compose.ui.autofill;

import androidx.autofill.HintConstants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ContentType {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @m80.k
        private static final ContentType Username = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_USERNAME);

        @m80.k
        private static final ContentType Password = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PASSWORD);

        @m80.k
        private static final ContentType EmailAddress = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);

        @m80.k
        private static final ContentType NewUsername = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_NEW_USERNAME);

        @m80.k
        private static final ContentType NewPassword = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);

        @m80.k
        private static final ContentType PostalAddress = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS);

        @m80.k
        private static final ContentType PostalCode = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_CODE);

        @m80.k
        private static final ContentType CreditCardNumber = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER);

        @m80.k
        private static final ContentType CreditCardSecurityCode = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE);

        @m80.k
        private static final ContentType CreditCardExpirationDate = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE);

        @m80.k
        private static final ContentType CreditCardExpirationMonth = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH);

        @m80.k
        private static final ContentType CreditCardExpirationYear = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR);

        @m80.k
        private static final ContentType CreditCardExpirationDay = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY);

        @m80.k
        private static final ContentType AddressCountry = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY);

        @m80.k
        private static final ContentType AddressRegion = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION);

        @m80.k
        private static final ContentType AddressLocality = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY);

        @m80.k
        private static final ContentType AddressStreet = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS);

        @m80.k
        private static final ContentType AddressAuxiliaryDetails = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS);

        @m80.k
        private static final ContentType PostalCodeExtended = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE);

        @m80.k
        private static final ContentType PersonFullName = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME);

        @m80.k
        private static final ContentType PersonFirstName = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN);

        @m80.k
        private static final ContentType PersonLastName = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY);

        @m80.k
        private static final ContentType PersonMiddleName = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE);

        @m80.k
        private static final ContentType PersonMiddleInitial = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL);

        @m80.k
        private static final ContentType PersonNamePrefix = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX);

        @m80.k
        private static final ContentType PersonNameSuffix = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX);

        @m80.k
        private static final ContentType PhoneNumber = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PHONE_NUMBER);

        @m80.k
        private static final ContentType PhoneNumberDevice = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE);

        @m80.k
        private static final ContentType PhoneCountryCode = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE);

        @m80.k
        private static final ContentType PhoneNumberNational = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PHONE_NATIONAL);

        @m80.k
        private static final ContentType Gender = ContentType_androidKt.ContentType("gender");

        @m80.k
        private static final ContentType BirthDateFull = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL);

        @m80.k
        private static final ContentType BirthDateDay = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY);

        @m80.k
        private static final ContentType BirthDateMonth = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH);

        @m80.k
        private static final ContentType BirthDateYear = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR);

        @m80.k
        private static final ContentType SmsOtpCode = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_SMS_OTP);

        private Companion() {
        }

        @m80.k
        public final ContentType getAddressAuxiliaryDetails() {
            return AddressAuxiliaryDetails;
        }

        @m80.k
        public final ContentType getAddressCountry() {
            return AddressCountry;
        }

        @m80.k
        public final ContentType getAddressLocality() {
            return AddressLocality;
        }

        @m80.k
        public final ContentType getAddressRegion() {
            return AddressRegion;
        }

        @m80.k
        public final ContentType getAddressStreet() {
            return AddressStreet;
        }

        @m80.k
        public final ContentType getBirthDateDay() {
            return BirthDateDay;
        }

        @m80.k
        public final ContentType getBirthDateFull() {
            return BirthDateFull;
        }

        @m80.k
        public final ContentType getBirthDateMonth() {
            return BirthDateMonth;
        }

        @m80.k
        public final ContentType getBirthDateYear() {
            return BirthDateYear;
        }

        @m80.k
        public final ContentType getCreditCardExpirationDate() {
            return CreditCardExpirationDate;
        }

        @m80.k
        public final ContentType getCreditCardExpirationDay() {
            return CreditCardExpirationDay;
        }

        @m80.k
        public final ContentType getCreditCardExpirationMonth() {
            return CreditCardExpirationMonth;
        }

        @m80.k
        public final ContentType getCreditCardExpirationYear() {
            return CreditCardExpirationYear;
        }

        @m80.k
        public final ContentType getCreditCardNumber() {
            return CreditCardNumber;
        }

        @m80.k
        public final ContentType getCreditCardSecurityCode() {
            return CreditCardSecurityCode;
        }

        @m80.k
        public final ContentType getEmailAddress() {
            return EmailAddress;
        }

        @m80.k
        public final ContentType getGender() {
            return Gender;
        }

        @m80.k
        public final ContentType getNewPassword() {
            return NewPassword;
        }

        @m80.k
        public final ContentType getNewUsername() {
            return NewUsername;
        }

        @m80.k
        public final ContentType getPassword() {
            return Password;
        }

        @m80.k
        public final ContentType getPersonFirstName() {
            return PersonFirstName;
        }

        @m80.k
        public final ContentType getPersonFullName() {
            return PersonFullName;
        }

        @m80.k
        public final ContentType getPersonLastName() {
            return PersonLastName;
        }

        @m80.k
        public final ContentType getPersonMiddleInitial() {
            return PersonMiddleInitial;
        }

        @m80.k
        public final ContentType getPersonMiddleName() {
            return PersonMiddleName;
        }

        @m80.k
        public final ContentType getPersonNamePrefix() {
            return PersonNamePrefix;
        }

        @m80.k
        public final ContentType getPersonNameSuffix() {
            return PersonNameSuffix;
        }

        @m80.k
        public final ContentType getPhoneCountryCode() {
            return PhoneCountryCode;
        }

        @m80.k
        public final ContentType getPhoneNumber() {
            return PhoneNumber;
        }

        @m80.k
        public final ContentType getPhoneNumberDevice() {
            return PhoneNumberDevice;
        }

        @m80.k
        public final ContentType getPhoneNumberNational() {
            return PhoneNumberNational;
        }

        @m80.k
        public final ContentType getPostalAddress() {
            return PostalAddress;
        }

        @m80.k
        public final ContentType getPostalCode() {
            return PostalCode;
        }

        @m80.k
        public final ContentType getPostalCodeExtended() {
            return PostalCodeExtended;
        }

        @m80.k
        public final ContentType getSmsOtpCode() {
            return SmsOtpCode;
        }

        @m80.k
        public final ContentType getUsername() {
            return Username;
        }
    }

    @m80.k
    ContentType plus(@m80.k ContentType contentType);
}
