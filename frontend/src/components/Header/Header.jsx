import {HeaderContainer} from './style';
import HeaderImageComponent from '../HeaderImageComponent/HeaderImageComponent';
import imageHeader from '../../images/ImageHeader/imageHeader.png';

import { API_WHATSAPP, API_FACEBOOK, API_TELEGRAM } from '../../controls';
import { Links } from '../Links';

const Header = () => {
  return(
    <HeaderContainer>
      <HeaderImageComponent source={imageHeader} alternativeProp="Logo artes da bolota"/>
      <Links link={API_WHATSAPP} message="WhatsApp"></Links>
      <Links link={API_FACEBOOK} message="Facebook"></Links>
      <Links link={API_TELEGRAM} message="Telegram"></Links>
    </HeaderContainer>
  );
}

export default Header;