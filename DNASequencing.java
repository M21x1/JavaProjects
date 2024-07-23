public class DNASequencing {
    public static void main(String[] args) {

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // Test each DNA strand
        checkForProtein(dna1);
        checkForProtein(dna2);
        checkForProtein(dna3);
    }

    public static void checkForProtein(String dna) {
        System.out.println("Analyzing DNA strand: " + dna);
        int length = dna.length();
        System.out.println("Length of DNA: " + length);

        int startCodonIndex = dna.indexOf("ATG");
        int stopCodonIndex = dna.indexOf("TGA");
// stopCodonIndex - startCodonIndex (1st option)
// dna.length() (2nd option)
        // Compare to -1 to see if the startCondonIndex exists, likewise for stop...
        if (startCodonIndex != -1 && stopCodonIndex != -1 && (stopCodonIndex - startCodonIndex) % 3 == 0) {
            String protein = dna.substring(startCodonIndex, stopCodonIndex + 3);
            System.out.println("Contains a protein: " + protein);
        } else {
            System.out.println("Does not contain a protein.");
        }
        System.out.println(); // For better readability of output
    }
}
