import {HeaderContainer} from './style';
import HeaderImageComponent from '../HeaderImageComponent/HeaderImageComponent';
import imageHeader from '../../images/ImageHeader/imageHeader.png';
import { Products } from '../../Views/Product/index';

import { API_WHATSAPP, API_FACEBOOK, API_TELEGRAM } from '../../controls';
import { Links } from '../Links';

const Header = () => {
  return(
    <HeaderContainer>
      <HeaderImageComponent source={imageHeader} alternativeProp="Logo artes da bolota"/>
      <Links link={API_WHATSAPP} message="WhatsApp"/>
      <Links link={API_FACEBOOK} message="Facebook"/>
      <Links link={API_TELEGRAM} message="Telegram"/>
      <Links link='/products' message="Products" isComponent={true}/>
    </HeaderContainer>
  );
}

export default Header;