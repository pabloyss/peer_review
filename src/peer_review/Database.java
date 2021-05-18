package peer_review;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private final List<Conferencia> conferencias;
    private final List<Pesquisador> pesquisadores;
    private final List<Artigo> artigos;
    private final List<RevisaoNotas> revisaoNotas;
    private final List<Universidade> universidades;
    private final List<TopicoPesquisa> topicosPesquisa;

    // Construtor

    public Database() {
		this(true);
	}

    public Database(boolean initData) {
        this.conferencias = new ArrayList<Conferencia>();
        this.pesquisadores = new ArrayList<Pesquisador>();
        this.artigos = new ArrayList<Artigo>();
        this.revisaoNotas = new ArrayList<RevisaoNotas>();
        this.universidades = new ArrayList<Universidade>();
        this.topicosPesquisa = new ArrayList<TopicoPesquisa>();
    if (initData) {
			initData();
		}
    }

    private void initData() {
		
			// Operation Location
            
            Universidade ufrgs = new Universidade("Universidade Federal do Rio Grande do Sul", "UFRGS");
            universidades.add(ufrgs);
            
            Universidade usp = new Universidade("Universidade Federal de Sao Paulo", "USP");
            universidades.add(usp);

            Universidade ufrj = new Universidade("Universidade Federal do Rio de Janeiro", "UFRJ");
            universidades.add(ufrj);
            

            
            TopicoPesquisa softwareProductLines = new TopicoPesquisa("Software Product Lines");
            topicosPesquisa.add(softwareProductLines);

            TopicoPesquisa softwareReuse = new TopicoPesquisa("Software Reuse");
            topicosPesquisa.add(softwareReuse);

            TopicoPesquisa modularity = new TopicoPesquisa("Modularity");
            topicosPesquisa.add(modularity);

            TopicoPesquisa softwareArchitecture = new TopicoPesquisa("Software Architecture");
            topicosPesquisa.add(softwareArchitecture);

            TopicoPesquisa aspectOrientedProgramming = new TopicoPesquisa("Aspect-oriented Programming");
            topicosPesquisa.add(aspectOrientedProgramming);

            TopicoPesquisa softwareTesting = new TopicoPesquisa("Software Testing");
            topicosPesquisa.add(softwareTesting);

            TopicoPesquisa softwareQuality = new TopicoPesquisa("Software Quality");
            topicosPesquisa.add(softwareQuality);



            int temp = 0;
            TopicoPesquisa[] tp1 = {softwareProductLines,softwareReuse, modularity};
            Pesquisador p1 = new Pesquisador(++temp,"Joao",ufrgs,tp1);
            pesquisadores.add(p1);

            TopicoPesquisa[] tp2 = {softwareArchitecture,modularity,softwareReuse};
            Pesquisador p2 = new Pesquisador(++temp,"Ana",usp,tp2);
            pesquisadores.add(p2);

            TopicoPesquisa[] tp3 = {softwareProductLines,softwareTesting};
            Pesquisador p3 = new Pesquisador(++temp,"Manoel",ufrgs,tp3);
            pesquisadores.add(p3);
            
            TopicoPesquisa[] tp4 = {softwareProductLines,softwareReuse,softwareArchitecture,aspectOrientedProgramming};
            Pesquisador p4 = new Pesquisador(++temp,"Joana",ufrj,tp4);
            pesquisadores.add(p4);

            TopicoPesquisa[] tp5 = {softwareArchitecture,modularity,softwareTesting};
            Pesquisador p5 = new Pesquisador(++temp,"Miguel",ufrgs,tp5);
            pesquisadores.add(p5);

            TopicoPesquisa[] tp6 = {softwareReuse,softwareTesting,aspectOrientedProgramming};
            Pesquisador p6 = new Pesquisador(++temp,"Beatriz",ufrj,tp6);
            pesquisadores.add(p6);

            TopicoPesquisa[] tp7 = {aspectOrientedProgramming,modularity,softwareReuse};
            Pesquisador p7 = new Pesquisador(++temp,"Suzana",ufrgs,tp7);
            pesquisadores.add(p7);

            TopicoPesquisa[] tp8 = {modularity,softwareReuse,softwareQuality,softwareProductLines};
            Pesquisador p8 = new Pesquisador(++temp,"Natasha",ufrj,tp8);
            pesquisadores.add(p8);

            TopicoPesquisa[] tp9 = {aspectOrientedProgramming,softwareArchitecture};
            Pesquisador p9 = new Pesquisador(++temp,"Pedro",usp,tp9);
            pesquisadores.add(p9);

            TopicoPesquisa[] tp10 = {softwareReuse,modularity,softwareTesting};
            Pesquisador p10 = new Pesquisador(++temp,"Carlos",usp,tp10);
            pesquisadores.add(p10);

         

            Pesquisador[] icsep = {p1,p2,p3,p4,p5,p6,p7};
			Conferencia icse = new Conferencia("ICSE",icsep);
            conferencias.add(icse);

            Pesquisador[] fsep = {p1,p2,p3,p4,p5,p6,p7};
			Conferencia fse = new Conferencia("FSE",fsep);
            conferencias.add(fse);

            Pesquisador[] sbesp = {p4,p5,p6,p7,p8,p9,p10};
            Conferencia sbes = new Conferencia("SBES",sbesp);
            conferencias.add(sbes);



            
            Artigo a1 = new Artigo(1,"Coupling and Cohesion",p1,sbes,modularity);
            artigos.add(a1);

            Artigo a2 = new Artigo(2,"Design Patterns",p6,fse,softwareReuse);
            artigos.add(a2);
        
            Artigo a3 = new Artigo(3,"AspectJ",p7,fse,aspectOrientedProgramming);
            artigos.add(a3);
            
            Artigo a4 = new Artigo(4,"Feature Model",p8,fse,softwareProductLines);
            artigos.add(a4);

            Artigo a5 = new Artigo(5,"Architecture Recovery",p9,fse,softwareArchitecture);
            artigos.add(a5);

            Artigo a6 = new Artigo(6,"Funcional Testing",p10,fse,softwareTesting);
            artigos.add(a6);

            Artigo a7 = new Artigo(7,"COTs",p6,icse,softwareReuse);
            artigos.add(a7);

            Artigo a8 = new Artigo(8,"Pointcut",p7,icse,aspectOrientedProgramming);
            artigos.add(a8);

            Artigo a9 = new Artigo(9,"Product Derivation",p8,icse,softwareProductLines);
            artigos.add(a9);

            Artigo a10 = new Artigo(10,"Architecture Comformance",p9,icse,softwareArchitecture);
            artigos.add(a10);

            Artigo a11 = new Artigo(11,"Structural Testing",p10,icse,softwareTesting);
            artigos.add(a11);
            
            for (Conferencia conferencia : this.conferencias) {
            	switch (conferencia.getSigla()) {
            	case "ICSE":
            		Artigo[] artigos = {a7, a8, a9, a10, a11};
            		conferencia.adicionaArtigo(artigos);
            		break;
            	case "SBES":
            		Artigo[] artigos1 = {a1};
            		conferencia.adicionaArtigo(artigos1);
            	case "FSE":
            		Artigo[] artigos2 = {a2, a3, a4, a5, a6};
            		conferencia.adicionaArtigo(artigos2);
            	}
            }



            
            RevisaoNotas r1 = new RevisaoNotas(a1,p8,2);
            revisaoNotas.add(r1);

            RevisaoNotas r2 = new RevisaoNotas(a1,p10);
            revisaoNotas.add(r2);

            RevisaoNotas r3 = new RevisaoNotas(a2,p7,2);
            revisaoNotas.add(r3);

            RevisaoNotas r4 = new RevisaoNotas(a2,p2,3);
            revisaoNotas.add(r4);

            RevisaoNotas r5 = new RevisaoNotas(a3,p4,-1);
            revisaoNotas.add(r5);

            RevisaoNotas r6 = new RevisaoNotas(a3,p6,1);
            revisaoNotas.add(r6);

            RevisaoNotas r7 = new RevisaoNotas(a4,p1,1);
            revisaoNotas.add(r7);

            RevisaoNotas r8 = new RevisaoNotas(a4,p3,0);
            revisaoNotas.add(r8);

            RevisaoNotas r9 = new RevisaoNotas(a5,p4,-3);
            revisaoNotas.add(r9);

            RevisaoNotas r10 = new RevisaoNotas(a5,p5,-3);
            revisaoNotas.add(r10);

            RevisaoNotas r11 = new RevisaoNotas(a6,p3,-1);
            revisaoNotas.add(r11);
            
            RevisaoNotas r12 = new RevisaoNotas(a6,p6,0);
            revisaoNotas.add(r12);

		
	}

    public List<Artigo> buscaTodosArtigos() {
        return this.artigos;
    }
    
    public List<Artigo> buscaArtigosConferencia(String sigla){
        List<Artigo> artigosConferencia = new ArrayList<Artigo>();
        for(int i = 0; i < artigos.size(); i++)
    	{
    		if(sigla == artigos.get(i).getConferencia().getSigla()){
                artigosConferencia.add(artigos.get(i));
            }
    	}
        return artigosConferencia;
    }

    public List<Pesquisador> buscaTodosPesquisadores() {
        return this.pesquisadores;
    }

    public Boolean existeConferencia(String sigla){
    	for(Conferencia conferencia : this.conferencias) {
    		if(sigla.toUpperCase().equals(conferencia.getSigla())) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public Conferencia pegaConferencia(String sigla) {
    	for (Conferencia conferencia : this.conferencias) {
    		if (conferencia.getSigla().equals(sigla.toUpperCase())) {
    			return conferencia;
    		}
    	}
		return null;
    }
    
    public Boolean artigoTemNota(Artigo artigo) {
    	for (RevisaoNotas revisao : this.revisaoNotas) {
    		if (revisao.getArtigo().equals(artigo)) {
    			if (revisao.getNota() != -5) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    public Double pegaMediaNota(Artigo artigo) {
    	Double media = 0.0;
    	for (RevisaoNotas revisao : this.revisaoNotas) {
    		media += revisao.getNota();
    	}
    	return media / this.revisaoNotas.size();
    }
    
    public List<RevisaoNotas> pegaTodasNotas() {
        return this.revisaoNotas;
    }
    
    public void salvaNota(RevisaoNotas nota) {
        this.revisaoNotas.add(nota);
    }
}
