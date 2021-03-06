package demo.nullable_types_and_interop;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JNullableTypesExample {

    public void sendMessageToClient(
            @Nullable Client client,
            @Nullable String message,
            @NotNull Mailer mailer
    ) {
        if (client == null || message == null) return;

        PersonalInfo personalInfo = client.getPersonalInfo();
        if (personalInfo == null) return;

        String email = personalInfo.getEmail();
        if (email == null) return;

        mailer.sendMessage(email, message);
    }
}
