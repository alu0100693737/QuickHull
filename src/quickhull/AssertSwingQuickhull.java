package quickhull;

import java.awt.Color;

import org.assertj.core.api.Assertions;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.edt.GuiQuery;
import org.assertj.swing.fixture.FrameFixture;
import static java.awt.event.KeyEvent.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertSwingQuickhull {
		
		private FrameFixture window;
		private controllerQuickhull frame;
		private String PUNTOSPRUEBA = "30";
		private String PUNTOSPRUEBA1 = "40";
		private String VELOCIDAD = "1000";

		@Before
		public void setUp() {
			frame = new controllerQuickhull(PUNTOSPRUEBA, VELOCIDAD);
			
		  frame.setVentana(GuiActionRunner.execute(new GuiQuery<jfrAplicacion>() {
		    protected jfrAplicacion executeInEDT() {
		      return new jfrAplicacion(Integer.parseInt(PUNTOSPRUEBA));
		    }
		  }));
		  window = new FrameFixture(frame.getVentana());
		  //window.show(); // shows the frame to test
		}
		
		/*@Test
		public void debeCopiarLaDensidadCuandoEnter() {
			//window.textBox(frame.getpnlOpciones().gettxtIntroducir().getText()).enterText(DENSIDADPRUEBA);
			window.textBox(frame.getpnlOpciones().gettxtIntroducir().getText()).pressAndReleaseKeys(VK_ENTER);
			//int aux = ((650 - frame.getpnlAplicacion().MARGEN_CUADRICULA * 2) / 10);
			Assertions.assertThat(frame.getpnlAplicacion().getSeparacionPixeles()).isEqualTo(300);
		}*/
		
		@Test
		public void mismosColores2Botones() {
			Assertions.assertThat(frame.getVentana().getpnlOpciones().getArrayButones().getColor().getBackground()).isEqualTo(
																	frame.getVentana().getpnlOpciones().getCambiarNum().getBackground());			
		}
		
		@Test
		public void cambioColoresClick() {
			Color aux = frame.getVentana().getpnlOpciones().getArrayButones().getColor().getBackground();
			window.button(frame.getVentana().getpnlOpciones().getArrayButones().getColor().getName()).click();
			Assertions.assertThat(frame.getVentana().getpnlOpciones().getArrayButones().getColor().getBackground()).hasSameClassAs(aux);
			Assertions.assertThat(frame.getVentana().getpnlOpciones().getArrayButones().getColor().getBackground()).isNotEqualTo(aux);	
		}
		
		@Test
		public void colorFondoPanelOpciones() {
			Assertions.assertThat(controllerQuickhull.getVentana().getpnlOpciones().getBackground()).isEqualTo(Color.white);
		}
		
		/*@Test
		public void pruebaClick() {
			//Assertions.assertThat(frame.getpnlOpciones().getBackground()).isEqualTo(Color.BLACK);
			
			window.textBox(frame.getVentana().getpnlOpciones().getCambiarNum().getName()).enterText(PUNTOSPRUEBA);
			window.textBox(frame.getVentana().getpnlOpciones().getCambiarNum().getText()).pressKey(VK_ENTER);
			Assertions.assertThat(frame.getVentana().getpnlAplicacion().getNumPuntos()).isNotEqualTo(PUNTOSPRUEBA);
			/*window.textBox(frame.getVentana().getpnlOpciones().getCambiarNum().getText()).enterText(PUNTOSPRUEBA1);
			window.textBox(frame.getVentana().getpnlOpciones().getCambiarNum().getText()).pressAndReleaseKeys(VK_ENTER);
			Assertions.assertThat(frame.getVentana().getpnlAplicacion().getNumPuntos()).isEqualTo(Integer.parseInt(PUNTOSPRUEBA1));
		}*/
		
		@After
		public void tearDown() {
			window.cleanUp();
		}

}
