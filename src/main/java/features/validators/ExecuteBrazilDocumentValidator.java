package features.validators;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;
import br.com.caelum.stella.validation.*;

public class ExecuteBrazilDocumentValidator {

    private static final String CPF_VALID = "51202795030";
    private static final String CPF_INVALID = "51202795000";

    private static final String CNPJ_VALID = "04218409000130";
    private static final String CNPJ_INVALID = "04218409000100";

    private static final String VOTER_VALID = "570646500124";
    private static final String VOTER_INVALID = "570646500100";

    public static void execute() {

        validateDocument(new CPFValidator(), CPF_VALID);
        validateDocument(new CPFValidator(), CPF_INVALID);
        System.out.println("CPF Formatted: " + formatterDocument(new CPFFormatter(), CPF_VALID));
        System.out.println("CPF unformatted: " + unformatterDocument(new CPFFormatter(), CPF_VALID));
        System.out.println("");

        validateDocument(new CNPJValidator(), CNPJ_VALID);
        validateDocument(new CNPJValidator(), CNPJ_INVALID);
        System.out.println("CNPJ Formatted: " + formatterDocument(new CNPJFormatter(), CNPJ_VALID));
        System.out.println("CNPJ unformatted: " + unformatterDocument(new CNPJFormatter(), CNPJ_VALID));
        System.out.println("");

        validateDocument(new TituloEleitoralValidator(), VOTER_VALID);
        validateDocument(new TituloEleitoralValidator(), VOTER_INVALID);
        System.out.println("Voter Formatted: " + formatterDocument(new TituloEleitoralFormatter(), VOTER_VALID));
        System.out.println("Voter unformatted: " + unformatterDocument(new TituloEleitoralFormatter(), VOTER_VALID));
    }

    public static void validateDocument(Validator<String> validator, String document) {
        try {
            validator.assertValid(document);
        } catch (InvalidStateException e) {
            System.out.println(validator.getClass().getSimpleName() + ": invalid document " + document);
        }
    }

    public static String formatterDocument(Formatter formatter, String document) {
        return formatter.format(document);
    }

    public static String unformatterDocument(Formatter formatter, String document) {
        return formatter.unformat(document);
    }
}
