package classes.ads;

import java.util.Comparator;

public class PacienteComparator implements Comparator<Paciente> {

	public int compare(Paciente s1, Paciente s2) {
		if (s1.getRisco().equals(RiscoEnum.Vermelho)) {
			if (s2.getRisco().equals(RiscoEnum.Vermelho))
				return 1;
			if (s2.getRisco().equals(RiscoEnum.Amarelo))
				return -1;
			if (s2.getRisco().equals(RiscoEnum.Verde))
				return -1;
		}
		if (s1.getRisco().equals(RiscoEnum.Amarelo)) {
			if (s2.getRisco().equals(RiscoEnum.Vermelho))
				return 1;
			if (s2.getRisco().equals(RiscoEnum.Amarelo))
				return 1;
			if (s2.getRisco().equals(RiscoEnum.Verde))
				return -1;
		}
		if (s1.getRisco().equals(RiscoEnum.Verde)) {
			return 1;
		}
		return 0;
	}
}