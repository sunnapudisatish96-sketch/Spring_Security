INSERT INTO users (username, password, enabled) VALUES 
('satish', '{noop}12345', true);

INSERT INTO authorities (username, authority) VALUES 
('satish', 'ROLE_USER');
