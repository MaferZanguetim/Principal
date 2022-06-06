public class Principal {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Maria");
        pf.setEndereco("Tiradentes 23");
        pf.setCpf(23231456);

        System.out.println(pf.getNome());
        System.out.println(pf.getEndereco());
        System.out.println(pf.getCpf());

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Lucas");
        pj.setEndereco("Portugal 07");
        pj.setCnpj(45986321);

        System.out.println(pj.getNome());
        System.out.println(pj.getEndereco());
        System.out.println(pj.getCnpj());
    }
    
}
