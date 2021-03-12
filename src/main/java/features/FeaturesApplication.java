package features;

import features.java8.bifunction.ExecuteBiFunction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeaturesApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeaturesApplication.class, args);

        // Java 8
        // ForEach.execute();
        // ExecuteInterfaceMethod.execute();
        // ExecuteStreamAPI.execute();
        // ExecuteDates.execute();
        //ExecuteStreams.execute();
        // ExecuteInterfaceMethod.execute();
        // ExecuteReferenceMethod.execute();
        ExecuteBiFunction.execute();

        // Java 9
        // ExecuteImmutable.execute();
        // ExecutePrivateInterface.execute();
        // ExecuteProcessHandle.execute();
        // ExecuteResourceReader.execute();

        // Java 10
        // ExecuteVar.execute();
        // ExecuteNewApis.execute();
        // ExecuteTimeBasedVersioning.execute();

        // Java 11
        // ExecuteStringMethods.execute();
        // ExecuteNestAccessControl executeNestAccessControl = new ExecuteNestAccessControl();
        // executeNestAccessControl.execute();

        // Java 12
        // ExecuteSwitchExpression.execute();
        // ExecuteFileMismatch.execute();

        // Validators
        //ExecuteBrazilDocumentValidator.execute();

        // Certification
        //ExecutePrimitiveTypes.execute();
        //ExecuteCertificationStreams.execute();

    }

}
