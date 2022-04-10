package ExpenseManager;

public class Denomination {
	public void NotesDenomination(int[] deno, int amt) {

		int[] notes = new int[deno.length];

		for (int i=0; i < deno.length; i++) {

			if (amt >= deno[i]) {
				notes[i] = amt / deno[i];
				amt = amt - (deno[i] * notes[i]);
			}

		}

		if (amt > 0) {
			System.out.println("Notes not Sufficient");
		}
		else
		{
			for(int i=0; i<notes.length; i++) {
				if (notes[i]!=0) 
				System.out.println("Notes " + deno[i] + " : "+ notes[i] );
			}
		}
	}
}
